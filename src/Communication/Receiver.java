/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Communication;

import java.awt.Point;
import java.util.LinkedList;
import kerone_demo.Main_Frame;
import kerone_demo.PL_Frame;
import kerone_demo.PS_Gantt_Chart_Tasks;
import kerone_demo.PS_Gantt_Chart_VM;

/**
 *
 * @author user
 */
public class Receiver extends Thread {

    PS_Gantt_Chart_Tasks psgct;
    PS_Gantt_Chart_VM psgcvm;
    PL_Frame plframe;
    int counter = 0;

    SerialCommunicator sc;
    final String VM_GPOS = "go";
    final String VM_RTOS = "ro";
    final String VM_Service = "sv";
    private LinkedList<String> VM_TYPE_LL;
    private LinkedList<String> VM_PRIO_LL;

    public Receiver(SerialCommunicator sc, PS_Gantt_Chart_Tasks psgct, PS_Gantt_Chart_VM psgcvm, PL_Frame plframe) {
        this.sc = sc;
        this.psgct = psgct;
        this.psgcvm = psgcvm;
        this.plframe = plframe;
    }

    @Override
    public void run() {

        //  String serialcom=JOptionPane.showInputDialog(null,"Enter the Serial port connected to the GSM modem. ex \"COM6");
        //   SerialCommunicator sc = new SerialCommunicator(serialcom);
        //      sc.connect();
        String command;
        while (true) {
            if (Main_Frame.connect_status == 0) {
                break;
            }
            command = sc.getReply();
            // System.err.println(command);
            if (command != null) {
                counter++;
                if (counter == 5000) {
                    counter = 0;
                    resetdata();
                }
                //   System.err.println(command);
                String[] s = command.split(" ");
                if (s.length > 0) {
                    if (s[0].equals("INIT")) {
                        int VM_count = Integer.parseInt(s[1]);
                        LinkedList<String> VM_TYPE_LL = new LinkedList<String>();
                        LinkedList<String> VM_PRIO_LL = new LinkedList<String>();
                        for (int i = 2; i < (2 + (VM_count * 2)); i++) {
                            if ((i % 2) == 0) {
                                String type = s[i];
                                String vm = "";
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

                        intialize_VM(VM_TYPE_LL, VM_PRIO_LL);
                    } else if (s[0].equals("INFO")) {
                        switch (s[1]) {
                            case "vm": {
                                String vm_id = s[2];
                                String sch_time = s[3];
                                Schedule_VM(vm_id, sch_time);
                                break;
                            }
                            case "tk": {
                                String vm_id = s[2];
                                String task_id = s[3];
                                String sch_time = s[4];
                                Schedule_Task(vm_id, task_id, sch_time);
                                break;
                            }
                            case "ts": {
                                String vm_id = s[2];
                                String sch_time = s[3];
                                Stop_Task(vm_id, sch_time);
                                break;
                            }
                            case "pl": {
                                String pr_id = s[2];
                                String acc = s[3];
                                String state = s[4];
                                String vm_id = s[5];
                                Allocate_PL(pr_id, acc, state, vm_id);
                                break;
                            }
                            case "ms":
                                String[] splited = command.split("<");
                                String message = splited[1];
                                PL_message(message);
                                break;
                            default:
                                break;
                        }

                    }
                }
            }

        }
    }

    private void intialize_VM(LinkedList<String> VM_TYPE_LL, LinkedList<String> VM_PRIO_LL) {
        //  Main_Frame.jTextArea1.append("intialize VM command Recieved \n");
        this.VM_TYPE_LL = VM_TYPE_LL;
        this.VM_PRIO_LL = VM_PRIO_LL;

        psgcvm.intialize(VM_TYPE_LL);
        psgct.intialize(VM_TYPE_LL, VM_PRIO_LL);
    }

    private void Schedule_VM(String vm_id, String sch_time) {
        //Main_Frame.jTextArea1.append("Schedule VM command Recieved \n");
        psgcvm.schedule_VM(vm_id, sch_time);
    }

    private void Schedule_Task(String vm_id, String task_id, String sch_time) {
        //Main_Frame.jTextArea1.append("Schedule Task command Recieved \n");
        psgct.schedule_tasks(vm_id, task_id, sch_time);
    }

    private void Allocate_PL(String pr_id, String acc, String state, String vm_id) {
        //    Main_Frame.jTextArea1.append("Allocate PL command Received \n");
        plframe.allocate(pr_id, acc, state, vm_id);
    }

    private void PL_message(String message) {
        //   Main_Frame.jTextArea1.append("PL INfO Message Received \n");
        plframe.add_message(message);
    }

    private void Stop_Task(String vm_id, String sch_time) {
        //  Main_Frame.jTextArea1.append("Stop Task command Recieved \n");
        psgct.stop_tasks(vm_id, sch_time);
    }

    public void rcsettasks(PS_Gantt_Chart_Tasks ps_gantt_chart_tasks) {
        psgct = ps_gantt_chart_tasks;
    }

    public void rcsetvms(PS_Gantt_Chart_VM ps_gantt_chart_VM) {
        psgcvm = ps_gantt_chart_VM;
    }

    public void resetdata() {
        Point location = Main_Frame.frame.ps_gantt_chart_tasks.getLocation();
        Point locationvm = Main_Frame.frame.ps_gantt_chart_VM.getLocation();
        Main_Frame.frame.ps_gantt_chart_VM.dispose();
        Main_Frame.frame.ps_gantt_chart_tasks.dispose();
        Main_Frame.frame.ps_gantt_chart_VM = new PS_Gantt_Chart_VM();
        Main_Frame.frame.ps_gantt_chart_VM.setLocation(locationvm);

        Main_Frame.frame.ps_gantt_chart_VM.setVisible(true);

        Main_Frame.frame.ps_gantt_chart_tasks = new PS_Gantt_Chart_Tasks();
        Main_Frame.frame.ps_gantt_chart_tasks.setLocation(location);
        Main_Frame.frame.ps_gantt_chart_tasks.setVisible(true);

        Main_Frame.frame.ps_gantt_chart_VM.PS_Gantt_Chart_VM_Set_psgct(Main_Frame.frame.ps_gantt_chart_tasks);
        rcsettasks(Main_Frame.frame.ps_gantt_chart_tasks);
        rcsetvms(Main_Frame.frame.ps_gantt_chart_VM);
        psgcvm.intialize(VM_TYPE_LL);
        psgct.intialize(VM_TYPE_LL, VM_PRIO_LL);
    }
}
