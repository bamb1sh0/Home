package com.company.Arrays;

import java.util.Random;

public class Arrays5 {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static int size;
    public static int[] arr;
    private static int second;
    private static int first;


    public static void main(String[] args) {
        size = 20;
        arr = new int[size];
        fillRandom();
        print();
        //bubbleSort();
        gnomeSort();
        //insertionSort();
        //selectionSort();
        //combSort();
        //bogoSort();
    }

    public static void print() {
        for (int element : arr) {
            System.out.print(element + " ");
        }

        System.out.println();
    }

    public static void fillRandom() {
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(90) + 10;

        }
    }

    public static void gnomeSort() {
        for (int i = 1; i < size; i++) {
            for (int j = i; j > 0 && arr[j] < arr[j - 1]; j--)
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
        }
    }

    private static void swap(int j, int i) {
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j] = temp;
    }

    public static void insertionSort() {
        for (int i = 0; i < arr.length; i++) {
            int spec = arr[i];
            int j;
            for (j = i; j > 0 && spec < arr[j - 1]; j--)
                arr[j] = arr[j - 1];
            arr[j] = spec;
            System.out.print(spec);
        }
    }

}