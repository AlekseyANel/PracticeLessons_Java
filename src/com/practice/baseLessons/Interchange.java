package com.practice.baseLessons;

import java.util.Scanner;

public class Interchange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        //Инициализируем/получаем данные через консоль
        System.out.println("Please, enter first number (ex.20): ");
        int n1 = scanner.nextInt();
        System.out.println("Please, enter second number(ex.4): ");
        int n2 = scanner.nextInt();
        //Имплементируем обмен значениями, ипользуя только две переменные
        n1=n1+n2;//сумма этих значений
        n2=n1-n2;//n2 получает значение n1
        n1=n1-n2;//n1 получает значение n2
        System.out.println("First number become: " + n1);
        System.out.println("Second number become: " + n2);
        //Имплементируем обмен значениями, ипользуя промежуточную переменную
        int n;
        n=n1; n1=n2; n2=n;
        System.out.println("First number is " + n1+" again");
        System.out.println("Second number become " + n2+" again");

        scanner.close();
    }
}
