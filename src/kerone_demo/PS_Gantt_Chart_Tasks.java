/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kerone_demo;

import java.awt.Color;
import java.awt.Paint;
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
public class PS_Gantt_Chart_Tasks extends javax.swing.JFrame {

    DateAxis axis1;
    DateAxis axis2;
    DateAxis axis3;
    ChartPanel chartPanel1;
    ChartPanel chartPanel2;
    ChartPanel chartPanel3;
    LinkedList<Task> tasks1 = new LinkedList<Task>();
    LinkedList<Task> tasks2 = new LinkedList<Task>();
    LinkedList<Task> tasks3 = new LinkedList<Task>();
    LinkedList<TaskSeries> series = new LinkedList<TaskSeries>();
    TaskSeries s1;
    TaskSeries s2;
    TaskSeries s3;
    JFreeChart chart1;
    JFreeChart chart2;
    JFreeChart chart3;
    int last_task1 = -1;
    int last_task2 = -1;
    int last_task3 = -1;
    Gantt_Chart_Controller_Thread gcct;
    private int counter = 0;

    public PS_Gantt_Chart_Tasks() {
//          IntervalCategoryDataset dataset = createDataset3();
//          JFreeChart chart = createChart(dataset);
//
//        // add the chart to a panel...
//         ChartPanel chartPanel = new ChartPanel(chart);
//     

        initComponents();
        chart1.getCategoryPlot().getRenderer().setSeriesPaint(0, Color.red);
        chart2.getCategoryPlot().getRenderer().setSeriesPaint(0, Color.BLUE);
        chart3.getCategoryPlot().getRenderer().setSeriesPaint(0, Color.GREEN);
        gcct = new Gantt_Chart_Controller_Thread(this);

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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        VM1_PR_Lev_label = new javax.swing.JLabel();
        VM1_type_label = new javax.swing.JLabel();
        VM1_current_task_label = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        VM2_current_task_label = new javax.swing.JLabel();
        VM2_type_label = new javax.swing.JLabel();
        VM2_PR_Lev_label = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        VM3_current_task_label = new javax.swing.JLabel();
        VM3_type_label = new javax.swing.JLabel();
        VM3_PR_Lev_label = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Virtual Machine State");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jPanel1MouseWheelMoved(evt);
            }
        });
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jPanel2MouseWheelMoved(evt);
            }
        });
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jPanel3MouseWheelMoved(evt);
            }
        });
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("VM ID:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("PRIORITY LEVEL:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("TYPE:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Current TASK:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("1");

        VM1_PR_Lev_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        VM1_PR_Lev_label.setText(" ");

        VM1_type_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        VM1_type_label.setText(" ");

        VM1_current_task_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        VM1_current_task_label.setText(" ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(VM1_current_task_label, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(VM1_type_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(VM1_PR_Lev_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(VM1_PR_Lev_label))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(VM1_type_label))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(VM1_current_task_label))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Current TASK:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("TYPE:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("PRIORITY LEVEL:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("VM ID:");

        VM2_current_task_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        VM2_current_task_label.setText(" ");

        VM2_type_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        VM2_type_label.setText(" ");

        VM2_PR_Lev_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        VM2_PR_Lev_label.setText(" ");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("2");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(VM2_PR_Lev_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(VM2_type_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(39, 39, 39)
                        .addComponent(VM2_current_task_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(VM2_PR_Lev_label))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(VM2_type_label))))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(VM2_current_task_label))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Current TASK:");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("TYPE:");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("PRIORITY LEVEL:");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("VM ID:");

        VM3_current_task_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        VM3_current_task_label.setText(" ");

        VM3_type_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        VM3_type_label.setText(" ");

        VM3_PR_Lev_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        VM3_PR_Lev_label.setText(" ");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("3");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(79, 79, 79)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(VM3_PR_Lev_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(VM3_type_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(VM3_current_task_label, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel24))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(VM3_PR_Lev_label))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(VM3_type_label))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(VM3_current_task_label))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        IntervalCategoryDataset dataset1 = createDataset1();
        chart1 = createChart(dataset1);

        // add the chart to a panel...
        chartPanel1 = new ChartPanel(chart1);
        CategoryPlot plot = chart1.getCategoryPlot();
        axis1 = (DateAxis) plot.getRangeAxis();

        //axis.setTickUnit(new DateTickUnit(DateTickUnitType.MILLISECOND, 10));
        axis1.setDateFormatOverride(new SimpleDateFormat("S"));
        axis1.setRange(1,  500);
        chartPanel1.setRangeZoomable(false);
        chartPanel1.setDomainZoomable(false);
        jPanel1.add(chartPanel1);
        jPanel1.validate();
        IntervalCategoryDataset dataset2 = createDataset2();
        chart2 = createChart(dataset2);

        // add the chart to a panel...
        chartPanel2 = new ChartPanel(chart2);
        plot = chart2.getCategoryPlot();
        axis2 = (DateAxis) plot.getRangeAxis();

        //axis.setTickUnit(new DateTickUnit(DateTickUnitType.MILLISECOND, 10));
        axis2.setDateFormatOverride(new SimpleDateFormat("S"));
        axis2.setRange(1,  500);
        chartPanel2.setRangeZoomable(false);
        chartPanel2.setDomainZoomable(false);
        jPanel2.add(chartPanel2);
        jPanel2.validate();
        IntervalCategoryDataset dataset3 = createDataset3();
        chart3 = createChart(dataset3);

        // add the chart to a panel...
        chartPanel3 = new ChartPanel(chart3);
        plot = chart3.getCategoryPlot();
        axis3 = (DateAxis) plot.getRangeAxis();

        //axis.setTickUnit(new DateTickUnit(DateTickUnitType.MILLISECOND, 100));
        axis3.setDateFormatOverride(new SimpleDateFormat("S"));
        axis3.setRange(1,  500);
        chartPanel3.setRangeZoomable(false);
        chartPanel3.setDomainZoomable(false);
        jPanel3.add(chartPanel3);
        jPanel3.validate();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel3MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jPanel3MouseWheelMoved
        evt.getWheelRotation();
        if (evt.getWheelRotation() == 1) {
            axis3.setRange(axis3.getRange().getLowerBound() - 50, axis3.getRange().getUpperBound() + 50);
        } else if (evt.getWheelRotation() == -1) {
            axis3.setRange(axis3.getRange().getLowerBound() + 50, axis3.getRange().getUpperBound() - 50);
        }
//        System.err.println("Hi"
//                + "");
//      
    }//GEN-LAST:event_jPanel3MouseWheelMoved

    private void jPanel2MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jPanel2MouseWheelMoved
        evt.getWheelRotation();
        if (evt.getWheelRotation() == 1) {
            axis2.setRange(axis2.getRange().getLowerBound() - 50, axis2.getRange().getUpperBound() + 50);
        } else if (evt.getWheelRotation() == -1) {
            axis2.setRange(axis2.getRange().getLowerBound() + 50, axis2.getRange().getUpperBound() - 50);
        }
    }//GEN-LAST:event_jPanel2MouseWheelMoved

    private void jPanel1MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jPanel1MouseWheelMoved
        evt.getWheelRotation();
        if (evt.getWheelRotation() == 1) {
            axis1.setRange(axis1.getRange().getLowerBound() - 50, axis1.getRange().getUpperBound() + 50);
        } else if (evt.getWheelRotation() == -1) {
            axis1.setRange(axis1.getRange().getLowerBound() + 50, axis1.getRange().getUpperBound() - 50);
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
//            java.util.logging.Logger.getLogger(PS_Gantt_Chart_Tasks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(PS_Gantt_Chart_Tasks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(PS_Gantt_Chart_Tasks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(PS_Gantt_Chart_Tasks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
//                PS_Gantt_Chart_Tasks frame =  new PS_Gantt_Chart_Tasks();
//                 int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
//                int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
//                frame.setLocation(x, y);
//                frame.setVisible(true);
//              // axis.setRange(99,650);
//            }
//        });
//    }
    public static JFreeChart createChart(final IntervalCategoryDataset dataset) {
        final JFreeChart chart = ChartFactory.createGanttChart(
                "Task Scheduling", // chart title
                "Tasks", // domain axis label
                "Time", // range axis label
                dataset, // data
                false, // include legend
                true, // tooltips
                false // urls
        );
        //chart.getCategoryPlot().getDomainAxis().setMaxCategoryLabelWidthRatio(10.0f);
        return chart;
    }

    public IntervalCategoryDataset createDataset3() {

        s3 = new TaskSeries("Scheduled");
        Task task1 = new Task("Task1",
                new SimpleTimePeriod(0,
                        0));
        Task task2 = new Task("Task2",
                new SimpleTimePeriod(0,
                        0));
        Task task3 = new Task("Task3",
                new SimpleTimePeriod(0,
                        0));
        s3.add(task1);
        s3.add(task2);
        s3.add(task3);
        TaskSeriesCollection collection = new TaskSeriesCollection();

        collection.add(s3);
        //  collection.add(s2);
        series.add(s3);
        return collection;
    }

    public IntervalCategoryDataset createDataset2() {

        s2 = new TaskSeries("Scheduled");
        Task task1 = new Task("Task1",
                new SimpleTimePeriod(0,
                        0));
        Task task2 = new Task("Task2",
                new SimpleTimePeriod(0,
                        0));
        Task task3 = new Task("Task3",
                new SimpleTimePeriod(0,
                        0));
        s2.add(task1);
        s2.add(task2);
        s2.add(task3);
        TaskSeriesCollection collection = new TaskSeriesCollection();

        collection.add(s2);
        //  collection.add(s2);
        series.add(s2);

        return collection;
    }

    public IntervalCategoryDataset createDataset1() {

        s1 = new TaskSeries("Scheduled");
        Task task1 = new Task("Task1",
                new SimpleTimePeriod(0,
                        0));
        Task task2 = new Task("Task2",
                new SimpleTimePeriod(0,
                        0));
        Task task3 = new Task("Task3",
                new SimpleTimePeriod(0,
                        0));
        s1.add(task1);
        s1.add(task2);
        s1.add(task3);
        TaskSeriesCollection collection = new TaskSeriesCollection();

        collection.add(s1);
        //  collection.add(s2);
        series.add(s1);

        return collection;
    }

    private static Date date(final int day, final int month, final int year, final int hour, final int min, final int sec) {

        final Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day, hour, min, sec);
        final Date result = calendar.getTime();
        return result;

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel VM1_PR_Lev_label;
    private javax.swing.JLabel VM1_current_task_label;
    private javax.swing.JLabel VM1_type_label;
    private javax.swing.JLabel VM2_PR_Lev_label;
    private javax.swing.JLabel VM2_current_task_label;
    private javax.swing.JLabel VM2_type_label;
    private javax.swing.JLabel VM3_PR_Lev_label;
    private javax.swing.JLabel VM3_current_task_label;
    private javax.swing.JLabel VM3_type_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables

    public void intialize(LinkedList<String> VM_TYPE_LL, LinkedList<String> VM_PRIO_LL) {
        VM1_PR_Lev_label.setText(VM_PRIO_LL.get(0));
        VM2_PR_Lev_label.setText(VM_PRIO_LL.get(1));
        VM3_PR_Lev_label.setText(VM_PRIO_LL.get(2));
        VM1_type_label.setText(VM_TYPE_LL.get(0));
        VM2_type_label.setText(VM_TYPE_LL.get(1));
        VM3_type_label.setText(VM_TYPE_LL.get(2));
        VM1_current_task_label.setText("");
        VM2_current_task_label.setText("");
        VM3_current_task_label.setText("");
///         gcct.start();
    }

    public void schedule_tasks(String vm_id, String task_id, String sch_time) {
      int vmid = Integer.parseInt(vm_id) - 1;
        int taskid = Integer.parseInt(task_id) - 1;
        int schtime = Integer.parseInt(sch_time);
      
//      counter++;
//        if (counter == 500) {
//             IntervalCategoryDataset dataset1 = createDataset1();
//             chart1 = createChart(dataset1);
//             IntervalCategoryDataset dataset2 = createDataset2();
//             chart2 = createChart(dataset2);
//               IntervalCategoryDataset dataset3 = createDataset3();
//             chart3 = createChart(dataset3);
//            last_task1 = -1;
//            last_task2 = -1;
//            last_task3 = -1;
//            
//             counter = 0;
//        }

      
        Task temp = series.get(vmid).get(taskid);
        //System.err.println(temp.getSubtaskCount());
        Task subtask = new Task("Task" + (taskid + 1), new SimpleTimePeriod(schtime,
                schtime + 3));
        temp.addSubtask(subtask);
        switch (vmid) {
            case 0:
                this.VM1_current_task_label.setText("Task" + (taskid + 1));
                SetRange(vmid, axis1);
                if (last_task1 != taskid && last_task1 >= 0) {
                    Task lasttask = s1.get(last_task1);
                        if (lasttask.getSubtaskCount()!=0)
                        { Task subtasky = lasttask.getSubtask(lasttask.getSubtaskCount() - 1);
                    subtasky.setDuration(new SimpleTimePeriod(subtasky.getDuration().getStart().getTime(),
                            schtime));
                        }
                }
///                gcct.subtask1 = subtask;
///                gcct.flag1 = 1;
                last_task1 = taskid;
                
                break;
            case 1:
                this.VM2_current_task_label.setText("Task" + (taskid + 1));
                SetRange(vmid, axis2);
                if (last_task2 != taskid && last_task2 >= 0) {
                    Task lasttask = s2.get(last_task2);
                   if (lasttask.getSubtaskCount()!=0)
                    {
                    Task subtasky = lasttask.getSubtask(lasttask.getSubtaskCount() - 1);
                    subtasky.setDuration(new SimpleTimePeriod(subtasky.getDuration().getStart().getTime(),
                            schtime));
                    }
                }
///                gcct.subtask2 = subtask;
///                gcct.flag2 = 1;
                last_task2 = taskid;
               
                break;
            case 2:
                this.VM3_current_task_label.setText("Task" + (taskid + 1));
                SetRange(vmid, axis3);
                if (last_task3 != taskid && last_task3 >= 0) {
                    Task lasttask = s3.get(last_task3);
                    if (lasttask.getSubtaskCount()!=0)
                    {
                    Task subtasky = lasttask.getSubtask(lasttask.getSubtaskCount() - 1);
                    subtasky.setDuration(new SimpleTimePeriod(subtasky.getDuration().getStart().getTime(),
                            schtime));
                    
                    }
                }
///                gcct.subtask3 = subtask;
///                gcct.flag3 = 1;
                last_task3 = taskid;
                 
                break;
            default:
                break;
        }

    }

    protected void SetRange(int vmid, DateAxis axis) {
        long max = 0;
        List tasks = series.get(vmid).getTasks();
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

        if (max < 500) {
            axis.setRange(1, 500);
        } else {
            axis.setRange(max - 499, max);
        }

    }

    public void stop_tasks(String vm_id, String sch_time) {
              
        int vmid = Integer.parseInt(vm_id) - 1;
        int schtime = Integer.parseInt(sch_time);

        switch (vmid) {
            case 0:
                ///gcct.flag1 = 0;
                if (last_task1 >= 0) {
                    Task lasttask = s1.get(last_task1);
                    if (lasttask.getSubtaskCount()!=0)
                    { Task subtasky = lasttask.getSubtask(lasttask.getSubtaskCount() - 1);
                    subtasky.setDuration(new SimpleTimePeriod(subtasky.getDuration().getStart().getTime(),
                            schtime));
                    }
                }
                break;

            case 1:
                if (last_task2 >= 0) {
                    Task lasttask = s2.get(last_task2);
                    if (lasttask.getSubtaskCount()!=0)
                    { Task subtasky = lasttask.getSubtask(lasttask.getSubtaskCount() - 1);
                    subtasky.setDuration(new SimpleTimePeriod(subtasky.getDuration().getStart().getTime(),
                            schtime));
                    }
                }
                ///gcct.flag2 = 0;
                break;
            case 2:
                if (last_task3 >= 0) {
                    Task lasttask = s3.get(last_task3);
                    if (lasttask.getSubtaskCount()!=0)
                    {
                    Task subtasky = lasttask.getSubtask(lasttask.getSubtaskCount() - 1);
                    subtasky.setDuration(new SimpleTimePeriod(subtasky.getDuration().getStart().getTime(),
                            schtime));
                    }
                }

                ///gcct.flag3 = 0;
                break;
            default:
                break;
        }
        
    }

    public void resume_tasks(String vm_id, String sch_time) {

        int vmid = Integer.parseInt(vm_id) - 1;
        int schtime = Integer.parseInt(sch_time);
        int taskid = - 1;

        switch (vmid) {
            case (0):
                taskid = last_task1;
                break;
            case (1):
                taskid = last_task2;
                break;
            case (2):
                taskid = last_task3;
                break;
            default:
                break;
        }

        if (taskid < 0) {
            return;
        }

        Task temp = series.get(vmid).get(taskid);
        Task subtask = new Task("Task" + (taskid + 1), new SimpleTimePeriod(schtime,
                schtime + 3));
        temp.addSubtask(subtask);
        switch (vmid) {
            case 0:
                this.VM1_current_task_label.setText("Task" + (taskid + 1));
                SetRange(vmid, axis1);
                break;
            case 1:
                this.VM2_current_task_label.setText("Task" + (taskid + 1));
                SetRange(vmid, axis2);
                break;
            case 2:
                this.VM3_current_task_label.setText("Task" + (taskid + 1));
                SetRange(vmid, axis3);
                break;
            default:
                break;
        }

    }

    void SetRange(int i) {
        switch (i) {
            case 1:
                SetRange(0, axis1);
                break;
            case 2:
                SetRange(1, axis2);
                break;
            case 3:
                SetRange(2, axis3);
                break;
        }

    }
}
