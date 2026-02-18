package com.gla.String.Level1;
import java. util.Scanner;
public class StringComparison {public static boolean compareUsingCharAt(String str1, String str2) {

    // If lengths are different, strings are not equal
    if (str1.length() != str2.length()) {
        return false;
    }

    // Compare character by character
    for (int i = 0; i < str1.length(); i++) {
        if (str1.charAt(i) != str2.charAt(i)) {
            return false;
        }
    }

    return true; // All characters matched
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter first string: ");
        String str1 = scanner.next();

        System.out.print("Enter second string: ");
        String str2 = scanner.next();

        // Compare using charAt() method
        boolean charAtResult = compareUsingCharAt(str1, str2);

        // Compare using built-in equals() method
        boolean equalsResult = str1.equals(str2);

        // Display results
        System.out.println("\nResult using charAt(): " + charAtResult);
        System.out.println("Result using equals(): " + equalsResult);

        // Check if both results are same
        if (charAtResult == equalsResult) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("The methods give different results.");
        }

        scanner.close();
    }

}
