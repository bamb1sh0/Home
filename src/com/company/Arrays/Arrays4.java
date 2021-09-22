package com.company.Arrays;

public class Arrays4 {
    private static int numRouth = 5;
    private static int numCols = 6;
    private static int[][] arr = new int[numRouth][numCols];
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    private static int first;
    private static int second;


    public static void main(String[] args) {
        fillOrder();
        //System.out.println(arrToString());
        //System.out.println(arrToStringAllied());
        //fillOrderUD();
        printColor();


        StringBuilder result = new StringBuilder();
        String separator = ",";
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                result.append(arr[i][j]);
                if (j != arr[i].length - 1)
                    result.append((separator));
            }
            result.append("\n");
        }
        System.out.println(result);
    }


    public static void fillOrder() {
        for (int i = 0; i < numRouth; i++)
            for (int j = 0; j < numCols; j++)
                arr[i][j] = i * numCols + j + 1;
        //System.out.println(Arrays.toString(arr));

    }

    public static String arrToString() {
        StringBuilder result = new StringBuilder();
        String separator = ",";
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                result.append(arr[i][j]);
                if (j != arr[i].length - 1)
                    result.append((separator));{
                }
            }
            result.append("\n");
        }
        return result.toString();

    }

    public static String arrToStringAllied() {
        StringBuilder result = new StringBuilder();
        String pad = "     ";
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                String sNumber = Integer.toString(arr[i][j]);
                String sPad = pad.substring(sNumber.length()) + sNumber;
                result.append(sPad);
                if (j == 0) result.append(sNumber);
                else
                    result.append(sPad);
            }
            result.append("\n");
        }
        return result.toString();
    }

    public static void fillOrderUD() {
        for (int i = 0; i < numRouth; i++)
            for (int j = 0; j < numCols; j++)
                arr[i][j] = i * numCols + j + 1;

    }

    public static void fillSnake() {
        for (int i = 0; i < numRouth; i++)
            if (i % 2 == 0)
                for (int j = 0; j < numCols; j++)
                    arr[i][j] = i * numCols + j + 1;
            else
                for (int j = numCols - 1; j >= 0; j--)
                    arr[i][j] = i * numCols + (numCols - j);
    }

    //Напечатать два элемента массива красным
    public static void printColor() {
        for (int i = 0; i < arr.length; i++) {
            if (i == first || i == second)

                System.out.println(ANSI_RED);


            System.out.println(arr[i]);
            System.out.print(arr[i] + " ");
            System.out.print(ANSI_WHITE);
        }


    }
}













