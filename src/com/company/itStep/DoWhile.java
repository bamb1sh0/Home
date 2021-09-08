package com.company.itStep;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        int i;

        do {


            System.out.println("Enter the number");
            Scanner scanner = new Scanner(System.in);
            i = scanner.nextInt();
        }
        while (i!=-1);
}

    }

