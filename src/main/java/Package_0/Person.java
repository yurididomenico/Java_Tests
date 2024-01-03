package Package_0;

public class Person {
    private String name;
    private String surname;

    Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    Person(Person person) {
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

    public void copy(Person person) {
        this.setName(person.getName());
        this.setSurname(person.getSurname());
    }
}
