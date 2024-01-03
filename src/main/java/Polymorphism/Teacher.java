package Polymorphism;

public class Teacher extends Person{
    Teacher(String name, String surname) {
        super(name, surname);
    }

    @Override
    public void greet() {
        System.out.println("Buongiorno ragazzi!");
    }
}
