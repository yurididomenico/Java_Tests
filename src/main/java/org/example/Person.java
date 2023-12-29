package org.example;

public class Person {
    String name;
    String surname;
    int age;
    String favoriteColor;

    Person(String name, String surname, int age, String favoriteColor) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.favoriteColor = favoriteColor;
    }

    void greeting() {
        System.out.println("Ciao sono " + this.name);
    }

    void addition(int a, int b) {
        System.out.println("Nome: " + this.name);
        System.out.println("Result: " + (a + b));
    }
}