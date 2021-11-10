package com.practice.baseLessons;

public class MySecondApp {
    public static void main(String[] args) {
        System.out.println("sdsdv");
        int count = 0;
        for (String str : args) {
            System.out.println(count++ + " аргумент = " + str);
            System.out.println("sdsdv");
        }
    }
}
