package com.practice.baseLessons;

import java.util.Scanner;

//Task.  разделить строку на слова
public class SentenceDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input an interesting sentence:");
        String sentence = scanner.nextLine();

        for (String i : sentence.split(" ")) {
            System.out.println(i);
        }
        //В Java split() возвращает массив строк, вычисленных путем разделения данной строки
        // вокруг данного регулярного выражения regex. В нашем случае - это пробелы " "
    }
}

