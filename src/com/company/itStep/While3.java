package com.company.itStep;

public class While3 {
    public static void main(String[] args){
        ////Проверить, содержит ли строка букву "a"
        //doWhile1();
        //while1();
        TaylorSeries();

    }
        public static void while1(){
            String s = "тестовая строка";
            int length = s.length();
            boolean flack = false;
            int i = 0;
            while (s.charAt(i) != 'а' && (i < length-1)) i++;
            if ((i < length-1) || (s.charAt(i)=='a')) flack = true;
            System.out.println(flack);

        }
        public static void doWhile1(){
            String s = "арос";
            int length = s.length();
            boolean flack = false;
            int i = -1;
            do {
                i++;
            }
                while (s.charAt(i) != 'а' && (i < length - 1)) ;
                if ((i < length - 1) || (s.charAt(i) == 'a')) flack = true;
                System.out.println(flack);

        }
        public static void TaylorSeries(){
            //sin(x) = x-x^3/3!+x^5/5!-x^7/7!+...
            int i = 1;
            double x = Math.PI/6, sum = 0, aps = 1e-10, a = x, denominator = 1;
            while (Math.abs(a) > aps){
                sum += a;
                denominator *= (i+1)*(i+2);
                a *= -x*x/denominator;
                i += 2;
            }
                System.out.printf("%f, %f, %n", Math.sin(x), sum);

        }
}
