package com.practice.classLessons;

public class Interfaces{//основная клиентская программа

    public static void main(String[] args) {
        Book book = new Book ("qqq", "www");//объект от класса Буук
        book.print();

        Printable printable = new Book("Java. Complete Reference", "H. Shildt");// объект Printable, как экземпляр класса Буук
        printable.print();      //  Java. Complete Reference (H. Shildt)
        printable.printUndefined();//печать через дефолтный интерфейсный метод

        printable = new Journal("Foreign Policy");
        printable.print();      // Foreign Policy //throw Interface
        String name2 = ((Journal)printable).getName();
        System.out.println(name2);      // Foreign Policy - another one throw Journal class

        Printable.read(); //печать через статический интерфейсный метод

        System.out.println(printable.sum(1, 2));//печать через дефолтный интерфейсный метод
        System.out.println(printable.sum(1, 2, 4));//печать через дефолтный интерфейсный метод
    }
}
//интерфейс для печати
interface Printable{
    void print();
    default void printUndefined(){//дефолтный метод интерфейса
        System.out.println("Undefined printable");//не выводит на печать
    };
    static void read(){//статический метод интерфейса
        System.out.println("Read printable");
    };
    //к примеру нам надо выполнять в интерфейсе некоторые повторяющиеся действия,
    // и в этом случае такие действия можно выделить в приватные методы интерфейса
    default int sum(int a, int b){
        return sumAll(a, b);
    }
    default int sum(int a, int b, int c){
        return sumAll(a, b, c);
    }
    //Они Private могут быть статическими и нестатическими, но они не могут иметь реализации по умолчанию.
    //Подобные методы могут использоваться только внутри самого интерфейса
    private int sumAll(int... values){
        int result = 0;
        for(int n : values){
            result += n;
        }
        return result;
    }
}

//класс Буук
class Book implements Printable{
    String name;
    String author;
    Book(String name, String author){
        this.name = name;
        this.author = author;
    }
//в классе Буук имплементируем метод интерфейса, но уже со своей реализацией
    public void print() {
        System.out.printf("%s (%s) \n", name, author);
    }
//в классе Буук имплементируем дефолтный метод интерфейса c реализацией
    public void printUndefined() {
        System.out.println("Undefined printable блин");
    }

}

//класс Джурнал
class Journal implements Printable {
    private String name;
    Journal(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }
    public void print() {
        System.out.println(name);
    }

}