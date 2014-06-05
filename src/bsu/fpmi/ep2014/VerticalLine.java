package bsu.fpmi.ep2014;

import java.awt.*;

/**
 * Created by stas on 05.06.14.
 */
public class VerticalLine extends Canvas{

    private int lineWidth;
    private Color color;

    VerticalLine(int width, Color color){
        this.lineWidth = width;
        this.color = color;
        Dimension size = new Dimension(Integer.MAX_VALUE, width + 2);
        setMaximumSize(size);
        setMinimumSize(size);
        setPreferredSize(size);
        setSize(size);

    }

    @Override
    public void paint(Graphics g) {
        g.setColor(color);
        g.fillRect(0, 1, getWidth(), 1 + lineWidth);
        g.setColor(Color.BLUE);
        g.drawRect(0,0, getWidth(),this.getHeight() -1);
       // System.out.println(this.getSize());
    }
}
