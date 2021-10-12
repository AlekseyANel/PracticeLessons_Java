package com.practice.baseLessons;

import java.util.Scanner;

//Task.  Упражнения со строками (методы)
public class StringExercises {
    public static void main(String[] args) {
    System.out.println("---------------------------------------------");
    //извлечение одного символа по индексу из строки
    String str = "StringExercises";
    char chr = str.charAt(6);
        System.out.println("\""+chr +"\" char from string: \"" + str+"\"");

    System.out.println("---------------------------------------------");
    //извлечь сразу группу символов или подстроку
    str = "Hello fucking, world!";
    int start = 6;//начальный символ в строке, с которого будем формировать подстроку
    int finish = 13;//конечный символ в строке, до которого будем формировать подстроку
    char [] charArray = new char[finish-start];//объявляем массив для будущей подстроки
        str.getChars(start, finish, charArray, 0);
        System.out.println(charArray);

    System.out.println("---------------------------------------------");
    //сравнение двух строк
        String str1 = "Hello!";
        String str2 = "hello!";
        System.out.println(str1.equals(str2));//сравнение с учетом регистра
        System.out.println(str1.equalsIgnoreCase(str2));//сравнение без учета регистра

        System.out.println("---------------------------------------------");
        //indexOf() находит индекс первого вхождения подстроки в строку,
        // а метод lastIndexOf() - индекс последнего вхождения.
        // Если подстрока не будет найдена, то оба метода возвращают -1
        str = "Hello world!";
        int indexFirstL = str.indexOf("w");//один символ
        int indexRLD = str.indexOf("rld");//подстрока начинается с буквы "r"
        int indexLastL = str.lastIndexOf("l");//последний символ
        System.out.println(indexFirstL +", " + indexRLD +", " + indexLastL);

        System.out.println("---------------------------------------------");
        //Метод replace() позволяет заменить в строке одну последовательность символов на другую
        String replStr1 = str.replace('l', 'd');
        String replStr2 = str.replace("Hello", "Bye-bye");
        System.out.println(str +", " + replStr1 +", " + replStr2);

        System.out.println("---------------------------------------------");
        //Метод trim() позволяет удалить начальные и конечные пробелы
        str = " Hello world! ";
        System.out.println(str +", " + str.trim());

        System.out.println("---------------------------------------------");
        //Метод substring() возвращает подстроку, начиная с определенного индекса до конца
        // или до определенного индекса
        System.out.println(str.trim().substring(0,5));
        System.out.println(str.trim().substring(6));

        System.out.println("---------------------------------------------");
        //Метод toLowerCase() переводит все символы строки в нижний регистр,
        // а метод toUpperCase() - в верхний
        System.out.println(str.trim().toLowerCase());
        System.out.println(str.trim().toUpperCase());

        System.out.println("---------------------------------------------");
        //Метод split() позволяет разбить строку на подстроки по определенному разделителю.
        // Разделитель - какой-нибудь символ или набор символов передается в качестве параметра regex в метод
        String [] words = str.split(" "); //создаётся массив слов
        for (String i : words) { //печать в цикле каждого слова из массива
            System.out.println(i);
        }


    }
}

