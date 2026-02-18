package com.gla.String.Level1;
import java.util.Scanner;
public class SubstringComparison {public static String createSubstringUsingCharAt(String text, int start, int end) {
    String result = "";

    for (int i = start; i < end; i++) {
        result = result + text.charAt(i);
    }

    return result;
}

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Taking string input
        System.out.print("Enter a string: ");
        String text = scanner.next();

        // Taking start and end index
        System.out.print("Enter start index: ");
        int start = scanner.nextInt();

        System.out.print("Enter end index: ");
        int end = scanner.nextInt();

        // Validate indices
        if (start < 0 || end > text.length() || start > end) {
            System.out.println("Invalid indices!");
        } else {

            // Substring using charAt()
            String sub1 = createSubstringUsingCharAt(text, start, end);

            // Substring using built-in method
            String sub2 = text.substring(start, end);

            // Compare both substrings
            boolean comparisonResult = compareStrings(sub1, sub2);

            // Display results
            System.out.println("\nSubstring using charAt(): " + sub1);
            System.out.println("Substring using substring(): " + sub2);
            System.out.println("Are both substrings equal? " + comparisonResult);
        }

        scanner.close();
    }
}
