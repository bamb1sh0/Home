package com.company.itStep;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class CycleFor2 {
    public static void main(String[] args){
       /*
        JFrame jFrame = new JFrame("Counter");
        jFrame.setSize(500,300);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setContentPane(new DrawPane());

    }
}
    class DrawPane extends JPanel {
        public void paintComponent(Graphics g) {
            g.fillRect(50, 50, 20, 20);
            g.fillRect(51, 51, 21, 21);
            g.fillRect(30, 30, 50, 50);

        */

            //Запрашивать в цикле у пользователя имя, пока оно не станет непустым


            Scanner scanner = new Scanner(System.in);
            String name = "";
            while (name.isBlank()){
                System.out.println("Enter your name");
                System.out.println("Your name: " +scanner.nextLine());
            }
            }
    }






