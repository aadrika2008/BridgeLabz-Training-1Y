package com.gla.String.Level3;
import java.util.Scanner;
public class CharFrequencyNested {public static String[][] frequencyNested(String text) {

    int length = text.length();
    char[] chars = text.toCharArray();
    int[] freq = new int[length];

    // Initialize frequency array
    for (int i = 0; i < length; i++) freq[i] = 1;

    // Count frequency using nested loops
    for (int i = 0; i < length; i++) {
        if (chars[i] == '0') continue; // Skip already counted duplicates
        for (int j = i + 1; j < length; j++) {
            if (chars[i] == chars[j]) {
                freq[i]++;
                chars[j] = '0'; // Mark duplicate
            }
        }
    }

    // Count unique characters
    int count = 0;
    for (int i = 0; i < length; i++) {
        if (chars[i] != '0') count++;
    }

    // Create 2D array
    String[][] result = new String[count][2];
    int index = 0;
    for (int i = 0; i < length; i++) {
        if (chars[i] != '0') {
            result[index][0] = Character.toString(chars[i]);
            result[index][1] = Integer.toString(freq[i]);
            index++;
        }
    }

    return result;
}

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] freqTable = frequencyNested(input);

        System.out.println("\nCharacter\tFrequency");
        System.out.println("--------------------------");
        for (int i = 0; i < freqTable.length; i++) {
            System.out.println(freqTable[i][0] + "\t\t" + freqTable[i][1]);
        }

        sc.close();
    }
}
