package com.company.Homework;

import java.util.Scanner;

public class Hometask3{

        public static void main(String[] args){
                /**
                 * 6. Дано трехзначное число. Определить, является ли его число десятков четным числом.
                 */
                int x;
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter the number");
                x = scanner.nextInt();
                int i = x /10%10;
        if (i % 2 == 0)
                System.out.println("Even");
        else
                System.out.println("Uneven");
        }








        }

