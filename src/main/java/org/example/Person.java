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

    void greeting(Person newMeet) {
        System.out.println("Ciao " + newMeet.name + ", piacere " + this.name + "!");
    }

    void addition(int a, int b) {
        System.out.println("Nome: " + this.name);
        System.out.println("Risultato: " + (a + b));
    }

    public String toString() {
        return this.name + "\n" + this.surname + "\n" + this.age + "\n" + this.favoriteColor;
    }
}