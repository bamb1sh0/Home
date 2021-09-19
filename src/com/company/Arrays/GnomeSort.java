package com.company.Arrays;
import java.util.Arrays;
public class GnomeSort {
    private static int a[] = {5,3,2,4,7,5,2,7,9};

    public static void main(String[] args) {
        //gnomeSort();
        //inSertion();
    }
    private static void swap(int i, int j) {
    }
        //Гномья сортировка
        public static void gnomeSort(){

            for (int i = 0; i < a.length; i++)
            for (int j  = i; j >0&&a[j-1]> a[j]; j--) {
                swap(j - 1, j);
            }
        System.out.println(Arrays.toString(a));
    }


    //Сортировка вставками
    public static void inSertion(){
        for (int i = 0; i < a.length; i++) {
            int spec = a[i];
            int j;
            for (j = i; j > 0 && spec < a[j-1]; j--)
                a[j] = a[j - 1];
            a[j]=spec;
            System.out.print(spec);
        }



    }

}
