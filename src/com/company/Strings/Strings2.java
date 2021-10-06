package com.company.Strings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Strings2 {
    public static void main(String[] args) {
        /** Удалить все скобки из выражения */

        String s = "What are the {wrapper} {classes} in Java?";  //Удалить все скобки из выражения
        String result = s.replaceAll("[{}]",""); //[] если симовлов много
        System.out.println(result);


        /** Заменить запятые на точку с запятой  */

        s = "int, byte, short, long, float, double, boolean, and char";
        result = s.replaceAll(",",";");
        System.out.println(result);

        /** Заменить первую букву на прописную */

        s = "what is JIT compiler in Java?";
        StringBuilder sb = new StringBuilder(s);
        sb.setCharAt(0,s.substring(0,1).toUpperCase().charAt(0));
        System.out.println(sb);

        /** Разбить строку на подстроки */

        s = "Access modifiers in Java are: \nDefault\nPrivate\nProtected\nPublic";
        String [] sArr = s.split("\n");
        //for (int i = 0; i<sArr.length; i++)
            for (String lm : sArr)
                System.out.println(lm);
                System.out.println(Arrays.toString(sArr));    //выведет массив с запятыми вместо \n

        /** Удалить концевые пробелы */

        s = " Object-Oriented Programming or OOPs is a programming style that is associated with concepts like: "
                + "innheritance, encapsulation, polymorphism, abstraction. ";
        System.out.println(s);
        result = s.trim();
        System.out.println(result);

        /** Найти в строке символ с наименьшим кодом UTF-8 */

        s = "string";
        char[] chars = s.toCharArray();
        int min = chars[0];
        for (int i = 0; i<chars.length; i++)
            if (min>chars.length)

                System.out.println(min);
         }
}
