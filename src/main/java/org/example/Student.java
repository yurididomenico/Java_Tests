package org.example;

public class Student extends Person {
    String favoriteSubject;

    Student(String name, String surname, int age, String favoriteColor, String favoriteSubject) {
        super(name, surname, age, favoriteColor);
        this.favoriteSubject = favoriteSubject;
    }

    @Override
    void greeting() {
        System.out.println("Buongiorno prof!");
    }

    void studying() {
        System.out.println("sto studiando... 😔");
    }
}
