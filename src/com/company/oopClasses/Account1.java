package com.company.oopClasses;

public class Account1{
    private double amount = 0;

    public void addMoney(double sum){
        amount+=sum;
    }

    public double getAmount() {
        return amount;
    }
}
