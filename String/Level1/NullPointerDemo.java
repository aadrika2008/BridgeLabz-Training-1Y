package com.gla.String.Level1;
import java.util.Scanner;
public class NullPointerDemo {public static void generateException() {
    String text = null;

    // This will cause NullPointerException
    System.out.println("Length of the string: " + text.length());
}

    // Method to handle NullPointerException
    public static void handleException() {
        String text = null;

        try {
            // Trying to access a method on null string
            System.out.println("Length of the string: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: You cannot call a method on a null object!");
        }
    }

    public static void main(String[] args) {

        System.out.println("=== Demonstrating NullPointerException ===");

        // This will throw an unhandled exception
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Exception occurred in generateException(): " + e);
        }

        System.out.println("\n=== Handling NullPointerException ===");

        // This will handle the exception internally
        handleException();
    }
}
