package com.company.ArraysSort2;

import java.util.Random;

public class ArraysSort1 {
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static int size;
    public static int[] a;

    public static void main(String[] args) {
        size = 5;
        a = new int[size];
        fillRandom();
        //selectionSort();
        printColor(0, 0);
        //combSort();
        bogoSort();
    }

    public static void fillRandom() {
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            a[i] = random.nextInt(81) + 10;
        }
    }

    public static void printColor(int first, int second) {
        for (int i = 0; i < a.length; i++) {
            if (i == first || i == second)

                System.out.print(ANSI_RED);


            System.out.print(a[i] + " ");
            System.out.print(ANSI_WHITE);
        }
    }

    public static void selectionSort() {
        for (int i = 0; i < size; i++) {
            int min = a[i], index = 0;
            for (int j = i; j < size; j++)
                if (min > a[j]) {
                    min = a[j];
                    index = j;
                }
            if (index != 0) {
                printColor(i, index);
                swap(i, index);
            }
        }

    }

    public static void swap(int i, int j) {
        int temp = a[1];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void combSort() {
        double factor = 1.2473309; // фактор уменьшения
        int step = a.length - 1; // шаг сортировки
        while (step >= 1) {
            for (int i = 0; i + step < a.length; i++)
                if (a[i] > a[i + step])
                    swap(i, i + step);
            step /= factor;
        }
    }

    public static void bogoSort() {
        while (!isSorted())
            shuffle();
    }

    public static boolean isSorted() {
        for (int i = 1; i < a.length; i++)
            if (a[i] < a[i - 1])
                return false;
        return true;
    }

    public static void shuffle() {
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            int index = random.nextInt(a.length);
            printColor(i, index);

            swap(i, random.nextInt(a.length));
        }
    }
}