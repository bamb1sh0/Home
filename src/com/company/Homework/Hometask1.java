package com.company.Homework;


public class Hometask1 {

    public static void main(String[] args) {
	    /*
	    Homework
	     */
    /*
    2. Написать инструкцию, которая присваивает переменной sum нулевое значение
    */
        double sum;
        sum = 0;
    /*
    4. Записать инструкцию, которая уменьшает на два значение переменной counter.
    */
        byte counter = 127;
        counter -= 2;
    /*
    6. Записать в виде инструкции присваивания формулу вычисления значения функции у = –2,7x^3 + 0,23x^2 – 1,4
    */
        double y;
        double x = 1. ;
        y = -2.7*Math.pow(x,3) + 0.23*x*x - 1.4;
    /*
    8. Записать в виде инструкции присваивания формулу пересчета веса из фунтов в килограммы (один фунт — 405,9 г).
    */
        double funt;
        double kg = 1000;
        funt = 405.9/kg;
    /*
    10. Записать в виде инструкции присваивания формулу вычисления площади прямоугольника.
    */
        byte a = 10; // ширина
        byte b = 15; // длина
        int s; // площадь
        s = a*b;
    /*
    12. Записать в виде инструкции присваивания формулу вычисления площади трапеции: s = (a+b)⋅h/2;
    */
        Integer c = 1; // основание 1
        Integer d = 2; // основание 2
        double f = 5; // высота
        double g; // площадь трапеции
        g = (c+d) * f / 2;
        System.out.println(g);
    /*
    14. Записать в виде инструкции присваивания формулы вычисления площади поверхности и объема цилиндра.
    */
        double sc; // площадь цилиндра
        double vc; // объём цилиндра
        Integer h = null; // высота
        Integer j = null; // радиус
        sc = 2*Math.PI*j*(h+j);
        vc = Math.PI*j*j*h;

    /*
    16. Объявить необходимые переменные и записать в виде инструкции присваивания формулы вычисления объема и площади
    поверхности шара.
    */
        double sBall; //площадь шара
        double vBall; //объем шара
        Double rBall = 2.; //радиус шара
        sBall = 4*Math.PI*rBall*rBall;
        vBall = 4 / 3 * Math.PI*Math.pow(rBall,3);
    /*
    18. Записать в виде инструкции присваивания формулу вычисления объема полого цилиндра.
     */
        double vCylinder; // объем полого цилиндра
        double ra1 = 10.5; // наружный радиус
        double ra2 = 5.3; // внутренний радиус
        double h1 = 3; // высота
        vCylinder = Math.PI*(ra1*ra1 - ra2*ra2)*h1;
    /*
    20. Записать в виде инструкции присваивания формулу пересчета температуры из градусов Фаренгейта в
    градусы Цельсия: C = 5/9(F-32).
    */
        double far = 15; // градусы Фаренгейта
        double cel; // градусы Цельсия
        cel = (far-32)/1.8;
    /*
    22. Записать в виде инструкции присваивания формулу вычисления сопротивления электрической цепи, состоящей из двух
    параллельно соединенных резисторов
    */
        double R; // сопротивления электрической цепи
        double r1 = 3; // резистор 1
        double r2 = 5; // резистор 2
        R = (r1*r2)/(r1+r2);


    }





}
