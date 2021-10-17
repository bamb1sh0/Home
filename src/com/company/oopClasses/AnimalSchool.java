package com.company.oopClasses;

public class AnimalSchool{
    public static void main(String[] args) {
        duck duck = new duck();
        duck.run();
        duck.swim();
        squirrel squirrel = new squirrel();
        squirrel.clim();
        squirrel.run();
        squirrel.swim();
    }
}
    interface runnable{
        public void run();
    }
    interface swimbable{
        public void swim();
    }
    interface climbable{
        public void clim();
    }


class duck implements swimbable, runnable{
    @Override
    public void run() {
        System.out.println("Duck: I am very poor in running");
    }
    @Override
    public void swim() {
        System.out.println("Duck: I am excellent in swimming");
    }
}
class squirrel implements runnable,climbable,swimbable{
    @Override
    public void run() {
        System.out.println("Squirrel: I am excellent in running");
    }
    @Override
    public void clim() {
        System.out.println("Squirrel: I am excellent in climbing");
    }
    @Override
    public void swim() {
        System.out.println("Squirrel: I am bad in swimming");
    }
}

