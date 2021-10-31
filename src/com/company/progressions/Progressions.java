package com.company.progressions;

public class Progressions {
    public static void main(String[] args) {
    ArithmeticProgression progression = new ArithmeticProgression(1);
        System.out.println(progression.getNext());
        System.out.println(progression.getNext());
        System.out.println("sum: "+progression.getSum());

        GeometricProgression progression2 = new GeometricProgression(1);
        System.out.println(progression2.getNext());
        System.out.println(progression2.getNext());
        System.out.println("sum: "+progression2.getSum());

    }
}



