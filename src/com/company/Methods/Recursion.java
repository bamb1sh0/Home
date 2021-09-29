package com.company.Methods;

public class Recursion {
    static int n = 5;
    static int sum = 0;
    public static void main(String[] args) {
        //recurs(7);
        sumRecurs();
        System.out.println(sum);
    }
    static void recurs(){
        //System.out.println("Hi");
        if (n==0)
            return;
        System.out.println(n);
        n--;
        recurs();
        System.out.println(n);
    }
    static void recurs(int n){
        if (n==0)
            return;
       // System.out.println(n);               //выводит от 7 до 1
        recurs(n-1);                        //если sout после
        System.out.println(n);                 //выводит от 1 до 7
    }
    //Сложить числа от 1 до 5 (используя поле)
    public static void sumRecurs(){
        if (n==0) return;
        sum+=n;
        n--;
        sumRecurs();
    }
}
