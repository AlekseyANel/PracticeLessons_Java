package com.practice.classLessons;

import java.util.Scanner;

public class StaticMethodDemo {
    public static void main(String[] args) {
        System.out.println("Вызов статического метода без указания оъекта");
        StaticMethodClass.staticMethod(42);

        //Нельзя обратиться к нестатическому методу без указания объекта
        //nonStaticMethod();
        StaticMethodClass useStatic = new StaticMethodClass();
        System.out.println("Вызов нестатического метода с указанием оъекта");
        useStatic.nonStaticMethod();
        System.out.println("Вызов статического метода с указанием оъекта");
        useStatic.staticMethod(67);
    }

}

class StaticMethodClass {
    static String staticVar;
    static {
        System.out.println("Статический блок инициализирован. Введите строку, плиз!");
        Scanner scanner = new Scanner(System.in);
        staticVar = scanner.nextLine();
    }
    int nonStaticVar = 2;

    public void nonStaticMethod() {
        System.out.println("Нестатический метод, вот он!");
    }

    static void staticMethod(int localVar) {
        System.out.println("localVar = " + localVar);
        System.out.println("staticVar = " + staticVar);
        //Нельзя обратиться к нестатической переменной из статического метода
        //System.out.println("nonStaticVar = " + nonStaticVar); - not available
    }


}

