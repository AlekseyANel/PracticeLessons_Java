package com.practice.baseLessons;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        //Инициализируем/получаем данные через консоль
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter a number for Multiplication Table: ");
        int num = scanner.nextInt();
        //Имплементируем таблицу умножения
        System.out.println("Multiplication table for: "+num);
        for (int i=1; i<=10; i++) {
            System.out.println(num+"x"+i+"="+(num*i));
        }
    }
}
