package com.company.Strings;

public class Strings {


    public static void main(String[] args) {

        String s = "Strings examples";
        /** Получить символ по его номеру, а также номер символа в кодовой таблице UTF-8 **/

        System.out.println(s.charAt(0));
        char c = s.charAt(0);
        System.out.printf("Symbol:%c, number:%d%n", c, (int) c);


        /** Собрать строку из символов **/

        char c1 = '2', c2 = '\u00B7', c3 = '\u03C0', c4 = '=', c5 = '1',
                c6 = '8', c7 = '0', c8 = '\u00B0';
        s = "" + c1 + c2 + c3 + c4 + c5 + c6 + c7 + c8;
        System.out.println(s);

        /** вывести букву из массива **/

        char[] arr = {'a', 'b', 'c', 'd', 'e'};
        s = new String(arr);
        System.out.println(s);

        /** Сравнение строк.**/

        System.out.println('a' - 'b');
        String s1 = "first", s2 = "First"; //s2 = fjrst, s2 = second, s2 = first1
        System.out.println(s1.compareTo(s2));

        /** Конкатенация строк **/
        s1 += s2;
        System.out.println(s1);

        /** Проверить, содержит ли строковое значение только цифры **/

        s = "123s";
        System.out.println(isContainsOnlyDigits(s));


        /** Заменить символ в строке (точку на вопросительный знак) **/

        s = "Why is garbage collection necessary in Java.";
        int cos = s.indexOf(".");  //найти индекс символа
        StringBuilder sb = new StringBuilder(s);
        sb.setCharAt(cos, '?');  //заменяет символ
        System.out.println(sb);

        /** Заменить подстроку в строке **/

        s = "JVM is a %s virtual machine.";
        String result = s.replace("%s", "Java"); //меняет любую строку
        System.out.println(result);

        /** Извлечь из строки подстроки JVM и JRE **/
        s = "JDK vs JRE vs JVM";
        result = s.substring(s.length()-3); //вырезает символы
        System.out.println(result);
        result = s.substring(7,10);  //вырезает нужные символы
        System.out.println(result);

    }

    private static boolean isContainsOnlyDigits(String s) {
        for (int i = 0; i<s.length(); i++ )
            if (!Character.isDigit(s.charAt(i)))
            return false;
            return true;

    }
}