package com.practice.mapsLessons;

import java.util.*;

public class MapExample {
    public static  void  main(String[] args) {
        Person ivan = new Person(111,"Ivan", "Ivanov");
        Person petr = new Person(222,"Petr", "Petrov");
        Person sidor = new Person(333,"Sidor", "Sidorov");
        Person gleb = new Person(444,"Gleb", "Glebov");
        Map<Integer, Person> map = new HashMap<>();
        map.put(ivan.id, ivan);
        map.put(petr.id, petr);
        map.put(sidor.id, sidor);

        System.out.println(map.get(222));

        // получим весь набор ключей
        Set<Integer> keys = map.keySet();
        System.out.println(keys);
        // получить набор всех значений
        Collection<Person> values = map.values();
        System.out.println(values);

        //заменить элемент по ключу
        map.replace(222,gleb);
        // все элементы на печать //метод entrySet() возвращает
        // набор всех элементов в виде объектов Map.Entry<K, V>.
        System.out.println(map.entrySet());

        // или перебор элементов на печать по фамилии
        for (Map.Entry<Integer, Person> i : map.entrySet())
            System.out.println(i.getKey() +"="+
                    i.getValue().lastName);

        System.out.println(map.size());
        map.clear();
    }

}
class Person {

    int id;
    String firstName;
    String lastName;

    public Person(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

}
