package com.company.Homework;

import java.io.Console;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) throws MalformedURLException {
        /** Задание 2.6
         * Дано предложение. Заменить в нем все вхождения буквосочетания бит на рог. */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите предложение задания 2.6");
        String s = scanner.nextLine();
        String result = s.replaceAll("бит", "рог");
        System.out.println(result);
        System.out.println("------------------------------------------------------------------");

        /** Задание 2.2
         * Дано предложение. Все его символы, стоящие на третьем, шестом, девятом и т. д. местах, заменить буквой а. **/

        System.out.println("Введите предложение задания 2.2");
        String sTask2 = scanner.nextLine();
        String s1 = "абвгдеёжзийклмнопрстуфхцчшщъьэюя";
        StringBuilder sb = new StringBuilder(sTask2);
        int counter = 0;
        for (int i = 0; i < sb.length(); i++){
            char currChar = sb.charAt(i);
            int idx = s1.indexOf(currChar);
            if (idx != -1) {
                if (counter % 2 == 1){
                    sb.setCharAt(i, 'а');
                }
                counter += 3;
            }
        }
        System.out.println(sTask2);
        System.out.println(sb);
        System.out.println("------------------------------------------------------------------");

        /** Задание 1.6 Из исходного слова путем «вырезок» и «склеек» его подстрок получить другие слова */

        String sTask1 = "исключение";
        String resultTask1 = sTask1.substring(sTask1.length()-8);
        String result1 = resultTask1.substring(0,4);
        String result2 = sTask1.substring(0,1);
        System.out.println(result1+result2);
        System.out.println(sTask1.charAt(3)+""+sTask1.charAt(6)+""+sTask1.charAt(1)+""+sTask1.charAt(7)
                +""+sTask1.charAt(0)+""+sTask1.charAt(2));
        System.out.println("------------------------------------------------------------------");

        /** Задание 3.1 Из пути файла в Windows извлечь каталог, краткое имя и расширение.
         *  C:\Windows\System32\calc.exe **/

        File dir = new File ("C:/Windows/System32/calc.exe");
        System.out.println("Directory: " + dir.getParentFile());
        System.out.println("File name: " + dir.getName());
        String[] extension = dir.toString().split("\\.");
        System.out.println("File extension: " + extension[extension.length-1]);
        System.out.println("------------------------------------------------------------------");

        /** Задание 3.3 Из URL извлечь протокол, домен, имя файла и расширение.
         *  https://www.computerhope.com/index.html **/

        URL url = new URL("https://www.computerhope.com/index.html");
        System.out.println("Protocol: "+url.getProtocol());
        System.out.println("Host: "+url.getHost());
        System.out.println("File name: "+url.getFile());
        String[] str = url.toString().split("\\.");
        System.out.println("File extension: " + str[str.length-1]);

    }
}
