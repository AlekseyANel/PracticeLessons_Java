package com.practice.baseLessons;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class EqualsHashCode {
    public static void main(String[] args) {
        //запускать раздельно по одному
        equalsTwoObj();
//        testArrayList();
//        testHashSetUpdate();
//        testHashSet();
    }

    private static void equalsTwoObj() {
        Contact contact1 = new Contact(124, "Ivan", "+38050");
        Contact contact2 = new Contact(124, "Ivan", "+38050");
        System.out.println(contact1.hashCode());
        System.out.println(contact2.hashCode());
        //Сравниваем по хэшкоду  contact1 и contact2
        System.out.println(contact1.equals(contact2));//если equals не переназначать будет фолс,
        // потому что разные ссылки contact1 и contact2 (хотя аргументы одинаковые)...
        // если equals переназначать - будет тру только на основе равных данных в объектах (но хэшкоды все еще разные)
        // если еще и хэш-код переназначать - они станут одинаковыми...
        // итого имеем два одинаковых объекта по данным и хэш-коду
    }
    private static void testArrayList() {
        Contact contact1 = new Contact(124, "Ivanov", "+38050");
        Contact contact2 = new Contact(124, "Ivanov", "+38050");
        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(contact1);
        //спрашиваем у коллекции: содержит она контакт2 и какой индекс у нее
        System.out.println(contacts.contains(contact2));//без переопределений: фолс//переопр иквелс: тру
        System.out.println(contacts.indexOf(contact2));//без переопределений: -1 нету//переопр иквелс: 0
        contacts.remove(contact2);//без переопределений: не удалил
        System.out.println(contacts.size());//без переопределений: сайз 1(остался)//переопр иквелс: 0
    }
    private static void testHashSet() {
        Contact contact1 = new Contact(124, "Ivanov", "+38050");
        Contact contact2 = new Contact(124, "Ivanov", "+38050");
        HashSet<Contact> contacts = new HashSet<>();
        contacts.add(contact1);
        contacts.add(contact2);
        //System.out.println(contacts.indexOf());//индекс отсутсвует
        System.out.println(contacts.size());
        //без переопределений: сайз 2(остался)//переопр иквелс или отдельно хэшкод: 2
        //переопр иквелс и хэшкод: 1
    }
    private static void testHashSetUpdate() {
        Contact contact1 = new Contact(124, "Ivanov", "+38050");
        Contact contactNew = new Contact(124, "Ivanov", "+38067");
        HashSet<Contact> contacts = new HashSet<>();
        contacts.add(contact1);

        contacts.remove(contactNew);
        contacts.add(contactNew);

        System.out.println(contacts);
        System.out.println(contacts.size());
        //без переопределений: сайз 2(остался)
        //переопр иквелс и хэшкод по id: сайз 1
    }
    static class Contact {
        int id;
        String name;
        String phone;
        public Contact(int id, String name, String phone) {
            this.id = id;
            this.name = name;
            this.phone = phone;
        }
        @Override
        public String toString() {
            return "Contact{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", phone='" + phone + '\'' +
                    '}';
        }


        @Override //переопределяем метод equals, для сравнения данных объектов (а не только сравнение ссылок)
        public boolean equals(Object o) {
            //1) проверка равенства ссылок
            if (this == o) return true;
            //2) проверка ненулл и совпадения класса проверяемого объекта
            if (o == null || getClass() != o.getClass()) return false;
            //3) проверка всех полей на равенство
            Contact contact = (Contact) o;
            return id == contact.id && Objects.equals(name, contact.name) && Objects.equals(phone, contact.phone);
        }

        @Override//переопределяем и назначаем хэшкод двум объектам с одинаковыми данными
        //чтобы объекты были равны и по хэш-коду
        public int hashCode() {
            return Objects.hash(id, name, phone);
        }
    }
}
