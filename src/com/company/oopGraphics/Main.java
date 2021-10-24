package com.company.oopGraphics;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Фроктал");
        frame.setSize(500,500);
        frame.setLocation(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        drawCanvas canvas = new drawCanvas();
        frame.getContentPane().add(canvas);
        frame.setVisible(true);

    }
    private static void draw(Graphics graphics, int xc, int yc, int radius){
        if (radius<5)
            return;
             else {
            graphics.drawOval(xc-radius, yc-radius, radius * 2, radius * 2);
            draw(graphics, xc - radius, yc, radius / 2);
            draw(graphics, xc + radius, yc, radius / 2);
            draw(graphics, xc , yc-radius, radius / 2);
            draw(graphics, xc, yc-radius, radius / 2);
        }
    }


     static class drawCanvas extends Canvas{
        public void paint(Graphics graphics){
            graphics.drawLine(0, 250, 500,250);
            int radius = 125;
            int xc = 250, yc= 250;
            graphics.setColor(Color.BLUE);
            draw(graphics,xc,yc,radius);


        }
    }
}

