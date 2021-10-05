package com.practice.baseLessons;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (isEven(i)==true) {
            System.out.println(i);}
        }
    }


    public static boolean isEven (int num) {
            return (num % 2 == 0);
    }


}

