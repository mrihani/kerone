/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kerone_demo;

import Communication.Receiver;
import Communication.Sender;
import Communication.SerialCommunicator;
import gnu.io.CommPortIdentifier;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Enumeration;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author Fadel
 */
public class Main_Frame extends javax.swing.JFrame {

    Sender sender;
    SerialCommunicator sc;
    public static int connect_status;
    PL_Frame plframe;
    PS_Gantt_Chart_VM ps_gantt_chart_VM;
    PS_Gantt_Chart_Tasks ps_gantt_chart_tasks;

    /**
     * Creates new form Main_Frame
     */
    public Main_Frame() {
        initComponents();
        sender = new Sender(sc);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("Send Command");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Intialize", "Run", "Stop", "VM Scheduling Enable", "VM Scheduling Disable", "Task Scheduling Enable", "Task Scheduling Disable", "PL Allocation Enable", "PL Allocation Disable", "Slow mode Enable", "Slow mode Disable" }));

        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Connect");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBox1, 0, 549, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(jComboBox1))
                .addContainerGap())
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenu2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jMenuItem1.setText("Clear Text Field");
        jMenuItem1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         if (connect_status==0)
         {
             jTextArea1.append("Not Connected! Please connect first! \n");
         }

        int selectedindex = jComboBox1.getSelectedIndex();
        switch (selectedindex) {
            case 0:
                sender.Intialize();
                jTextArea1.append("Intialize Command Sent\n");
                break;
            case 1:
                sender.RunStop(0);
                jTextArea1.append("Run Command Sent\n");
                break;
            case 2:
                sender.RunStop(1);
                jTextArea1.append("Stop Command Sent\n");
                break;
            case 3:
                sender.SendCommand("VM_SCH_EN");
                jTextArea1.append("VM Schedule Enable Command Sent\n");
                break;
            case 4:
                sender.SendCommand("VM_SCH_DIS");
                jTextArea1.append("VM Schedule Disable Command Sent\n");
                break;
            case 5:
                sender.SendCommand("TA_SCH_EN");
                jTextArea1.append("Task Schedule Enable Command Sent\n");
                break;
            case 6:
                sender.SendCommand("TA_SCH_DIS");
                jTextArea1.append("Task Schedule Disable Command Sent\n");
                break;
            case 7:
                sender.SendCommand("PL_ALL_EN");
                jTextArea1.append("PL Allocate Enable Command Sent\n");
                break;
            case 8:
                sender.SendCommand("PL_ALL_DIS");
                jTextArea1.append("PL Allocate Disable Command Sent\n");
                break;
            case 9:
                sender.SendCommand("SLOW_EN");
                jTextArea1.append("Slow Mode Enable Command Sent\n");
                break;
            case 10:
                sender.SendCommand("SLOW_DIS");
                jTextArea1.append("Slow Mode Disble Command Sent\n");
                break;
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        jTextArea1.setText("");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (jButton2.getText().equals("Connect")) {
            sc = new SerialCommunicator(String.valueOf(jComboBox2.getSelectedItem()));

            boolean connect = sc.connect();
            if (connect) {
                jTextArea1.append("Connected on " + jComboBox2.getSelectedItem() + " \n");
                jButton2.setText("Disconnect");
                connect_status = 1;
                Receiver rc = new Receiver(sc, ps_gantt_chart_tasks, ps_gantt_chart_VM, plframe);
                rc.start();
                sender = new Sender(sc);
            }
        } else {
            jTextArea1.append("Diconnected on " + jComboBox2.getSelectedItem() + " \n");
            sc.disconnect();
            jButton2.setText("Connect");
            connect_status = 0;
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public void getComPorts() {
        Enumeration portList = CommPortIdentifier.getPortIdentifiers();
        if (!portList.hasMoreElements()) {
            JOptionPane.showMessageDialog(rootPane, "NO COM PORTS FOUND ON PC !");
            return;
        }
        while (portList.hasMoreElements()) {
            //   System.out.println("Has more elements");
            CommPortIdentifier portId = (CommPortIdentifier) portList.nextElement();

            jComboBox2.addItem(portId.getName());
        }

    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Main_Frame frame = new Main_Frame();
                Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
                int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
                int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
                frame.setLocation(x, y);
                frame.setVisible(true);
                frame.plframe = new PL_Frame();

                frame.plframe.setVisible(true);
                frame.ps_gantt_chart_VM = new PS_Gantt_Chart_VM();

                frame.ps_gantt_chart_VM.setVisible(true);
                frame.ps_gantt_chart_tasks = new PS_Gantt_Chart_Tasks();

                frame.ps_gantt_chart_tasks.setVisible(true);

                frame.getComPorts();
//                LinkedList<String> ll = new LinkedList<String>();
//                ll.add("RTOS");
//                ll.add("GPOS");
//                ll.add("Service");
//                LinkedList<String> llp = new LinkedList<String>();
//                llp.add("1");
//                llp.add("2");
//                llp.add("3");
//                frame.ps_gantt_chart_tasks.intialize(ll, llp);
//                frame.ps_gantt_chart_VM.intialize(ll);
//                frame.ps_gantt_chart_VM.schedule_VM("1", "100");
//               frame.ps_gantt_chart_VM.schedule_VM("2", "200");
//               frame.ps_gantt_chart_VM.schedule_VM("3", "500");
//               frame.ps_gantt_chart_VM.schedule_VM("1", "700");
//               frame.ps_gantt_chart_VM.schedule_VM("2", "900");
//               frame.ps_gantt_chart_VM.schedule_VM("3", "1100");
//                 frame.ps_gantt_chart_tasks.schedule_tasks("1", "1", "100");
//                 frame.ps_gantt_chart_tasks.schedule_tasks("1", "2", "300");
//                 frame.ps_gantt_chart_tasks.schedule_tasks("1", "3", "500");
//                 frame.ps_gantt_chart_tasks.schedule_tasks("2", "3", "100");
//                 frame.ps_gantt_chart_tasks.schedule_tasks("2", "2", "300");
//                 frame.ps_gantt_chart_tasks.schedule_tasks("2", "1", "500");
//                 frame.ps_gantt_chart_tasks.schedule_tasks("3", "1", "100");
//                 frame.ps_gantt_chart_tasks.schedule_tasks("3", "2", "300");
//                frame. ps_gantt_chart_tasks.schedule_tasks("3", "2", "500");
//
//                plframe.allocate("1", "FFT", "i", "1");
//                plframe.allocate("2", "QAM", "b", "2");
//                plframe.allocate("3", "ENC1", "p", "3");
//                plframe.add_message("Message 1 ");
//
////                try {
////                    Thread.sleep(5000);
////                } catch (InterruptedException ex) {
////                    Logger.getLogger(Main_Frame.class.getName()).log(Level.SEVERE, null, ex);
////                }
//                ps_gantt_chart_VM.schedule_VM("1", "400");
//                ps_gantt_chart_VM.schedule_VM("2", "500");
//                ps_gantt_chart_VM.schedule_VM("3", "600");
//
//                ps_gantt_chart_tasks.schedule_tasks("1", "1", "400");
//                ps_gantt_chart_tasks.schedule_tasks("1", "2", "500");
//                ps_gantt_chart_tasks.schedule_tasks("1", "3", "1100");
//                ps_gantt_chart_tasks.schedule_tasks("2", "3", "400");
//                ps_gantt_chart_tasks.schedule_tasks("2", "2", "500");
//                ps_gantt_chart_tasks.schedule_tasks("2", "1", "600");
//                ps_gantt_chart_tasks.schedule_tasks("3", "1", "800");
//                ps_gantt_chart_tasks.schedule_tasks("3", "2", "700");
//                ps_gantt_chart_tasks.schedule_tasks("3", "3", "1000");
//
//                plframe.allocate("1", "FFT2000", "r", "1");
//                plframe.allocate("2", "QAM85", "i", "2");
//                plframe.allocate("3", "ENC3", "b", "3");
//                plframe.add_message("Message 2 ");

                //  String serialcom=JOptionPane.showInputDialog(null,"Enter the Serial port connected to the GSM modem. ex \"COM6");
                //   SerialCommunicator sc = new SerialCommunicator(serialcom);
                //   sc.connect();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
