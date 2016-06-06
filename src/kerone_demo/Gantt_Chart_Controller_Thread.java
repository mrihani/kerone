/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kerone_demo;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.jfree.data.gantt.Task;
import org.jfree.data.time.SimpleTimePeriod;

/**
 *
 * @author Fadel
 */
public class Gantt_Chart_Controller_Thread extends Thread {

    public Gantt_Chart_Controller_Thread(PS_Gantt_Chart_Tasks psgct) {
        this.psgct = psgct;

    }

    PS_Gantt_Chart_Tasks psgct;

    int flag1 = 0;
    int flag2 = 0;
    int flag3 = 0;

    Task subtask1;
    Task subtask2;
    Task subtask3;

    @Override
    public void run() {
      //  int i=0;
        while (true) {
            // System.err.println(flag1+" "+flag2+" "+flag3);
            if (flag1 == 1) {
                subtask1.setDuration(new SimpleTimePeriod(subtask1.getDuration().getStart().getTime(),
                        subtask1.getDuration().getEnd().getTime() + 1));
                //  System.err.println("subtask1 "+ subtask1.getDuration().getStart().getTime()+" "+ subtask1.getDuration().getEnd().getTime());
                psgct.SetRange(1);
            }

            if (flag2 == 1) {
                subtask2.setDuration(new SimpleTimePeriod(subtask2.getDuration().getStart().getTime(),
                        subtask2.getDuration().getEnd().getTime() + 1));
                //System.err.println("subtask2 "+ subtask2.getDuration().getStart().getTime()+" "+ subtask2.getDuration().getEnd().getTime());
                psgct.SetRange(2);
            }

            if (flag3 == 1) {
                subtask3.setDuration(new SimpleTimePeriod(subtask3.getDuration().getStart().getTime(),
                        subtask3.getDuration().getEnd().getTime() + 1));
                // System.err.println("subtask3 "+ subtask3.getDuration().getStart().getTime()+" "+ subtask3.getDuration().getEnd().getTime());
                psgct.SetRange(3);
            }
            try {
                sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(Gantt_Chart_Controller_Thread.class.getName()).log(Level.SEVERE, null, ex);
            }
//            i++;
//            if (i==10)
//            {
//                psgct.stop_tasks("1");
//            }
        }
    }

}
