package com.gla.String.Level2;
import java.util.Scanner;
public class ShortestLongestFinder {public static int findLength(String str) {
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

    // Method to split text without using split()
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
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                words[index++] = text.substring(start, i);
                start = i + 1;
            }
        }

        // Last word
        words[index] = text.substring(start, length);

        return words;
    }

    // Method to create 2D array of word and its length
    public static String[][] createWordLengthTable(String[] words) {

        String[][] table = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            int len = findLength(words[i]);
            table[i][1] = String.valueOf(len);
        }

        return table;
    }

    // Method to find shortest and longest word
    // Returns their indexes in 1D int array
    public static int[] findShortestLongest(String[][] table) {

        int minIndex = 0;
        int maxIndex = 0;

        int minLength = Integer.parseInt(table[0][1]);
        int maxLength = Integer.parseInt(table[0][1]);

        for (int i = 1; i < table.length; i++) {

            int currentLength = Integer.parseInt(table[i][1]);

            if (currentLength < minLength) {
                minLength = currentLength;
                minIndex = i;
            }

            if (currentLength > maxLength) {
                maxLength = currentLength;
                maxIndex = i;
            }
        }

        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        // Step 1: Split words
        String[] words = customSplit(input);

        // Step 2: Create 2D array (word + length)
        String[][] table = createWordLengthTable(words);

        // Step 3: Find shortest and longest
        int[] result = findShortestLongest(table);

        int shortestIndex = result[0];
        int longestIndex = result[1];

        // Display results
        System.out.println("\nShortest Word: " + table[shortestIndex][0] +
                " (Length: " + table[shortestIndex][1] + ")");

        System.out.println("Longest Word: " + table[longestIndex][0] +
                " (Length: " + table[longestIndex][1] + ")");

        sc.close();
    }
}
