/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kerone_demo;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.data.category.IntervalCategoryDataset;
import org.jfree.data.gantt.Task;
import org.jfree.data.gantt.TaskSeries;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.time.SimpleTimePeriod;

/**
 *
 * @author Fadel
 */
public class PS_Gantt_Chart_VM extends javax.swing.JFrame {
    LinkedList<Task> task = new LinkedList<Task>();
    TaskSeries  s1 ;
    DateAxis axis;
    JFreeChart chart;
     int last_VM=-1;
    /**
     * Creates new form Test_Frame
     */
    public PS_Gantt_Chart_VM() {
//          IntervalCategoryDataset dataset = createDataset3();
//          JFreeChart chart = createChart(dataset);
//
//        // add the chart to a panel...
//         ChartPanel chartPanel = new ChartPanel(chart);
//     
        initComponents();
        myRenderer mr = new myRenderer();
        chart.getCategoryPlot().setRenderer(mr);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        VM_Current_Label = new javax.swing.JLabel();
        VM1_label = new javax.swing.JLabel();
        VM2_label = new javax.swing.JLabel();
        VM3_label = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        VM4_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Virtual Machine State");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jPanel1MouseWheelMoved(evt);
            }
        });
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel1.setText("Current VM:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel2.setText("VM 1:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel3.setText("VM 2:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel4.setText("VM 3:");

        VM_Current_Label.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        VM_Current_Label.setText(" ");
        VM_Current_Label.setToolTipText("");

        VM1_label.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        VM1_label.setText(" ");
        VM1_label.setToolTipText("");

        VM2_label.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        VM2_label.setText(" ");
        VM2_label.setToolTipText("");

        VM3_label.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        VM3_label.setText(" ");
        VM3_label.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel5.setText("VM 4:");

        VM4_label.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        VM4_label.setText(" ");
        VM4_label.setToolTipText("");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(VM2_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(VM1_label, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                        .addGap(12, 12, 12))
                    .addComponent(VM3_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(VM_Current_Label, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(VM4_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(VM_Current_Label))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(VM1_label))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(VM2_label))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(VM3_label))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(VM4_label))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        final IntervalCategoryDataset dataset = createDataset3();
        chart = createChart(dataset);

        // add the chart to a panel...
        ChartPanel chartPanel = new ChartPanel(chart);
        CategoryPlot plot = chart.getCategoryPlot();
        axis = (DateAxis) plot.getRangeAxis();

        //axis.setTickUnit(new DateTickUnit(DateTickUnitType.MILLISECOND, 10));
        axis.setDateFormatOverride(new SimpleDateFormat("S"));

        axis.setRange(1,  500);
        chartPanel.setRangeZoomable(false);
        chartPanel.setDomainZoomable(false);
        jPanel1.add(chartPanel);
        jPanel1.validate();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jPanel1MouseWheelMoved
        evt.getWheelRotation();
         if (evt.getWheelRotation()==1)
            axis.setRange(axis.getRange().getLowerBound()-50, axis.getRange().getUpperBound()+50);
         else
             if (evt.getWheelRotation()==-1)
             {
               axis.setRange(axis.getRange().getLowerBound()+50, axis.getRange().getUpperBound()-50);  
             }
    }//GEN-LAST:event_jPanel1MouseWheelMoved

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Windows".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(PS_Gantt_Chart_VM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(PS_Gantt_Chart_VM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(PS_Gantt_Chart_VM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(PS_Gantt_Chart_VM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                 Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
//                PS_Gantt_Chart_VM frame =  new PS_Gantt_Chart_VM();
//                 int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
//                int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
//                frame.setLocation(x, y);
//                frame.setVisible(true);
//            }
//        });
//    }
 public static JFreeChart createChart(final IntervalCategoryDataset dataset) {
        final JFreeChart chart = ChartFactory.createGanttChart(
                "VM Scheduling", // chart title
                "VM", // domain axis label
                "Time", // range axis label
                dataset, // data
                false, // include legend
                true, // tooltips
                false // urls
        );
        //chart.getCategoryPlot().getDomainAxis().setMaxCategoryLabelWidthRatio(10.0f);
        return chart;
    }
 
  public  IntervalCategoryDataset createDataset3() {

     
      s1 = new TaskSeries("Scheduled");
        Task task1 = new Task("VM1",
                new SimpleTimePeriod(0,
                        0));
        Task task2 = new Task("VM2",
                new SimpleTimePeriod(0,
                        0));
        Task task3 = new Task("VM3",
                new SimpleTimePeriod(0,
                        0));
        Task task4 = new Task("VM4",
                new SimpleTimePeriod(0,
                        0));
         s1.add(task1);

        s1.add(task2);
     
        s1.add(task3);
        
         s1.add(task4);

        final TaskSeriesCollection collection = new TaskSeriesCollection();

        collection.add(s1);
        return collection;
    }
   private static Date date(final int day, final int month, final int year, final int hour, final int min, final int sec) {

        final Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day, hour, min, sec);
        final Date result = calendar.getTime();
        return result;

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel VM1_label;
    private javax.swing.JLabel VM2_label;
    private javax.swing.JLabel VM3_label;
    private javax.swing.JLabel VM4_label;
    private javax.swing.JLabel VM_Current_Label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables

    public void intialize( LinkedList<String> VM_TYPE_LL) {
       VM_Current_Label.setText("");
       VM1_label.setText(VM_TYPE_LL.get(0));
       VM2_label.setText(VM_TYPE_LL.get(1));
       VM3_label.setText(VM_TYPE_LL.get(2));
       VM4_label.setText(VM_TYPE_LL.get(3));
    }

    public void schedule_VM(String vm_id, String sch_time) {
       int vmid = Integer.parseInt(vm_id) -1;
       int schtime =  Integer.parseInt(sch_time);
       if (last_VM!=vmid && last_VM>=0)
       {
       Task lasttask = s1.get(last_VM);
       Task subtask = lasttask.getSubtask(lasttask.getSubtaskCount()-1);
       subtask.setDuration( new SimpleTimePeriod(subtask.getDuration().getStart().getTime(),
                        schtime));
       }
       Task temp = s1.get(vmid);
       Task subtask = new Task("VM"+(vmid+1),   new SimpleTimePeriod(schtime,
                        schtime+3));
       temp.addSubtask(subtask);
       VM_Current_Label.setText("VM"+(vmid+1));
       last_VM=vmid;
       SetRange();
    }
    
     private void SetRange( ) {
        long max = 0;
          List tasks = s1.getTasks();
         for (int i = 0; i < tasks.size(); i++) {
            Task tasktemp = (Task) tasks.get(i);
            int subnumb = tasktemp.getSubtaskCount();
            for (int j = 0; j < subnumb; j++) {
                Date start = tasktemp.getSubtask(j).getDuration().getEnd();
                if (start.getTime() > max) {
                    max = start.getTime();
                }
            }
        }
        if (max<500)
        {
           axis.setRange(1,500);
        }else 
        {
          axis.setRange(max-499,max);  
        }

    }
}
