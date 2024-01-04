package Exception_TryCatch;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ____________________ Exception Handling ____________________ //
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Numero 1: ");
            int n1 = scanner.nextInt();
            System.out.print("Numero 2: ");
            int n2 = scanner.nextInt();

            int result = n1 / n2;
            System.out.println("Risultato: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ATTENZIONE! ⚠\nNon puoi dividere un numero per 0");
        } catch (InputMismatchException e) {
            System.out.println("ATTENZIONE! ⚠\nNon puoi dividere un numero per una stringa!");
        } catch (Exception e) {
            System.out.println("ATTENZIONE! ⚠\nC'è un problema sconosciuto!");
        } finally {
            scanner.close();
        }



    }
}
