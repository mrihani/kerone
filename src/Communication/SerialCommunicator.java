package Communication;

import gnu.io.CommPort;
import gnu.io.CommPortIdentifier;
import gnu.io.SerialPort;
import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.*;

public class SerialCommunicator implements SerialPortEventListener {

	private String comPort;
	private int baudRate = 57600;
	private int dataBits = SerialPort.DATABITS_8;
	private int flowControl = SerialPort.FLOWCONTROL_NONE;
	private int parity = SerialPort.PARITY_NONE;
	private int stopBits = SerialPort.STOPBITS_1;
	private CommPortIdentifier portIdentifier;
	
	private SerialPort serialPort;
	private InputStream inStream;
	private OutputStream outStream;
	
	private boolean connected = false;
	
	private Queue<byte[]> outQueue = new LinkedList<byte[]>();
        private Queue<String> inQueue = new LinkedList<String>();
	private PortSpeaker speaker;
	
	private final int CONNECT_TIMEOUT = 2000;
	public static final long SHORT_WAIT = 20;
	public static long MEDIUM_WAIT = 100;
	public static long LONG_WAIT = 1000;
	
	private final char END_OF_TX = '\n';
	
	private byte[] readBuffer = new byte[64];
	private int bufferIndex = 0;
	private String reply = "";

	public SerialCommunicator(String comPort, int baudRate, int dataBits,
			int flowControl, int parity, int stopBits) {
		this.comPort = comPort;
		this.baudRate = baudRate;
		this.dataBits = dataBits;
		this.flowControl = flowControl;
		this.parity = parity;
		this.stopBits = stopBits;
	}

	public SerialCommunicator(String comPort) {
		this.comPort = comPort;
	}

	public boolean connect() {
		try {
			portIdentifier = CommPortIdentifier.getPortIdentifier(comPort);
			if (portIdentifier.isCurrentlyOwned()) {
				System.out.println("Error: Port is currently in use");
			} else {

				CommPort commPort = portIdentifier.open(this.getClass().getName(), CONNECT_TIMEOUT);
				if (commPort instanceof SerialPort) {
					serialPort = (SerialPort) commPort;
					serialPort.setSerialPortParams(baudRate, dataBits, stopBits, parity);
					serialPort.setFlowControlMode(flowControl);
					serialPort.notifyOnDataAvailable(true);
					inStream = serialPort.getInputStream();
					outStream = serialPort.getOutputStream();
				} else {
					System.out.println("Error: Port is not Serial");
					connected = false;
					return false;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			serialPort.addEventListener(this);
			System.out.println("Info: EventListener attached");
		} catch (TooManyListenersException e) {
			e.printStackTrace();
		}

		speaker = new PortSpeaker(this);
		speaker.start();

		sleep(LONG_WAIT);
		
		connected = true;
		return true;
	}

	public void disconnect() {
		if (!connected)
			return;

		
		speaker.close();
		serialPort.removeEventListener();
		System.out.println("Info: EventListener dettached");
		sleep(LONG_WAIT);
		
		try {
			inStream.close();
			outStream.close();
			System.out.println("Info: Closed streams");
		} catch (Exception e) {
			System.out.println(e);
		}

		sleep(LONG_WAIT);
		
		serialPort.close();
		System.out.println("Info: Closed port");
		serialPort = null;
		connected = false;
	}

	public void send(byte[] data) {
		synchronized (outQueue) {
			outQueue.offer(data);
		}
	}
	
	public void send(String data) {
		send(data.getBytes());
	}
	
	public void send(String data, long wait) {
		send(data.getBytes());
		sleep(wait);
	}

	public Queue<byte[]> getOutQueue() {
		return outQueue;
	}

	public InputStream getInStream() {
		return inStream;
	}

	public OutputStream getOutStream() {
		return outStream;
	}

	public boolean isConnected() {
		return connected;
	}

	public void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getReply() {
		synchronized(inQueue) {
                        if (inQueue.isEmpty())
                            return (null);
			return inQueue.poll();
		}
	}

	public void serialEvent(SerialPortEvent event) {
		int numBytes = -1;
		byte[] singleton = new byte[1];
		switch (event.getEventType()) {
		case SerialPortEvent.BI:
		case SerialPortEvent.OE:
		case SerialPortEvent.FE:
		case SerialPortEvent.PE:
		case SerialPortEvent.CD:
		case SerialPortEvent.CTS:
		case SerialPortEvent.DSR:
		case SerialPortEvent.RI:
		case SerialPortEvent.OUTPUT_BUFFER_EMPTY:
			break;

		case SerialPortEvent.DATA_AVAILABLE: 

			try {
				while (inStream.available() > 0) {
					numBytes = inStream.read(singleton);

					if (numBytes > 0) {
						readBuffer[bufferIndex] = singleton[0];
						bufferIndex++;

						if (singleton[0] == END_OF_TX) {
							synchronized(inQueue) {
								reply = new String(readBuffer, 0, bufferIndex);
                                                                inQueue.offer(reply);
								bufferIndex = 0;
							}
						}
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			break;
		}
	}
}
