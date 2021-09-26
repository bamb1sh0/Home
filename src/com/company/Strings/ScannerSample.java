package com.company.Strings;

import java.util.Scanner;

public class ScannerSample {
    public static void main(String[] args) {
        /*
      What is your name? - Hello, name!
      How old are you? - You are 30 years old.
      What is your favorite food? - Your favorite food is food.
      Enter your height. - You are 170 cm tall.
       */
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Hello, "+name+"!"); //или System.out.printf("Hello %s!",name);
        System.out.print("How old are you?");
        int age = scanner.nextInt();
        System.out.println("You are "+age+" years old.");
        System.out.print("What is your favorite food?");
        String food = scanner.next();
        System.out.println("Your favorite food is "+food);
        System.out.print("Enter your height?");
        double height = scanner.nextDouble();
        System.out.println("You are "+height+" cm tall.");
    }
}
