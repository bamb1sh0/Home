package com.company.Arrays;
import java.util.Arrays;
public class GnomeSort {
    private static int a[] = {5, 3, 2, 4, 7, 5, 2, 7, 9};
    public static int size;
    public static int[] arr;
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {
        gnomeSort();
        //inSertion();
    }

    private static void swap(int i, int j) {
    }

    //Гномья сортировка
    public static void gnomeSort() {

        for (int i = 0; i < a.length; i++)
            for (int j = i; j > 0 && a[j - 1] > a[j]; j--) {
                System.out.print(a[i] + " ");
                System.out.print(ANSI_RED);
                if (a[j] > a[j + 1]) {
                    //printColor(j, j + 1);
                    swap(j, j + 1);
                    {
                        swap(j - 1, j);
                    }
                }
                System.out.println(Arrays.toString(a));
            }}
            }


        /**Сортировка вставками
        public static void inSertion(a) {
            for (int i = 0; i < a.length; i++) {
                int spec = a[i];
                int j;
                for (j = i; j > 0 && spec < a[j - 1]; j--)
                    a[j] = a[j - 1];
                a[j] = spec;
                System.out.print(spec);
            }
        }

        }

    }
         */



