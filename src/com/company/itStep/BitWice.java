package com.company.itStep;
public class BitWice {

    public static void main(String[] args) {
    /*Задание 1. Обнулить бит в первом разряде числа N. Остальные
        биты не должны изменить свое значение. Вывести на консоль в двоичном виде.*/
        byte b1 = 0b1011;
        byte result1 = (byte) (~(1 << 1) & b1);
        System.out.println(Integer.toBinaryString(result1));

        /*Задание 2. Вывести на консоль 2 в степени n. Для вычисления ис-
         пользовать только побитовые операции. */

        byte b2 = 2;
        int result2 = (byte) (b2 << 1);
        System.out.println(result2);

        /*Задание 3. Установить 2-й бит числа N равным 1. Вывести результат
        на консоль в двоичном виде.*/

        byte b3 = 1;
        int result3 = (byte) (1 << 1 | b3);
        System.out.println(Integer.toBinaryString(result3));


        /*Задание 4. Инвертировать 1-й бит числа N. Вывести результат на
        консоль в двоичном виде.*/

        byte b4 = 0b0011;
        int result4 = (byte) (1 << 1) ^ b4;
        System.out.println(Integer.toBinaryString(result4));

        /*Задание 5. Установить 1-й бит числа N равным 0. Вывести результат
          на консоль в двоичном виде.*/

        byte b5 = 0b1111;
        int result5 = (byte) (~(1 << 1) & b5);
        System.out.println(Integer.toBinaryString(result5));

        /*Задание 6. Обнулить все кроме последних 3 битов числа N. Вывести
        результат на консоль в двоичном виде.*/

        byte b6 = 0b0110_0101;
        int result6 = (byte) ((1 << 3) - 1) & b6;
        System.out.println(Integer.toBinaryString(result6));

        /*Задание 7. Определить значение 2-го бита числа N. Вывести резуль-
          тат на консоль в двоичном виде.*/
        byte b7 = 0b1111;
        int result7 = (byte) (b7 >> 2) & 1;
        System.out.println(Integer.toBinaryString(result7));


        /*Задание 8. Обнулить крайний левый (старший разряд) единичный
        бит числа N. Вывести результат на консоль в двоичном виде.*/

        byte b8 = 123;
        int result8 = (byte) ((1 << 6) ^ b8);
        System.out.println(Integer.toBinaryString(result8));

        /*Задание 9. Определить, имеют ли числа M и N разные знаки, исполь-
          зуя только побитовые и условные операторы.*/

        byte a9 = 11, b9 = -8;
        byte c9 = 20, d9 = 15;
        boolean result9 = a9 / b9 > 0;
        boolean res9 = (c9 ^ d9) >= 0;
        System.out.println(result9);
        System.out.println(res9);

        /*Задание 10. Найти и вывести на консоль минимальное из двух чисел
        M и N, используя только побитовые и арифметические операции (без использования условного оператора).*/

        byte a10 = 100, b10 = 1;
        boolean rs = a10 <= b10;
        System.out.println(rs);

        /*Задание 11. Посчитать и вывести на консоль количество единичных
        битов в числе N. Вывести на консоль исходное число в двоичном виде и результат.*/

        int a11 = 124;
        int count = 0;
        for (int i=0; i<10; i++)
        {
            if ((a11>>i) % 2 == 1)
            count++;
        }
        System.out.println(Integer.toBinaryString(a11) +" количество единичных битов " +count);

        /*Задание 12. Проверить, есть ли в двоичной записи числа n хотя бы
        один 0. Используя только побитовые и условные операторы.
        Вывести на консоль исходное число в двоичном виде и результат.*/

















    }
}
