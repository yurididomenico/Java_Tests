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

        boolean condition = false;
        String x = condition ? "Ciao!" : "Buongiorno.";
        System.out.println(x);
    }
}











