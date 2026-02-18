package com.gla.String.Level1;
import java.util.Scanner;
public class IllegalArgumentDemo {public static void generateException(String text) {
    // This will throw IllegalArgumentException because start > end
    System.out.println("Substring: " + text.substring(5, 2));
}

    // Method to handle IllegalArgumentException
    public static void handleException(String text) {
        try {
            // Attempt substring with start > end
            System.out.println("Substring: " + text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: Start index cannot be greater than end index!");
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = scanner.next();

        System.out.println("\n=== Generating IllegalArgumentException ===");

        // Call method that generates the exception (uncaught)
        try {
            generateException(text);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception occurred in generateException(): " + e);
        }

        System.out.println("\n=== Handling IllegalArgumentException ===");

        // Call method that handles the exception internally
        handleException(text);

        scanner.close();
    }
}
