package com.company.itStep;

public class CycleFor {
    public static void main(String[] args){
        /*
       // for (; ;)
            System.out.println("Hello");
        //Человек нажимает кнопку счетчика и прыгает через ступень
        for (int i = 0; i< 10; i++) {
            System.out.println(i + "  ");
            i++;
        }

         */
        //0,1,3,6,10
        for (int i = 0; i<16; i++){
            int a = 1;
            System.out.println(i++);
            i+=a;
            a++;
        }
    }
}
