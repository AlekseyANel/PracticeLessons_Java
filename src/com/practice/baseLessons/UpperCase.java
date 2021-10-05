package com.practice.baseLessons;

import java.util.Scanner;

//Task. Заменить первые буквы в каждом слове предложения на заглавные
public class UpperCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input an interesting sentence:");
        String sentence = scanner.nextLine();

        String upperCaseSentence = "";
        Scanner sentenceScan = new Scanner(sentence);
        while (sentenceScan.hasNext()) {//запускаем цикл по предложению
            String word = sentenceScan.next();//считываем в цикле предложение до первого пробела
            // и присваиваем полученную подстроку (слово) в переменную word
            upperCaseSentence//набираем новое предложение из слов
                    += Character.toUpperCase(word.charAt(0))//делаем заглавной первую (0) букву каждого слова в цикле-предложении
                    +  word.substring(1) + " ";//к заглавной букве добавляем остальную часть слова (подстроку) + пробел
        }
        System.out.println(upperCaseSentence);
    }
}

