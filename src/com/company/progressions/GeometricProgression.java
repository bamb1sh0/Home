package com.company.progressions;

class GeometricProgression extends Progression{
    private int denom = 2;

    GeometricProgression(int initValue, int denom){
        this.initValue = initValue;
        this.denom = denom;
        this.elem = initValue;
    }
    GeometricProgression(int initValue){
        this.initValue = initValue;
        this.elem = initValue;
    }


    @Override
    public int getNext() {
        elem*=denom;
        sum+=elem;
        index++;
        return  elem;

    }
}
