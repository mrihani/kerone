/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kerone_demo;

import java.awt.LayoutManager;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.CategoryPlot;
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
        static TaskSeries s1 ;

    public Gantt_Chart(final String title) {

        super(title);

        final IntervalCategoryDataset dataset = createDataset3();
        chart = createChart(dataset);

        // add the chart to a panel...
         ChartPanel chartPanel = new ChartPanel(chart);
          ChartPanel chartPanel2 = new ChartPanel(chart);
           ChartPanel chartPanel3 = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(800, 200));
        chartPanel2.setPreferredSize(new java.awt.Dimension(800, 200));
        chartPanel3.setPreferredSize(new java.awt.Dimension(800, 200));
        JPanel panel = new JPanel();
        panel.add(chartPanel);
        
         panel.add(chartPanel2);
         panel.add(chartPanel3);
        setContentPane(panel);
         CategoryPlot plot = chart.getCategoryPlot();
         
        DateAxis axis = (DateAxis) plot.getRangeAxis();
        axis.setRange(date(10, Calendar.MAY, 2016, 15, 26, 29), date(10, Calendar.MAY, 2016, 15, 27, 39));
        chartPanel.setRangeZoomable(false);
         chartPanel.setDomainZoomable(false);
    //axis.setTickUnit(new DateTickUnit(DateTickUnitType.MILLISECOND, 10));
     //   axis.setDateFormatOverride(new SimpleDateFormat("S"));
      //  return chart;
    }

    public static IntervalCategoryDataset createDataset() {

         s1 = new TaskSeries("Scheduled");
        Task task1 = new Task("VM1",
                new SimpleTimePeriod(date(10, Calendar.MAY, 2016, 15, 26, 30),
                        date(10, Calendar.MAY, 2016, 15, 26, 31)));
        Task task2 = new Task("VM2",
                new SimpleTimePeriod(date(10, Calendar.MAY, 2016, 15, 26, 31),
                        date(10, Calendar.MAY, 2016, 15, 26, 32)));
        Task task3 = new Task("VM3",
                new SimpleTimePeriod(date(10, Calendar.MAY, 2016, 15, 26, 32),
                        date(10, Calendar.MAY, 2016, 15, 26, 33)));
        Task task4 = new Task("VM4",
                new SimpleTimePeriod(date(10, Calendar.MAY, 2016, 15, 26, 33),
                        date(10, Calendar.MAY, 2016, 15, 26, 34)));

        s1.add(task1);
        s1.add(task2);
        s1.add(task3);
        s1.add(task4);
        final TaskSeriesCollection collection = new TaskSeriesCollection();

        collection.add(s1);
        //  collection.add(s2);

        return collection;
    }
    
public static IntervalCategoryDataset createDataset2() {

        s1 = new TaskSeries("Scheduled");
        Task task1 = new Task("VM1",
                new SimpleTimePeriod(date(10, Calendar.MAY, 2016, 15, 26, 30),
                        date(10, Calendar.MAY, 2016, 15, 26, 31)));
        Task task2 = new Task("VM2",
                new SimpleTimePeriod(date(10, Calendar.MAY, 2016, 15, 26, 31),
                        date(10, Calendar.MAY, 2016, 15, 26, 32)));
        Task task3 = new Task("VM3",
                new SimpleTimePeriod(date(10, Calendar.MAY, 2016, 15, 26, 32),
                        date(10, Calendar.MAY, 2016, 15, 26, 33)));
        Task task4 = new Task("VM4",
                new SimpleTimePeriod(date(10, Calendar.MAY, 2016, 15, 26, 33),
                        date(10, Calendar.MAY, 2016, 15, 26, 34)));
        Task task1_2 = new Task("VM1",
                new SimpleTimePeriod(date(10, Calendar.MAY, 2016, 15, 26, 34),
                        date(10, Calendar.MAY, 2016, 15, 26, 35)));
        
        task1.addSubtask(task1);
        task1.addSubtask(task1_2);
        s1.add(task1);
        
        s1.add(task2);
        s1.add(task3);
        s1.add(task4);
        final TaskSeriesCollection collection = new TaskSeriesCollection();

        collection.add(s1);
        //  collection.add(s2);

        return collection;
    }
    public static IntervalCategoryDataset createDataset3() {

     
        s1 = new TaskSeries("Scheduled");
        Task task1 = new Task("VM1",
                new SimpleTimePeriod(date(10, Calendar.MAY, 2016, 15, 26, 30),
                        date(10, Calendar.MAY, 2016, 15, 26, 31)));
        Task task2 = new Task("VM2",
                new SimpleTimePeriod(date(10, Calendar.MAY, 2016, 15, 26, 31),
                        date(10, Calendar.MAY, 2016, 15, 26, 32)));
        Task task3 = new Task("VM3",
                new SimpleTimePeriod(date(10, Calendar.MAY, 2016, 15, 26, 32),
                        date(10, Calendar.MAY, 2016, 15, 26, 33)));
        Task task4 = new Task("VM4",
                new SimpleTimePeriod(date(10, Calendar.MAY, 2016, 15, 26, 33),
                        date(10, Calendar.MAY, 2016, 15, 26, 34)));
        Task task1_2 = new Task("VM1",
                new SimpleTimePeriod(date(10, Calendar.MAY, 2016, 15, 26, 34),
                        date(10, Calendar.MAY, 2016, 15, 26, 35)));
         Task task2_2 = new Task("VM2",
                new SimpleTimePeriod(date(10, Calendar.MAY, 2016, 15, 26, 36),
                        date(10, Calendar.MAY, 2016, 15, 26, 37)));
          Task task3_2 = new Task("VM3",
                new SimpleTimePeriod(date(10, Calendar.MAY, 2016, 15, 26, 35),
                        date(10, Calendar.MAY, 2016, 15, 26, 36)));
        
        task1_2.addSubtask(task1_2);
        task1_2.addSubtask(task1);
        s1.add(task1_2);
         task2.addSubtask(task2);
        task2.addSubtask(task2_2);
        s1.add(task2);
         task3.addSubtask(task3);
        task3.addSubtask(task3_2);
        s1.add(task3);
        s1.add(task4);
        final TaskSeriesCollection collection = new TaskSeriesCollection();

        collection.add(s1);
        //  collection.add(s2);

        return collection;
    }

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

    private static Date date(final int day, final int month, final int year, final int hour, final int min, final int sec) {

        final Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day, hour, min, sec);
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
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Gantt_Chart.class.getName()).log(Level.SEVERE, null, ex);
        }
         Task task = new Task("VM5",
                new SimpleTimePeriod(date(10, Calendar.MAY, 2016, 15, 26, 35),
                        date(10, Calendar.MAY, 2016, 15, 26, 36)));
        s1.add(task);
       
//        IntervalCategoryDataset dataset = createDataset3();
//        chart = createChart(dataset);
//        chart.fireChartChanged();
//        ChartPanel chartPanel = new ChartPanel(chart);
//      //  chartPanel.setPreferredSize(new java.awt.Dimension(800, 470));
//        demo.setContentPane(chartPanel);
//        demo.revalidate();
//        System.err.println("done");
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException ex) {
//            Logger.getLogger(Gantt_Chart.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        dataset = createDataset3();
//        chart = createChart(dataset);
//        chart.fireChartChanged();
//        chartPanel = new ChartPanel(chart);
//      //  chartPanel.setPreferredSize(new java.awt.Dimension(800, 470));
//     
//        demo.setContentPane(chartPanel);
//        demo.revalidate();
//        System.err.println("done");

    }
}
