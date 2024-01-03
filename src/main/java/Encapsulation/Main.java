package Encapsulation;

public class Main {
    public static void main (String[] args) {
        // ____________________ Encapsulation ____________________ //
        Person person_1 = new Person("Yuri", "Di Domenico");
        System.out.println(person_1.getName());
        System.out.println(person_1.getSurname());

        person_1.setName("Giorgio");
        person_1.setSurname("Rovati");

        System.out.println(person_1.getName());
        System.out.println(person_1.getSurname());
    }
}
