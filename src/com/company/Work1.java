package com.company.Controlwork;


import java.util.Random;
//Дан массив n целых чисел, содержащий не менее двух нулей.
//Найти сумму чисел, расположенных между последними двумя нулями.
public class Work1 {
    static int size = 10;
    static int[] arr = new int[size];

    public static void main(String[] args) {
        arr = new int[]{1, 1, 2, 3, 0,1,1,1,3,0};
        int sum = 0;
        int min = 0;
        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i]==0) {
                min=i; 
                break;
            }
        }
        int max = arr.length;
        for (i = min+1; i < args.length; i++) {
            if (arr[i]==0) {
                max=i;
                break;
            }
        }
        for (i = min+1; i < max; i++){
            sum += arr[i];

        }
        System.out.println(sum);
    }
}

