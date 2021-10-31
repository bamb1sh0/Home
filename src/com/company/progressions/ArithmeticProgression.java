package com.company.progressions;

class ArithmeticProgression extends Progression{
    private int diff = 1;

    ArithmeticProgression(int initValue, int diff){
        this.initValue = initValue;
        this.diff = diff;
    }
    ArithmeticProgression(int initValue){
        this.initValue = initValue;
    }


    @Override
    public int getNext() {
        elem+=diff;
        sum+=elem;
        index++;
        return  elem;

    }
}
