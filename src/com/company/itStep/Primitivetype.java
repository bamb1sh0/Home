package com.company.itStep;

public class Primitivetype {

    public static void main(String[] args){

        //Wrappers classes
        System.out.printf("Boolean:min = %b, max = %b, range = %d %n",Boolean.FALSE,Boolean.TRUE,1);
        System.out.printf("Byte:min = %d, max = %d, range = %d %n",Byte.MIN_VALUE,Byte.MAX_VALUE,Byte.BYTES);
        System.out.printf("Short:min = %d, max = %d, range = %d %n",Short.MIN_VALUE,Short.MAX_VALUE,Short.BYTES);
        System.out.printf("Integer:min = %d, max = %d, range = %d %n",Integer.MAX_VALUE,Integer.MIN_VALUE,Integer.BYTES);
        System.out.printf("Long:min = %d, max = %d, range = %d %n",Long.MIN_VALUE,Long.MAX_VALUE,Long.BYTES);
        System.out.printf("Float:min = %f, max = %f, range = %d %n",Float.MIN_VALUE,Float.MAX_VALUE,Float.BYTES);
        System.out.printf("Double:min = %f, max = %f, range = %d %n",Double.MIN_VALUE,Double.MAX_VALUE,Double.BYTES);
        System.out.println(Double.POSITIVE_INFINITY);
        System.out.println(Double.NEGATIVE_INFINITY);
        System.out.println(Double.NaN);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MIN_NORMAL);

    }
}
