package com.gla.String.Level1;
import java.util.Scanner;
public class UppercaseConversion { public static String toUppercaseManual(String text) {
    String result = "";
    for (int i = 0; i < text.length(); i++) {
        char ch = text.charAt(i);
        if (ch >= 'a' && ch <= 'z') {
            ch = (char)(ch - 32); // Convert lowercase to uppercase
        }
        result += ch;
    }
    return result;
}

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input text
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();

        // Convert using manual method
        String manualUpper = toUppercaseManual(text);

        // Convert using built-in method
        String builtInUpper = text.toUpperCase();

        // Compare
        boolean isEqual = compareStrings(manualUpper, builtInUpper);

        // Display results
        System.out.println("\nManual Uppercase: " + manualUpper);
        System.out.println("Built-in Uppercase: " + builtInUpper);
        System.out.println("Are both uppercase strings equal? " + isEqual);

        scanner.close();
    }
}
