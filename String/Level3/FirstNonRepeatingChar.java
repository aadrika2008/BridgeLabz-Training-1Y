package com.gla.String.Level3;
import java.util.Scanner;
public class FirstNonRepeatingChar {public static char findFirstNonRepeating(String text) {

    int[] freq = new int[256]; // ASCII characters

    int length = 0;

    // Step 1: Find length using charAt() logic
    try {
        while (true) {
            text.charAt(length);
            length++;
        }
    } catch (StringIndexOutOfBoundsException e) {
    }

    // Step 2: Count frequency of each character
    for (int i = 0; i < length; i++) {
        char ch = text.charAt(i);
        freq[ch]++;  // ASCII value as index
    }

    // Step 3: Find first non-repeating character
    for (int i = 0; i < length; i++) {
        char ch = text.charAt(i);
        if (freq[ch] == 1) {
            return ch;
        }
    }

    // If all characters repeat
    return '\0';
}

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char result = findFirstNonRepeating(input);

        if (result != '\0') {
            System.out.println("\nFirst Non-Repeating Character: " + result);
        } else {
            System.out.println("\nNo non-repeating character found.");
        }

        sc.close();
    }
}
