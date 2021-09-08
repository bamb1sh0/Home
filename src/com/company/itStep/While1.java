package com.company.itStep;

import java.util.Random;
import java.util.Scanner;

public class While1 {
    public static void main(String[] args) {
     /*   //Кузнечик прыгает на 1 см, за тем на 2, затем на 3 и т.д. Через сколько он поднимется на травинку 50см
        int l = 0;
        for(int i = 0; i<20; i++){
            int a = i;
            l += a;

            System.out.println(l);
            if (l > 50)
            {
                break;
            }

        int jump = 1;
        int distance = 0;
        int count = 0;
        while (distance < 50){
            distance += jump;
            System.out.println(distance);
            jump++;
            //count++;


    ////Вводить натуральные числа с клавиатуры. Признаком окончания ввода будет число -1
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        while (true){
            System.out.println("Enter the number");
            number = scanner.nextInt();}

        //Кот перемещается короткими бросками (по 5-7 шагов) по лесной тропинке.
        //За сколько перебежек он преодолеет расстояние в 50 шагов?
        int distance = 0;
        int pathLenght = 50;
        int count = 0;
        Random random = new Random();
        while (distance < pathLenght) {
            int forward = random.nextInt(3) +5;
            distance += forward;
            count++;
            System.out.println("Count - " +count); // если не в цикле выводит на каждой строке +1
            System.out.println(distance);
        }
        System.out.println("Count - " +count);
        */
        //Кот перемещается короткими бросками (по 5-7 шагов) по лесной тропинке.
        //Время от времени, почувствовав опасность, он отскакивает на 2-3 шага назад.
        //За сколько перебежек он преодолеет расстояние в 50 шагов?
        int distance = 0;
        int pathLenght = 50;
        int count = 0;
        while (distance < pathLenght) {
            Random random = new Random();

            int forward = random.nextInt(2) + 4;
            int backward = random.nextInt(3)+3;
            distance += forward;
            count++;
            System.out.println(distance);
            int prob = random.nextInt(3)+2;
            if (prob == 3);
            distance -= backward;
            System.out.println(distance);
        }
    }
}

