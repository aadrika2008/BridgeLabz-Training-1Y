package com.gla.String.Level1;
import java.util.Scanner;
public class CharArrayComparison {    public static char[] getCharsManually(String text) {
    char[] result = new char[text.length()];
    for (int i = 0; i < text.length(); i++) {
        result[i] = text.charAt(i);
    }
    return result;
}

    // Method to compare two char arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = scanner.next();

        // Get characters using user-defined method
        char[] manualChars = getCharsManually(text);

        // Get characters using built-in toCharArray() method
        char[] builtInChars = text.toCharArray();

        // Compare both arrays
        boolean areEqual = compareCharArrays(manualChars, builtInChars);

        // Display results
        System.out.print("\nCharacters using user-defined method: ");
        for (char c : manualChars) {
            System.out.print(c + " ");
        }

        System.out.print("\nCharacters using toCharArray(): ");
        for (char c : builtInChars) {
            System.out.print(c + " ");
        }

        System.out.println("\n\nAre both arrays equal? " + areEqual);

        scanner.close();
    }
}
