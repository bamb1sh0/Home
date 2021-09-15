package com.company.Arrays;

public class commandLine {

    public static void main(String[] args) {

        // В параметрах командной строки задаются два числа
        // Программа выводит их сумму
        int sum = 0;
        int a = Integer.parseInt(args [0]);
        int b = Integer.parseInt(args [1]);
        int d = Integer.parseInt(args [2]);
        int c = a + b + d;
        System.out.println(c);
        for (int i = 0; i < args.length; i++) {
            sum += Integer.parseInt(args[i]);

        }
        System.out.println(sum);


    }

    }
