package bsu.fpmi.ep2014;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.jar.Manifest;

/**
 * Created by stas on 05.06.14.
 */

public class TestFrame {

    public static void main(String args[]) {
        JFrame frame = new JFrame();
        frame.setBackground(Color.cyan);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(900, 900));
        frame.setVisible(true);
        frame.setBackground(Color.cyan);
        frame.add(new VerticalLine(15,Color.black) );
        VerticalLine line = new VerticalLine(5, Color.RED);
        line.setBounds(0,100,10000000,7);
        frame.add(line);


        System.out.println(line.getSize());
        frame.pack();

    }

}
