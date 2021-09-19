package com.company.Arrays;
import java.util.Arrays;

import static com.company.Arrays.Arrays1.swap;


//двумерные массивы
public class Arrays3 {
    private static int a[] = {5, 3, 2, 4, 7, 5, 2, 7, 9};

    public static void main(String[] args) {

        for (int j = 0; j < a.length - 1; j++) {
            if (a[j] > a[j + 1])
                swap(j, j + 1);


        }
        System.out.println(Arrays.toString(a));

    }
    public static void swap(int i, int j){
        int temp =a[1];
        a[i]=a[j];
        a[j] = temp;
    }
}
