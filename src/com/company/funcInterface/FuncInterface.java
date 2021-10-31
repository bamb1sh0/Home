package com.company.funcInterface;

import java.util.ArrayList;
import java.util.List;

public class FuncInterface {
    public static void main(String[] args) {
     Lamp lamp = new Lamp();
     Radio radio = new Radio();
     Button button = new Button();
     button.add(lamp);
     button.add(radio);
     button.on();

    }
}

//Класс электрическая кнопка
class Button{
    private boolean state = false;
    private List<SwitchableOn> devices = new ArrayList<>();

    public void on(){
        state = true;
        //for (SwitchableOn device:devices)
        //    device.switchOn();
        devices.forEach(SwitchableOn::switchOn);
    }

    public void add(SwitchableOn device){
        devices.add(device);
    }
}

@FunctionalInterface
interface SwitchableOn{
    void switchOn();
}

//Класс лампочка
class Lamp implements SwitchableOn{

    @Override
    public void switchOn(){
        System.out.println("The lamp is turn on");
    }
}

//Класс Radio
class Radio implements SwitchableOn{

    @Override
    public void switchOn(){
        System.out.println("The radio is turn on");
    }
}