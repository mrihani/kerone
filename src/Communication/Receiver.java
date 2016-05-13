/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Communication;

import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Receiver extends Thread {

    SerialCommunicator sc;
    final String VM_GPOS = "go";
    final String VM_RTOS = "ro";
    final String VM_Service = "sv";

    public Receiver(SerialCommunicator sc) {
        this.sc = sc;
    }

    @Override
    public void run() {

        //  String serialcom=JOptionPane.showInputDialog(null,"Enter the Serial port connected to the GSM modem. ex \"COM6");
        //   SerialCommunicator sc = new SerialCommunicator(serialcom);
        //      sc.connect();
        String command;
        while (true) {
            command = sc.getReply();
            if (command != null) {
                String[] s = command.split(" ");
                if (s.length > 0) {
                    if (s[0].equals("INIT")) {
                        int VM_count = Integer.parseInt(s[1]);
                        LinkedList<String> VM_TYPE_LL = new LinkedList<String>();
                        LinkedList<String> VM_PRIO_LL = new LinkedList<String>();
                        for (int i = 3; i < (VM_count * 2); i++) {
                            if ((i % 2) == 0) {
                                String type = s[i];
                                String vm="";
                                switch (type) {
                                    case VM_GPOS:
                                        vm = "GPOS";
                                        break;
                                    case VM_RTOS:
                                        vm = "RTOS";
                                        break;
                                    case VM_Service:
                                        vm = "Service";
                                        break;

                                }
                                 VM_TYPE_LL.add(vm);
                            } else {
                                VM_PRIO_LL.add(s[i]);
                            }
                        }

                        intialize_VM(VM_count, VM_TYPE_LL, VM_PRIO_LL);
                    }
                }
            }

        }
    }

    private void intialize_VM(int VM_count, LinkedList<String> VM_TYPE_LL, LinkedList<String> VM_PRIO_LL) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
