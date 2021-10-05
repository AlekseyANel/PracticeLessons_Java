package com.practice.baseLessons;
//печать чисел от 1 до 100, которые делятся на 3, 5 и на оба.
public class SpecificDivision {
    public static void main(String[] args) {

        System.out.println("Division by 3: ");
        for (int i=1; i<=100; i++) {
            if (i%3==0) {
                System.out.println(i);
            }
        }

        System.out.println("Division by 5: ");
        for (int i=1; i<=100; i++) {
            if (i%5==0) {
                System.out.println(i);
            }
        }

        System.out.println("Division by 3 and 5: ");
        for (int i=1; i<=100; i++) {
            if (i%3==0 && i%5==0) {
                System.out.println(i);
            }
        }

    }
}
