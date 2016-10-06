package Communication;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Queue;

public class PortSpeaker extends Thread {
	private Queue<byte[]> outQueue;
	private OutputStream outStream;
	private boolean stopping = false;
	private final long INTER_WRITE_WAIT_TIME = 30;

	public PortSpeaker(SerialCommunicator com) {
		super();
		outQueue = com.getOutQueue();
		outStream = com.getOutStream();
	}
	
	public void close() {
		stopping = true;
	}
	

	public void run() {
		System.out.println("Info: PortSpeaker started");
		while (!stopping) {
			byte[] data = null;
			synchronized (outQueue){
				data = outQueue.poll();
			}
			if (data != null) {
				try {
					outStream.write(data);
					//outStream.flush();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			try {
				Thread.sleep(INTER_WRITE_WAIT_TIME);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Info: PortSpeaker stopped");
	}
	

}
