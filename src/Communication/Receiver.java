/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Communication;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Receiver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FileWriter f = null;
        try {
            // TODO code application logic here
            String serialcom=JOptionPane.showInputDialog(null,"Enter the Serial port connected to the GSM modem. ex \"COM6");
            SerialCommunicator sc = new SerialCommunicator(serialcom);
            sc.connect();
            String rp;

            PrintWriter o = null;
            f = new FileWriter("C:\\GSM Data\\data.txt");
            o = new PrintWriter(f);
            //while(true)
            //{
            sc.send("AT+CMGL=\"ALL\"\r\n");
            sc.sleep(3000);
            int j = 1;
            while (j == 1) {
                rp = sc.getReply();
                sc.sleep(1000);
                if (rp != null) {
                    rp = rp.trim();
                }
                if (!rp.equals("OK")) {
                    o.append(rp);
                    o.println();
                } else {
                    System.out.println("finish deleting");
                    j = 0;
                    o.close();
                    //sc.send("AT+CMGD=\"ALL\"\r\n");
                    //sc.sleep(3000);
                    //sc.getReply();
                    sc.disconnect();
                }
            }

    File r = new File ("C:\\GSM Data\\data.txt");
    Scanner scan = new Scanner(r);
    String sender="";
    String [] s;
    try{
    scan.nextLine();
    scan.nextLine();
            }
    catch(Exception e)
    {
        e.printStackTrace();
    }
    String text="";
    int n=0;

    while (scan.hasNext())
    {
    s=scan.nextLine().split(",");
    if(s.length>2)
    {
    sender = s[2];    
        }
    text = scan.nextLine();
if (sender.equals("\"+9613728732\""))
{
    f = new FileWriter("C:\\Received data\\"+n+".txt");
    o = new PrintWriter(f);
    o.print(text);
    o.close();

}
            }
    scan.close();


        } catch (IOException ex) {
            Logger.getLogger(Receiver.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                f.close();
            } catch (IOException ex) {
                Logger.getLogger(Receiver.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
          


    
    
    
    }
     }


