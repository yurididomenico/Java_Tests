package Polymorphism;

public class Student extends Person{

    Student(String name, String surname) {
        super(name, surname);
    }

    @Override
    public void greet() {
        System.out.println("Buongiorno prof!");
    }
}
