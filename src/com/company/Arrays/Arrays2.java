package com.company.Arrays;

public class Arrays2 {

    public static void main(String[] args){
        //Дан массив. Вычислить среднее арифметическое для его неповторяющегося подмножества.
        Arrays1.fillOrder();
        Arrays1.arr[1] = 1;
        Arrays1.print();
        int[] b = new int[Arrays1.size];
        int length = Arrays1.arr.length;
        b[0] = Arrays1.arr[0];
        int count = 1;
        for (int i = 0; i < length; i++){
            boolean flak = false;
            for (int g = 0; g < count; g++){
                if (Arrays1.arr[i]==b[g])
                    flak = true;
            }
            if(!flak) b[count++] = Arrays1.arr[i];

        }




    }
}
