package com.company.Homework;

public class Homework5 {
    public static void main(String[] args) {
        buildFigurePattern25();
        //7. Отсортировать элементы массива в возрастающем порядке.
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 50);
            System.out.print(arr[i] + "  ");
        }
        System.out.print("\n");
        bubbleSort(arr);
        for (int i : arr) {
            System.out.print(i + "  ");
        }

    }
public static void bubbleSort(int[] arr) {

    for (int i = arr.length - 1; i > 0; i--) {
        for (int j = 0; j < i; j++) {
            if (arr[j] > arr[j + 1]) {
                int tmp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = tmp;
            }
        }
    }
}
    public static void buildFigurePattern25() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++)
                System.out.print(i + " ");
            System.out.println();
        }
    }
}




