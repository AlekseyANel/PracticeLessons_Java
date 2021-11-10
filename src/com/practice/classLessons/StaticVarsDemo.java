package com.practice.classLessons;

public class StaticVarsDemo {
    public static void main(String[] args) {
        StaticVars staticVars = new StaticVars();
        StaticVars staticVars1 = new StaticVars();
        StaticVars staticVars2 = new StaticVars();

        System.out.println(staticVars.a +" - вызов обычной переменной а через инстанс");
        System.out.println(staticVars.b+ " - вызов стат.переменной б через инстанс");
        System.out.println(StaticVars.b + " - вызов стат.переменной б без инстанса");


        staticVars1.b = 3;//перезапись стат.переменной б через инстанс staticVars1");
        staticVars2.b = 4;//перезапись этой же стат.переменной б через инстанс staticVars2");

        System.out.println(staticVars1.b);
        System.out.println(staticVars2.b);
    }
}

class StaticVars {
    int a = 1;
    static int b = 2;


}