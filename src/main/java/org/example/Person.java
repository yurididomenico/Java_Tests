package org.example;

public class Person {
    String name;
    String surname;
    int age;
    String favoriteColor;
    static int numberPeople;

    Person(String name, String surname, int age, String favoriteColor) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.favoriteColor = favoriteColor;
        numberPeople++;
    }

    void greeting() {
        System.out.println("Ciao!");
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

    static void numberPeople () {
        System.out.println("Numero persone generate: " + numberPeople);
    }
}