package com.company.Homework;

public class Hometask2 {
    public static void main(String[] args) {

        /**
         1. Загадать однозначное число в 10-тичной системе. Преобразовать его в двоичную и 16-ричную
         */
        int numDec = 7;
        String dec = "7";
        System.out.println("Decimal to Binary : " + dec + " = " + Integer.toBinaryString(numDec));
        System.out.println("Decimal to Hexadecimal : " + dec + " = " + Integer.toHexString(numDec));

        /**
         * 2. Загадать двузначное число в 10-тичной системе. Преобразовать его в двоичную и 16-ричную.
         */
        int numDec2 = 17;
        String dec2 = "17";
        System.out.println("Decimal to Binary : " + dec2 + " = " + Integer.toBinaryString(numDec2));
        System.out.println("Decimal to Hexadecimal : " + dec2 + " = " + Integer.toHexString(numDec2));
        /**
         * 3. Загадать 3-значное число в двоичной системе. Преобразовать его в десятичную и 16-ричную.
         */
        int numBin = 0b110;
        String bin = "0110";
        System.out.println("Binary to Decimal : " + bin + " = " + Integer.valueOf(numBin));
        System.out.println("Binary to Hexadecimal : " + bin + " = " + Integer.toHexString(numBin));
        /**
         4. Загадать 6-значное число в двоичной системе. Преобразовать его в десятичную и 16-ричную.
         */
        int numBin2 = 0b110101;
        String bin2 = "110101";
        System.out.println("Binary to Decimal : " + bin2 + " = " + Integer.valueOf(numBin2));
        System.out.println("Binary to Hexadecimal : " + bin2 + " = " + Integer.toHexString(numBin2));
        /**
         5. Загадать 2-значное число в 16-ричной системе. Преобразовать его в двоичную и десятичную.
         */
        int numHex = 0x3A;
        String hex = "3A";
        System.out.println("Hexadecimal to Decimal : " + hex + " = " + Integer.toBinaryString(numHex));
        System.out.println("Hexadecimal to Decimal : " + hex + " = " + Integer.valueOf(numHex));
        /**
         6. Загадать 4-значное число в 16-ричной системе. Преобразовать его в двоичную и десятичную.
         */
        int numHex2 = 0x123F;
        String hex2 = "123F";
        System.out.println("Hexadecimal to Decimal : " + hex2 + " = " + Integer.toBinaryString(numHex2));
        System.out.println("Hexadecimal to Decimal : " + hex2 + " = " + Integer.valueOf(numHex2));
    }
}