package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main program develop branch\n");

        // ____________________ Declaration, Assignment, Initialization ____________________ //
//        int x; // Declaration
//        x = 10; // Assignment
//        System.out.println("x: " + x);
//        int y = 20; // Initialization
//        System.out.println("y: " + y + "\n");


        // ____________________ Types ____________________ //
//        boolean b = true; // Boolean | true : false | 1 bit
//        byte by = 127;  // Byte | -128 : 127 | 1 byte
//        short sh = 32767; // Short | -32768 : 32767 | 2 bytes
//        int i = 2147483647; // Int | -2147483648 : 2147483647 | 4 bytes
//        long l = 9223372036854775807L; // Long | -9223372036854775808 : 9223372036854775807 | 8 bytes
//        float f = 2.1234567F; // Float | 1 number with 6 - 7 decimal digits 5.123456f | 2 bytes
//        double d = 2.1234567890123456; // Double | 1 number with 15 decimal digits 5.123456789012345 | 2 bytes
//        char c = 'y'; // Char | Single character / letter / ASCII | 2 bytes
//        String s = "Ciao!"; // String | Sequence of characters | variable ( Reference )
//
//        System.out.println("boolean: " + b);
//        System.out.println("byte: " + by);
//        System.out.println("short: " + sh);
//        System.out.println("int: " + i);
//        System.out.println("long: " + l);
//        System.out.println("float: " + f);
//        System.out.println("double: " + d);
//        System.out.println("char: " + c);
//        System.out.println("String: " + s);


        // ____________________ Variable Nomenclature ____________________ //
        // personAge --- Lower Camel Case -> Variables
        // person_age --- Snake Case -> Variables
        // PERSON_AGE --- Constant Snake Case -> Constants


        // ____________________ Input ____________________ //
        // import java.util.Scanner; IMPORTANT: type this on top of the program, above of Main
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Nome: ");
//        String name = scanner.nextLine();
//        System.out.print("Cognome: ");
//        String surname = scanner.nextLine();
//        System.out.print("Anni: ");
//        int age = scanner.nextInt();
//        scanner.nextLine();
//        System.out.print("Città: ");
//        String city = scanner.nextLine();
//
//        System.out.println("Ciao " + name + " " + surname + "!");
//        System.out.println("Hai " + age + " anni e la tua città è " + city + "! 😍");


        // ____________________ Arithmetic Operations ____________________ //
//        int x = 10;
//        x++; // Shorthand of -> x = x + 1;
//        x--; // Shorthand of -> x = x - 1;

//        x += 5; // Shorthand of -> x = x + 5;
//        x -= 5; // Shorthand of -> x = x - 5;
//        x *= 5; // Shorthand of -> x = x * 5;
//        x /= 5; // Shorthand of -> x = x / 5;
//        x %= 5; // Shorthand of -> x = x % 5;

//        int y = 2;
//        int z = x + y;
//        int z = x - y;
//        int z = x * y;
//        int z = x / y;
//        int z = x % y;

//        System.out.println(x);


        // ____________________ Math ____________________ //
        // abs, min, max, pow, sqrt, PI
//        System.out.println(Math.abs(-55)); // Find absolute number: -2 => 2 | 2 => 2
//        System.out.println(Math.min(1, 5)); // Find minimum value
//        System.out.println(Math.max(1, 5)); // Find maximum value
//        System.out.println(Math.pow(2, 3)); // Find the power of number Math.pow(number of power, number);
//        System.out.println(Math.sqrt(16)); // Find square root Math.sqrt(number);
//        System.out.println(Math.PI); // Find PI 3.14 ...


        // ____________________ Comparison Operators ____________________ //
        /*
        * >
        * >=
        * <
        * <=
        * ==
        * !=
        */
//        boolean result = 3 > 10;
//        boolean result = 3 >= 10;
//        boolean result = 3 < 10;
//        boolean result = 3 <= 10;
//        boolean result = 3 == 10;
//        boolean result = 3 != 10;
//        System.out.println(result);


        // ____________________ Logical Operators ____________________ //
        /*
        * AND - &&
        * OR - ||
        * NOT - !
        */

//        boolean result = 3 < 10 && 3 < 20;
//        boolean result = 3 < 10 || 3 < 20;
//        boolean result = !(3 < 10);
//        boolean result = ((3 < 10 && 3 % 2 == 0) || (6 < 10 && 6 % 2 == 0)) && 10 < 100;

//        System.out.println(result);


        // ____________________ If ____________________ //
        /*
        * If
        * else
        * else if
        * ternary operator
        */

//        boolean isOnline = true;
//        boolean isOnline = false;
//        if (isOnline) {
//            System.out.println("🟩");
//        } else {
//            System.out.println("🟥");
//        }

//        int number = 6;
//        if (number < 10) {
//            System.out.print("È minore di 10 e ");
//            if (number % 2 == 0) {
//                System.out.println("pari");
//            } else {
//                System.out.println("dispari");
//            }
//        } else {
//            System.out.println("È maggiore o uguale a 10");
//        }

//        boolean condition = false;
//        String x = condition ? "Ciao!" : "Buongiorno.";
//        System.out.println(x);


        // ____________________ Switch ____________________ //
//        String nome = "Marco";
//        String nome = "Yuri";

//        switch (nome) {
//            case "Luca":
//                System.out.println("Ciao " + nome + "!");
//                break;
//            case "Marco":
//                System.out.println("Ciao " + nome + "!");
//                break;
//            case "Antonio":
//                System.out.println("Ciao " + nome + "!");
//                break;
//            case "Edoardo":
//                System.out.println("Ciao " + nome + "!");
//                break;
//            default:
//                System.out.println("Ciao chiunque tu sia!");
//        }


        // ____________________ Loops ____________________ //
        /*
        * while
        * do while
        * for
        * break
        * continue
        */

//        int i = 0;
//        while (i < 0) {
//            System.out.println("while " + i);
//            i++;
//        }
//
//        do {
//            System.out.println("dowhile " + i);
//            i++;
//        } while (i < 0);

//        for (int i = 0; i < 5; i++) {
//            System.out.print(i + " ");
//        }

//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print(j + "\t");
//            }
//            System.out.println("");
//        }

//        int[] numbers = {20, 22, 21, 19, 23};
//        for (int number : numbers) {
//            System.out.println(number);
//        }

//        for (int i = 0; i < 5; i++) {
//            if (i == 4) {
//                break;
//            }
//            System.out.println(i);
//        }

//        for (int i = 0; i < 10; i++) {
//            if (i == 4) {
//                continue;
//            }
//            System.out.println(i);
//        }


        // ____________________ Array ____________________ //
//        int[] numbers = {10, 20, 30, 40};
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }
//        for (int number : numbers) {
//            System.out.println(number);
//        }


        // ____________________ Array 2D ____________________ //
//        String[][] classes = {
//                {"Yuri", "Ludovica"},
//                {"Marco", "Mattia", "Edoardo"},
//                {"Keeevin", "Federico"},
//                {"Alex", "Mattia"}
//        };

        // For
//        for (int sClass = 0; sClass < classes.length; sClass++) {
//            for (int student = 0; student < classes[sClass].length; student++) {
//                System.out.print(classes[sClass][student] + " ");
//            }
//            System.out.println();
//        }

        //Foreach
//        for (String[] sClass : classes) {
//            for (String student : sClass) {
//                System.out.print(student + " ");
//            }
//            System.out.println();
//        }


        // ____________________ String Methods ____________________ //
        /*
        * equals, equalsIgnoreCase, length, charAt
        * indexOf, isEmpty, toUpperCase, toLowerCase
        * trim, replace
        */

//        String name = "Yuri";
//        String nameNotTrimed = " Yuri ";

//        boolean result = name.equals("Yuri");
//        boolean result = name.equalsIgnoreCase("YuRi");
//        int result = name.length();
//        char result = name.charAt(0);
//        int result = name.indexOf('Y');
//        boolean result = name.isEmpty();
//        String result = name.toUpperCase();
//        String result = name.toLowerCase();
//        String result = nameNotTrimed.trim();
//        String result = name.replace('u', 'o');

//        System.out.println(result);


        // ____________________ Wrapper Classes ____________________ //
//        System.out.println("Wrapper Classes");
//
//        Boolean vero = true;
//        Character carattere = 'a';
//        Integer numero = 4;
//        Double decimale = 5.23;
//        String stringa = "una stringa";
//
//        boolean a = true;
//        char b = 'a';
//        int c = 5;
//        double d = 5.23;
//
//        if (vero == a) {
//            System.out.println("Ciao");
//        }


        // ____________________ Array List & 2D ____________________ //
//        ArrayList<String> people = new ArrayList<String>();

        // Add elements
//        people.add("Yuri");
//        people.add("Ludovica");

//        System.out.println(people.get(0));
//        System.out.println(people.get(1));

        // For
//        for (int i = 0; i < people.size(); i++) {
//            System.out.println(people.get(i));
//        }

        // Foreach
//        for (String person : people) {
//            System.out.println(person);
//        }

        // Update elements
//        people.set(0, "Lorenzo");
//        people.set(1, "Anna");

        // Remove one element
//        people.remove(1);

        // Clear the Array List
//        people.clear();
//
//        for (String person : people) {
//            System.out.println(person);
//        }

//        ArrayList<ArrayList<String>> classes = new ArrayList();
//
//        ArrayList<String> classroom_1 = new ArrayList<String>();
//        classroom_1.add("Yuri");
//        classroom_1.add("Ludovica");
//
//        ArrayList<String> classroom_2 = new ArrayList<String>();
//        classroom_2.add("Lorenzo");
//        classroom_2.add("Anna");
//
//        classes.add(classroom_1);
//        classes.add(classroom_2);
//
//        for (ArrayList classroom : classes) {
//            for (Object student : classroom) {
//                System.out.print(student + " ");
//            }
//            System.out.println();
//        }
        // ____________________ Methods ____________________ //
//        addition(2, 3);
//        int total = 0;
//        total += addition(2, 5);
//        total += addition(2, 5);
//        total += addition(2, 5);
//        total += addition(2, 5);
//
//        System.out.println("Result: " + total);


        // ____________________ Overloaded Methods ____________________ //
//        int int_2 = addition(2, 3);
//        int int_3 = addition(2, 3, 4);
//        double float_2 = addition(2.1, 3.1);
//
//        System.out.println(int_2);
//        System.out.println(int_3);
//        System.out.println(float_2);
//


        // ____________________ OOP Intro ____________________ //
//        Person person1 = new Person();
//        Person person2 = new Person();

//        System.out.println(person1.name);
//        System.out.println(person1.surname);
//        System.out.println(person1.age);
//        System.out.println(person1.favoriteColor);
//        person1.greeting();
//        person1.walking();

//        System.out.println(person2.name);
//        System.out.println(person2.surname);
//        System.out.println(person2.age);
//        System.out.println(person2.favoriteColor);
//        person2.greeting();
//        person2.walking();


        // ____________________ OOP: Constructor's Classes ____________________ //
//        Person person1 = new Person("Yuri", "Di Domenico", 30, "green");
//        Person person2 = new Person("Ludovica","Taccini", 24, "blue");
//        Person person3 = new Person("Lorenzo","Mannocchi", 24, "black");
//        Person person4 = new Person("Anna","Nommericordo", 29, "orange");
//
//        System.out.println(person1.name);
//        System.out.println(person2.name);
//        System.out.println(person3.name);
//        System.out.println(person4.name);
//
//        person1.greeting();


        // ____________________ Scope of Variables  ____________________ //
//        Person person1 = new Person("Yuri", "Di Domenico", 30, "green");
//
//        person1.addition(2, 3);


        // ____________________ Overloaded Contructor  ____________________ //
//        Pizza pizza1 = new Pizza("00 flour","tomato","mozzarella");
//        Pizza pizza2 = new Pizza("00 flour","tomato");
//        Pizza pizza3 = new Pizza("0 flour");
//        Pizza pizza4 = new Pizza("wholwheat flour","tomato","parmigiano","french fries");


        // ____________________ toString method  ____________________ //
//        Person persona = new Person("Rick", "Devis", 28, "blue");
//
//        System.out.println(persona);


        // ____________________ Array of Objects  ____________________ //
//        Person person_1 = new Person("Gino", "Ricci", 43, "blue");
//        Person person_2 = new Person("Giorgio", "Rovati", 52, "pink");
//        Person person_3 = new Person("Giovanni", "Relli", 49, "red");
//
//        Person[] people = {person_1, person_2, person_3};

//        for (int i = 0; i < people.length; i++) {
//            System.out.println(people[i] + "\n");
//        }

//        for (Object person : people) {
//            System.out.println(person + "\n");
//        }


        // ____________________ Passing Objects as method Parameters  ____________________ //
//        Person person_1 = new Person("Yuri","Di Domenico", 30,"green");
//        Person person_2 = new Person("Ludovica","Taccini",24, "blue");
//
//        person_1.greeting(person_2);
//        person_2.greeting(person_1);


        // ____________________ final & static keywords  ____________________ //
        // Editable
//        int x = 1;
//        x = 2;
//        System.out.println(x);

        // Not Editable
//        final int x = 1;
//        x = 2;
//        System.out.println(x);

        Person person_1 = new Person("Aldo","Frizzi", 10, "orange");

        Person.numberPeople();
    }








    static int addition(int a, int b) {
        return a + b;
    }

    static int addition(int a, int b, int c) {
        return a + b + c;
    }

    static double addition(double a, double b) {
        return a + b;
    }
}











