package Polymorphism;

public class Main {
    public static void main (String[] args) {
        // ____________________ Polymorphism ____________________ //
        Student student_1 = new Student("y","d");
        Student student_2 = new Student("l","t");
        Teacher teacher_1 = new Teacher("al", "lo");
        Person person_1 = new Person("x","xx");

        Person[] classroom = {student_1, student_2, teacher_1, person_1};

        for (Person person : classroom) {
            person.greet();
        }
    }
}
