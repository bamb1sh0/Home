package com.company.Controlwork;

import java.util.Arrays;
import java.util.Comparator;


public class work3 {
    //Дан двумерный массив nxn целых чисел. Найти минимальный из максимальных элементов ее строк.

    public static void main(String[] args) {
        int[][] arr = {{5, 3, 5}, {6, 4, 6}, {3, 7, 2}};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
       // System.out.println();
        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
        }
        System.out.println(Arrays.toString(new int[]{arr[0][0]}));
        System.out.println(Arrays.toString(new int[]{arr[1][0]}));
        System.out.println(Arrays.toString(new int[]{arr[2][0]}));

        }
    }







