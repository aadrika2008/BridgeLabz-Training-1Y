package com.gla.String.Level1;
import java.util.Scanner;
public class StringIndexOutOfBoundsDemo {    public static void generateException(String text) {
    // Accessing index beyond string length will cause exception
    System.out.println("Character at invalid index: " + text.charAt(text.length()));
}

    // Method to handle StringIndexOutOfBoundsException
    public static void handleException(String text) {
        try {
            // Attempt to access an invalid index
            System.out.println("Character at invalid index: " + text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: Cannot access index beyond string length!");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = scanner.next();

        System.out.println("\n=== Generating StringIndexOutOfBoundsException ===");

        // Call method that generates exception (uncaught)
        try {
            generateException(text);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception occurred in generateException(): " + e);
        }

        System.out.println("\n=== Handling StringIndexOutOfBoundsException ===");

        // Call method that handles exception internally
        handleException(text);

        scanner.close();
    }

}
