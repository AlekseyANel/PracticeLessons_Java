package com.practice.baseLessons;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        // create Scanner to obtain input from command window - console
        Scanner scanner = new Scanner(System.in);
        int num;
        int sum = 0;

        System.out.println("Please, enter number (ex.2051): ");
        num = scanner.nextInt();// read number from console
        int i = num;//промежуточная переменная для цикла
        while (i!=0) {//условие работы/перебора цикла
            sum=sum+i%10;//получаем остатком деления на 10 крайнюю правую цифру
            // и суммируем её к sum
            i=i/10;//уменьшаем num на одну цифру слева. Последнее значение деления на 10 будет 0
        }
        System.out.println("Sum of the digits for number "+num+" is "+sum);
        scanner.close();
    }
}
