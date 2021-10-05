package com.practice.baseLessons;

import java.util.Scanner;

public class Math {
    public static void main(String[] args) {
        //Объявляем данные
        int n1;
        int n2;
        //Инициализируем/получаем данные через консоль
        //используем класс Scanner, который, в свою очередь использует объект System.in
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please, enter first number (ex.20): ");
        n1 = scanner.nextInt();// read first number from console
        System.out.println("Please, enter second number(ex.4): ");
        n2 = scanner.nextInt();// read second number from console
        //Имплементируем математические выражения
        System.out.println("addition: " + (n1+n2));
        System.out.println("subtraction: " + (n1-n2));
        System.out.println("multiplication: " + (n1*n2));
        System.out.println("division: " + (n1/n2));
        scanner.close();
    }
}
