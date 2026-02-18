package com.gla.String.Level2;
import java.util.Scanner;
public class WordLengthTable {    public static int findLength(String str) {
    int count = 0;
    try {
        while (true) {
            str.charAt(count);
            count++;
        }
    } catch (StringIndexOutOfBoundsException e) {
    }
    return count;
}

    // Method to split text into words without using split()
    public static String[] customSplit(String text) {

        int length = findLength(text);

        // Count words
        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];

        int start = 0;
        int wordIndex = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                words[wordIndex++] = text.substring(start, i);
                start = i + 1;
            }
        }

        // Last word
        words[wordIndex] = text.substring(start, length);

        return words;
    }

    // Method to create 2D array of word and its length
    public static String[][] createWordLengthTable(String[] words) {

        String[][] table = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            int len = findLength(words[i]);
            table[i][1] = String.valueOf(len);  // Convert int to String
        }

        return table;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        // Split words
        String[] words = customSplit(input);

        // Create 2D array
        String[][] result = createWordLengthTable(words);

        // Display in tabular format
        System.out.println("\nWord\t\tLength");
        System.out.println("-------------------------");

        for (int i = 0; i < result.length; i++) {

            String word = result[i][0];

            // Convert length from String to Integer
            int length = Integer.parseInt(result[i][1]);

            System.out.println(word + "\t\t" + length);
        }

        sc.close();
    }
}
