package com.gla.String.Level2;
import java.util.Scanner;
public class CustomTrim {
    public static int[] findTrimIndexes(String str) {

        int start = 0;
        int end = str.length() - 1;

        // Trim leading spaces
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Custom substring using charAt()
    public static String customSubstring(String str, int start, int end) {

        String result = "";

        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }

        return result;
    }

    // Compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {

        if (s1.length() != s2.length())
            return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text with spaces: ");
        String input = sc.nextLine();

        int[] indexes = findTrimIndexes(input);

        String customTrim = customSubstring(input, indexes[0], indexes[1]);

        String builtInTrim = input.trim();

        boolean result = compareStrings(customTrim, builtInTrim);

        System.out.println("Custom Trim Result: '" + customTrim + "'");
        System.out.println("Built-in Trim Result: '" + builtInTrim + "'");
        System.out.println("Are both equal? " + result);

        sc.close();
    }
}