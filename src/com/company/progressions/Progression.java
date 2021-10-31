package com.company.progressions;

abstract class Progression{
    protected int initValue = 0;
    protected int index = 0;
    protected int sum = 0;
    protected int elem = 0;

    public abstract int getNext();

    public int getSum() {
        return sum;
    }
}
