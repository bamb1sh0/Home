package com.company.oopClasses;

import java.util.LinkedList;
import java.util.List;

public class Animals {
    public static void main(String[] args) {
        //Animal cat = new cat();
        //cat.sound();
        List <Animal> Animals = new LinkedList<>();
        Animals.add(new cat());
        Animals.add(new mouse());
        Animals.add(new dog());
        Animals.forEach(animal -> animal.sound());
    }

}
abstract class Animal{
    abstract public void sound();
}
class cat extends Animal{
    @Override
    public void sound() {
        System.out.println("Meow");

    }
}

class mouse extends Animal{
    @Override
    public void sound() {
        System.out.println("Squeak");

    }
}

class dog extends Animal{
    @Override
    public void sound() {
        System.out.println("Woof");

    }
}

