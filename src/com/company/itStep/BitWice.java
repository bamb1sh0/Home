public class BitWice {

    public static void main(String[] args){
    /*Задание 1. Обнулить бит в первом разряде числа N. Остальные
        биты не должны изменить свое значение. Вывести на консоль в двоичном виде.*/
        byte b = 0b1011;
        byte result = (byte)(~(1 << 1) &b);
        System.out.println(result);

        /*Задание 2. Вывести на консоль 2 в степени n. Для вычисления ис-
         пользовать только побитовые операции. */

        byte a = 2;
        int result1 = (byte)(a << 1);
        System.out.println(result1);

        /*Задание 3. Установить 2-й бит числа N равным 1. Вывести результат
        на консоль в двоичном виде.*/

        byte n = 1;
        int result2 = (byte)(1 << 1 | n);
        System.out.println(result2);


        /*Задание 4. Инвертировать 1-й бит числа N. Вывести результат на
        консоль в двоичном виде.*/

        byte b2 = 11;
        int  result3 = (byte)(1<<1)^b2;
        System.out.println(result3);



    }
}
