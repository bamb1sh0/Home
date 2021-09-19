package com.company.Arrays;
//x-2/6*^2+(2*5)/(6*9)*x^3-
public class Serie1 {
    public static void main(String[] args){
        double sum = 0;
        double x = 0.5;
        double eps = 1e-10;
        double a = x;
        int num = 1;
        while (Math.abs(a)> eps){
            sum+=a;
            num++;
            a*=-x*(3*num-4)/(3*num);

                }
        double res = 3*Math.pow(1+x,1./3)-3;
        System.out.printf("calc: %f15, comp: %f15%n",sum,res);
    }
}
