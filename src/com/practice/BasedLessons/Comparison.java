package com.practice.BasedLessons;

import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        // create Scanner to obtain input from command window - console
        Scanner scanner = new Scanner(System.in);
        int num1; // first number to compare
        int num2; // second number to compare

        System.out.println("Please, enter first number (ex.20): ");
        num1 = scanner.nextInt();// read first number from console
        System.out.println("Please, enter second number(ex.4): ");
        num2 = scanner.nextInt();// read second number from console

        if (num1==num2) {
            System.out.println(num1+"="+num2);
            System.exit(1);}
        else {
            System.out.println(num1+"!="+num2);}

        if (num1<num2) {
            System.out.println(num1+"<"+num2);}
        else {
            System.out.println(num1+">"+num2);}

        scanner.close();
    }
}
