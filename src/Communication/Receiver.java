/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Communication;


import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Receiver extends Thread{

    /**
     * @param args the command line arguments
     */
    
    @Override
    public void run() {
       
        String serialcom=JOptionPane.showInputDialog(null,"Enter the Serial port connected to the GSM modem. ex \"COM6");
        SerialCommunicator sc = new SerialCommunicator(serialcom);
        sc.connect();
        
        
        
        sc.send("AT+CMGL=\"ALL\"\r\n");
        sc.sleep(3000);
             
     }

}


