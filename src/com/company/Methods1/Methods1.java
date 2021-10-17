package com.company.Methods1;

import java.util.Arrays;

public class Methods1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        swap(a, b);
        System.out.println();
        printHello();
        echo("Hello World");
        System.out.println(calculateCircleArea(2));
        System.out.println(calculateTriangleArea(5, 5));
        System.out.println(isOdNumber(4));
        System.out.println(max(123, 124));
        System.out.println(Arrays.toString(swap2(2, 5)));
        System.out.println(sum("Hello", "World"));
        System.out.println(sum(1,3,4));

    }

    static void printHello() {
        System.out.println("Hello");
    }

    static void echo(String s) {
        System.out.println(s);
    }

    static double calculateCircleArea(double r) {
        double area = Math.PI * r * r;
        return area;
    }

    static double calculateTriangleArea(double a, double b) {
        double area = a * b / 2;
        return area;
    }

    /**
     * Определить, является ли число нечетным
     */
    static boolean isOdNumber(int num) {
        if (num % 2 == 0)
            return false;
        return true;
    }

    /**
     * Определить максимальное из двух чисел
     */
    static int max(int a, int b) {
        if (a > b)
            return a;
        else return b;
    }

    /** Переставить два числа */

    static void swap(int a, int b) {
        int temp;
        temp = a;
        a = b;
        b = temp;
    }

    static int[] swap2(int a, int b) {
        int temp;
        temp = a;
        a = b;
        b = temp;
        int[] result = new int[2];
        result[0] = a;
        result[1] = b;
        return result;
    }

    static double sum(double a, double b) {
        return a + b;
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static String sum(String a, String b) {
        return a + b;
    }

    public static int sum(int ... args) {
        int result = 0;
        for (int arr : args)
            result += arr;
            return result;

    }
}

