package com.gla.String.Level2;
import java.util.Scanner;
public class VowelConsonantCounter {public static String checkCharacter(char ch) {

    // Convert uppercase to lowercase using ASCII
    if (ch >= 'A' && ch <= 'Z') {
        ch = (char)(ch + 32);
    }

    // Check if alphabet
    if (ch >= 'a' && ch <= 'z') {

        // Check vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        } else {
            return "Consonant";
        }
    }

    return "Not a Letter";
}

    // Method to count vowels and consonants
    public static int[] countVowelsConsonants(String text) {

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);
            String result = checkCharacter(ch);

            if (result.equals("Vowel")) {
                vowels++;
            }
            else if (result.equals("Consonant")) {
                consonants++;
            }
        }

        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int[] counts = countVowelsConsonants(input);

        System.out.println("\nNumber of Vowels: " + counts[0]);
        System.out.println("Number of Consonants: " + counts[1]);

        sc.close();
    }
}
