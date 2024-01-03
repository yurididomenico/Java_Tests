package org.example;

public class Teacher extends Person {
    String subject;

    Teacher(String name, String surname, int age, String favoriteColor, String subject) {
        super(name, surname, age, favoriteColor);
        this.subject = subject;
    }

    @Override
    void greeting() {
        System.out.println("Buongiorno ragazzi!");
    }

    void teaching() {
        System.out.println("sto insegnando... 😊");
    }
}
