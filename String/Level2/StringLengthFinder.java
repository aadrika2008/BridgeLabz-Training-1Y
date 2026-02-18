package com.gla.String.Level2;
import java.util.Scanner;
public class StringLengthFinder {public static int findLength(String str) {
    int count = 0;
    try {
        while (true) {
            str.charAt(count);  // Access character at index
            count++;            // Increment counter
        }
    } catch (StringIndexOutOfBoundsException e) {
        // Exception occurs when index exceeds string length
    }
    return count;
}

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = sc.next();

        // Call user-defined method
        int customLength = findLength(input);

        // Call built-in length() method
        int actualLength = input.length();

        // Display results
        System.out.println("Length using user-defined method: " + customLength);
        System.out.println("Length using built-in length() method: " + actualLength);

        sc.close();
    }
}
