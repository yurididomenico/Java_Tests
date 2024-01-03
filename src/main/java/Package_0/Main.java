package Package_0;

public class Main {
    public static void main (String[] args) {
        // ____________________ Encapsulation ____________________ //
//        Person person_1 = new Person("Yuri", "Di Domenico");
//        System.out.println(person_1.getName());
//        System.out.println(person_1.getSurname());
//
//        person_1.setName("Giorgio");
//        person_1.setSurname("Rovati");
//
//        System.out.println(person_1.getName());
//        System.out.println(person_1.getSurname());


        // ____________________ Copy the Objects ____________________ //
        Person person_1 = new Person("Yuri","Di Domenico");
//        Person person_2 = new Person("Ludovica","Taccini");
        Person person_2 = new Person(person_1);

//        person_2.copy(person_1);

//        person_1.setName("Toto");

        System.out.println(person_1);
        System.out.println(person_2);
        System.out.println();

        System.out.println(person_1.getName());
        System.out.println(person_1.getSurname());
        System.out.println();

        System.out.println(person_2.getName());
        System.out.println(person_2.getSurname());
        System.out.println();
    }
}
