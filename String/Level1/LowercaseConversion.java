package com.gla.String.Level1;
import java.util.Scanner;
public class LowercaseConversion {public static String toLowercaseManual(String text) {
    String result = "";
    for (int i = 0; i < text.length(); i++) {
        char ch = text.charAt(i);
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32); // Convert uppercase to lowercase
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
        String manualLower = toLowercaseManual(text);

        // Convert using built-in method
        String builtInLower = text.toLowerCase();

        // Compare
        boolean isEqual = compareStrings(manualLower, builtInLower);

        // Display results
        System.out.println("\nManual Lowercase: " + manualLower);
        System.out.println("Built-in Lowercase: " + builtInLower);
        System.out.println("Are both lowercase strings equal? " + isEqual);

        scanner.close();
    }
}
