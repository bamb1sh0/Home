package com.company.oopClasses;

public class Car{
    private Colors color;

    Car(Colors color){
        this.setColor(color);
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }
}
