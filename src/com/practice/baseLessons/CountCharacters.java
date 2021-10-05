package com.practice.baseLessons;

import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {
        //create Scanner to obtain input characters from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter a string of any characters: ");
        String text = scanner.nextLine();// read string from console and write to "text"-string

        char [] charArray = text.toCharArray();//create char array from "text"-string
        int letters = 0;//announce variable for letter quantity
        int digits = 0;//announce variable for digit quantity
        int spaces = 0;//announce variable for space quantity
        int others = 0;//announce variable for other quantity

        for (int i=0; i<text.length(); i++) {//check all the string characters
            if (Character.isLetter(charArray[i])) {//Use static class Character with method isLetter for check is charArray[i] a letter
                letters++;
            } else if (Character.isDigit(charArray[i])) {
                digits++;
            } else if (Character.isSpaceChar(charArray[i])) {
                spaces++;
            } else {
                others++;
            }
        }
        System.out.println("Total characters in this string:");
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("spaces = " + spaces);
        System.out.println("others = " + others);



    }
}
