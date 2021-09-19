package com.company.Arrays;

import java.util.Random;

public class Arrays1 {
    static int size = 10;
    static int[] arr = new int[size];

    public static void main(String[] args) {
        //arr = new int[]{1,2,6,8,34,4,6,7,11,5};
        //arr[0] = 1;
        //arr[1] = 11;
        //arr[2] = 33;
        //arr[9] = 23;
        //fillRandom();
        fillOrder();
        //reverse();
        //print();
        //System.out.println(sum());
        //|System.out.println(max());
        System.out.println(find(1));
    }

    public static void fillOrder() {
        for (int i = 0; i < size; i++) {
            arr[i] = i + 1;
        }
    }

    public static void print() {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static int sum() {
        int sum = 0;
        for (int element : arr)
            sum += element;
        return sum;
    }

    public static void fillRandom() {
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(90) + 10;
        }
    }

    public static int max() {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (max < arr[i])
                max = arr[i];
        return max;

    }

    public static void reverse() {
        for (int i = 0; i < size / 2; i++)
            swap(i, size-i-1);
    }

    public static void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int find(int element) {
        int index = -1;
        for (int i = 0; i < size; i++)
            if (arr[i] == element){
                index = i;
    }
            return index;
    }
}




















