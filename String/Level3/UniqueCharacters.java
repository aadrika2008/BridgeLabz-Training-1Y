package com.gla.String.Level3;
import java.util.Scanner;
public class UniqueCharacters {public static int findLength(String text) {

    int count = 0;

    try {
        while (true) {
            text.charAt(count);
            count++;
        }
    } catch (StringIndexOutOfBoundsException e) {
    }

    return count;
}

    // Method to find unique characters
    public static char[] findUniqueChars(String text) {

        int length = findLength(text);

        // Step 1: Create array of max possible size
        char[] temp = new char[length];

        int uniqueCount = 0;

        // Step 2: Outer loop
        for (int i = 0; i < length; i++) {

            char current = text.charAt(i);

            boolean isUnique = true;

            // Step 3: Inner loop (compare with previous characters)
            for (int j = 0; j < i; j++) {
                if (current == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[uniqueCount] = current;
                uniqueCount++;
            }
        }

        // Step 4: Create final array of exact size
        char[] result = new char[uniqueCount];

        for (int i = 0; i < uniqueCount; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char[] uniqueChars = findUniqueChars(input);

        System.out.println("\nUnique Characters:");

        for (int i = 0; i < uniqueChars.length; i++) {
            System.out.print(uniqueChars[i] + " ");
        }

        sc.close();
    }
}
