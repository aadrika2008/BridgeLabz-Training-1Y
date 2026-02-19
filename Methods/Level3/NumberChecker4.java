package com.gla.Methods.Level3;
import java.util.Arrays;
public class NumberChecker4 {public static void main(String[] args) {

    int number = 10201;

    System.out.println("Number: " + number);

    int[] digits = getDigits(number);
    System.out.println("Digits: " + Arrays.toString(digits));

    int[] reversed = reverseArray(digits);
    System.out.println("Reversed: " + Arrays.toString(reversed));

    System.out.println("Is Palindrome: " + isPalindrome(digits));
    System.out.println("Is Duck Number: " + isDuck(digits));

    // Example: compare original and reversed array
    System.out.println("Original equals Reversed: " + compareArrays(digits, reversed));
}

    // a. Store digits
    public static int[] getDigits(int n) {
        String s = String.valueOf(n);
        int[] d = new int[s.length()];
        for (int i = 0; i < s.length(); i++)
            d[i] = s.charAt(i) - '0';
        return d;
    }

    // b. Reverse array
    public static int[] reverseArray(int[] arr) {
        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
            rev[i] = arr[arr.length - 1 - i];
        return rev;
    }

    // c. Compare two arrays
    public static boolean compareArrays(int[] a1, int[] a2) {
        if (a1.length != a2.length) return false;
        for (int i = 0; i < a1.length; i++)
            if (a1[i] != a2[i]) return false;
        return true;
    }

    // d. Check palindrome
    public static boolean isPalindrome(int[] digits) {
        return compareArrays(digits, reverseArray(digits));
    }

    // e. Duck number check
    public static boolean isDuck(int[] digits) {
        for (int x : digits) {
            if (x == 0) return true;
        }
        return false;
    }
}
