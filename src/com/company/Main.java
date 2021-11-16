package com.company;

import java.io.Console;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        /** 1. Из пути файла в Windows извлечь каталог, краткое имя и расширение. C:\Windows\System32\calc.exe **/
        System.out.println("Задание3.1: ");
        File dir = new File ("C:/Windows/System32/calc.exe");
        System.out.println("directory: " + dir.getParentFile());
        System.out.println("file name: " + dir.getName());
        String[] extension = dir.toString().split("\\.");
        System.out.println("file extension: " + extension[extension.length-1]);




    }
}


















