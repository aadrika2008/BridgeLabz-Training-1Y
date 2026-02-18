package com.gla.String.Level3;
import java.util.Scanner;
public class PalindromeCheck {public static boolean isPalindromeIterative(String text) {
    int start = 0;
    int end = text.length() - 1;

    while (start < end) {
        if (text.charAt(start) != text.charAt(end)) return false;
        start++;
        end--;
    }
    return true;
}

    // Logic 2: Recursive check
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) return true;
        if (text.charAt(start) != text.charAt(end)) return false;
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Reverse using char array and compare
    public static boolean isPalindromeReverse(String text) {
        int length = text.length();
        char[] original = new char[length];
        char[] reversed = new char[length];

        for (int i = 0; i < length; i++) {
            original[i] = text.charAt(i);
            reversed[length - i - 1] = text.charAt(i);
        }

        for (int i = 0; i < length; i++) {
            if (original[i] != reversed[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String input = sc.nextLine();

        System.out.println("\nUsing Iterative Method: " + isPalindromeIterative(input));
        System.out.println("Using Recursive Method: " + isPalindromeRecursive(input, 0, input.length() - 1));
        System.out.println("Using Reverse Array Method: " + isPalindromeReverse(input));

        sc.close();
    }
}
