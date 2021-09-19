package com.company.Arrays;

import java.util.Arrays;

public class Serie {
    public static void main(String[] args){
        int[] a = {1,2,3,4,5,6,7};
        int [] b = new int [a.length];
        b[0] = a[0];
        int count = 1;
        for (int i = 0; i < a.length; i++){
        //Присутсвует ли элемент а[1] в b
            boolean flag = false;
            for (int j = 0; j <count; j++)
                if (a[i]==b[j]) flag = true;
                if (!flag){
                    b[count] = a[i];
                    count++;
                }
        }
        //System.out.println(Arrays.toString(b));
        for (int i = 0; i <count; i++)
            System.out.println(b[i] + "");

    }
}
