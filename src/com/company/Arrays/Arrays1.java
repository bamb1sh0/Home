package com.company.Arrays;

public class Arrays1 {
    static int size = 10;
    static int[] arr = new int[size];
    public static void main(String[] args) {
        FillOrder();print();
        System.out.println(sum());
        }
        public static void FillOrder() {
            for (int i = 0; i < size; i++) {
                arr[i] = i + 1;
            }
        }
        public static void print(){
            for (int element : arr){
            System.out.print(element+ " ");
            }
            System.out.println();
    }
    public static int sum() {
        int sum = 0;
        for (int element : arr)
            sum += element;
            return sum;
    }
}












