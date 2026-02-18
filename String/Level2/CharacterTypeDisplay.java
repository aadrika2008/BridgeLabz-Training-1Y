package com.gla.String.Level2;
import java.util.Scanner;
public class CharacterTypeDisplay {public static String checkCharacter(char ch) {

    // Convert uppercase to lowercase using ASCII
    if (ch >= 'A' && ch <= 'Z') {
        ch = (char)(ch + 32);
    }

    // Check if alphabet
    if (ch >= 'a' && ch <= 'z') {

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        } else {
            return "Consonant";
        }
    }

    return "Not a Letter";
}

    // Method to create 2D array of character and its type
    public static String[][] analyzeCharacters(String text) {

        int length = text.length();
        String[][] result = new String[length][2];

        for (int i = 0; i < length; i++) {

            char ch = text.charAt(i);

            result[i][0] = String.valueOf(ch);      // Store character
            result[i][1] = checkCharacter(ch);     // Store type
        }

        return result;
    }

    // Method to display 2D array in tabular format
    public static void displayTable(String[][] table) {

        System.out.println("\nCharacter\tType");
        System.out.println("-------------------------");

        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t\t" + table[i][1]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Analyze characters
        String[][] result = analyzeCharacters(input);

        // Display result
        displayTable(result);

        sc.close();
    }
}
