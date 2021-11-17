package com.company.itStep;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int count = 'z' - 'a';
        System.out.println(count + 1);
        List<String> vocabulary = new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("src\\com\\company\\itStep\\vocabulary.txt"))) {
            String s;
            do {
                s = br.readLine();
                if (s != null)
                    vocabulary.add(s);
            }
            while (s != null);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(vocabulary.size());
        Collections.sort(vocabulary);
        //Collections.reverse(vocabulary);
        //for (String s : vocabulary)
        //System.out.println(s);

        /** Вывести первые 10 слов  **/

        ListIterator<String> iterator = vocabulary.listIterator(0);
        int i = 0;
        while (iterator.hasNext() && i < 10) {
            System.out.println();
            System.out.println(iterator.next() + " " + i++);

        }
        System.out.println();

        /** Вывести последние 10 слов **/


        iterator = vocabulary.listIterator(vocabulary.size());
        i = 0;
        while (iterator.hasPrevious() && i < 10) {
            System.out.println();
            System.out.println(iterator.previous() + " " + i++);
        }
        System.out.println();

        /**Сколько букв в самом длинном слове **/

        int max = 0;
        String s;
        iterator = vocabulary.listIterator(0);
        while (iterator.hasNext()) {
            s = iterator.next();
            if (s.length() > max)
                max = s.length();

        }
        System.out.println(max);

        /** Сколько слов однобуквенных, двухбуквенных и т.д.  **/

        int[] hist = new int[max];
        iterator = vocabulary.listIterator(0);
        while (iterator.hasNext()) {
            s = iterator.next();
            hist[s.length() - 1]++;


        }
        for (i = 0; i< max;i++)
            System.out.printf("Letters: %d , words: %d%n", i + 1,hist[i]);


        iterator = vocabulary.listIterator(0);
        s = iterator.next();
        if (s.equals(new StringBuilder(s).reverse().toString()))
            System.out.println(s);

        //ANAGRAMS


        }
    }

