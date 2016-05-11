/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kerone_demo;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.IntervalCategoryDataset;
import org.jfree.data.gantt.Task;
import org.jfree.data.gantt.TaskSeries;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.time.SimpleTimePeriod;
import org.jfree.data.xy.XYDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
/**
 *
 * @author Fadel
 */
public class Gantt_Chart extends ApplicationFrame {
     static JFreeChart chart;
    
    public Gantt_Chart(final String title) {

        super(title);

        final IntervalCategoryDataset dataset = createDataset();
        chart = createChart(dataset);

        // add the chart to a panel...
        final ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(800, 470));
        setContentPane(chartPanel);

    }
 public static IntervalCategoryDataset createDataset() {

        final TaskSeries s1 = new TaskSeries("Scheduled");
        s1.add(new Task("VM1",
               new SimpleTimePeriod(date(10, Calendar.MAY, 2016,15,26,30),
                                    date(10, Calendar.MAY, 2016,15,26,31))));
        s1.add(new Task("VM2",
               new SimpleTimePeriod(date(10, Calendar.MAY, 2016,15,26,31),
                                    date(10, Calendar.MAY, 2016,15,26,32))));
         s1.add(new Task("VM3",
               new SimpleTimePeriod(date(10, Calendar.MAY, 2016,15,26,32),
                                    date(10, Calendar.MAY, 2016,15,26,33))));
         s1.add(new Task("VM4",
               new SimpleTimePeriod(date(10, Calendar.MAY, 2016,15,26,33),
                                    date(10, Calendar.MAY, 2016,15,26,34))));
     
         

        final TaskSeriesCollection collection = new TaskSeriesCollection();
        collection.add(s1);
 

        return collection;
    }
  public static IntervalCategoryDataset createDataset2() {

        final TaskSeries s1 = new TaskSeries("Scheduled");
        s1.add(new Task("VM1",
               new SimpleTimePeriod(date(10, Calendar.MAY, 2016,15,26,35),
                                    date(10, Calendar.MAY, 2016,15,26,36))));
        s1.add(new Task("VM2",
               new SimpleTimePeriod(date(10, Calendar.MAY, 2016,15,26,34),
                                    date(10, Calendar.MAY, 2016,15,26,35))));
         s1.add(new Task("VM3",
               new SimpleTimePeriod(date(10, Calendar.MAY, 2016,15,26,35),
                                    date(10, Calendar.MAY, 2016,15,26,36))));
         s1.add(new Task("VM4",
               new SimpleTimePeriod(date(10, Calendar.MAY, 2016,15,26,33),
                                    date(10, Calendar.MAY, 2016,15,26,34))));
       final TaskSeries s2 = new TaskSeries("running");
        Task task = new Task("VM5",
               new SimpleTimePeriod(date(10, Calendar.MAY, 2016,15,26,36),
                                    date(10, Calendar.MAY, 2016,15,26,37)));
       s2.add(new Task("VM5",
               new SimpleTimePeriod(date(10, Calendar.MAY, 2016,15,26,36),
                                    date(10, Calendar.MAY, 2016,15,26,37))));

        final TaskSeriesCollection collection = new TaskSeriesCollection();
       
        collection.add(s1);
         collection.add(s2);

        return collection;
    }
 
 
     public static JFreeChart createChart(final IntervalCategoryDataset dataset) {
        final JFreeChart chart = ChartFactory.createGanttChart(
            "VM Scheduling",  // chart title
            "VM",              // domain axis label
            "Time",              // range axis label
            dataset,             // data
            false,                // include legend
            true,                // tooltips
            false                // urls
        );    
//        chart.getCategoryPlot().getDomainAxis().setMaxCategoryLabelWidthRatio(10.0f);
        return chart;    
    }
    
      private static Date date(final int day, final int month, final int year,final int hour,final int min , final int sec) {

        final Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day,hour,min,sec);
        final Date result = calendar.getTime();
        return result;

    }
      
          public static void main(final String[] args) {

        final Gantt_Chart demo = new Gantt_Chart("Kerone Demo");
       // JButton but = new JButton("Press");
       // demo.add(but);
        demo.pack();
        
        RefineryUtilities.centerFrameOnScreen(demo);
        demo.setVisible(true);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Gantt_Chart.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       IntervalCategoryDataset dataset = createDataset2();
        chart = createChart(dataset);
        chart.fireChartChanged();
         ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(800, 470));
        demo.setContentPane(chartPanel);
        demo.revalidate();
          System.err.println("done");
          try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Gantt_Chart.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        dataset = createDataset();
        chart = createChart(dataset);
        chart.fireChartChanged();
         chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(800, 470));
        demo.setContentPane(chartPanel);
        demo.revalidate();
          System.err.println("done");
           try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Gantt_Chart.class.getName()).log(Level.SEVERE, null, ex);
        }
           dataset = createDataset2();
        chart = createChart(dataset);
        chart.fireChartChanged();
         chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(800, 470));
        demo.setContentPane(chartPanel);
        demo.revalidate();
          System.err.println("done");
        
    }
}
