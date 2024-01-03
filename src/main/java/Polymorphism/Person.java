package Polymorphism;

public class Person {
    private String name;
    private String surname;

    Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    Person(Package_0.Person person) {
        this.copy(person);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void greet() {
        System.out.println("Ciao!");
    }

    public void copy(Package_0.Person person) {
        this.setName(person.getName());
        this.setSurname(person.getSurname());
    }
}

