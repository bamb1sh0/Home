package com.company.Controlwork;


import java.util.Random;
//Дан массив n целых чисел, содержащий не менее двух нулей.
//Найти сумму чисел, расположенных между последними двумя нулями.
public class Work1 {
    static int size = 5;
    static int[] arr = new int[size];

    public static void main(String[] args) {
        arr = new int[]{0, 1, 2, 3, 0};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 0){
                sum += arr[i];}

        }
        System.out.println(sum);
    }




}

