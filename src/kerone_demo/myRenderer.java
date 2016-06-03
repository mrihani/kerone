/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kerone_demo;


import java.awt.Color;
import java.awt.Paint;
import org.jfree.chart.renderer.category.GanttRenderer;

/**
 *
 * @author Fadel
 */
public class myRenderer extends GanttRenderer {

    @Override
    public Paint getItemPaint(int row, int column) {
       // System.err.println(row +"    " + column);
        if (column==0)
            return Color.RED;
        if (column==1)
            return Color.BLUE;
        if (column==2)
            return Color.GREEN;
        if (column==3)
            return Color.YELLOW;
        return super.getItemPaint(row, column); //To change body of generated methods, choose Tools | Templates.
    //  return Color.BLACK;
    }
    
}
