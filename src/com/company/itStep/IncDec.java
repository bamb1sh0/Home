package com.company.itStep;

public class IncDec {
    public static void main(String[] args){
        int x,y;
        x = 1;
        y = x++; // 1)x = 1 , 2)y = 1, 3)x = x + 1  постдекримент ++ --
        y = ++x; // 1)x = 1, 2) y = 2, 3)x = x + 1  ++ -- предекримент
        y = x--; // 1)x = 1, 2) y = 1, 3)x = x - 1
        y = --x; // 1)x = 1, 2) y = 0, 3)x = x - 1
    }
}
