package com.gla.String.Level1;
import java.util.Scanner;
public class NumberFormatDemo {public static void generateException(String text) {
    // This will throw NumberFormatException if the text is not a valid number
    int number = Integer.parseInt(text);
    System.out.println("Parsed number: " + number);
}

    // Method to handle NumberFormatException
    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: Input is not a valid integer!");
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string to convert to integer: ");
        String text = scanner.next();

        System.out.println("\n=== Generating NumberFormatException ===");

        // Call method that generates exception (uncaught)
        try {
            generateException(text);
        } catch (NumberFormatException e) {
            System.out.println("Exception occurred in generateException(): " + e);
        }

        System.out.println("\n=== Handling NumberFormatException ===");

        // Call method that handles exception internally
        handleException(text);

        scanner.close();
    }
}
