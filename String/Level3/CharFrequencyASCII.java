package com.gla.String.Level3;
import java.util.Scanner;
public class CharFrequencyASCII {public static String[][] findFrequency(String text) {

    int[] freq = new int[256];

    // Count frequency
    int length = text.length();
    for (int i = 0; i < length; i++) {
        char ch = text.charAt(i);
        freq[ch]++;
    }

    // Count unique characters
    int count = 0;
    for (int i = 0; i < 256; i++) {
        if (freq[i] > 0) count++;
    }

    // Create 2D array
    String[][] result = new String[count][2];
    int index = 0;
    for (int i = 0; i < 256; i++) {
        if (freq[i] > 0) {
            result[index][0] = Character.toString((char)i);
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

        String[][] freqTable = findFrequency(input);

        System.out.println("\nCharacter\tFrequency");
        System.out.println("--------------------------");
        for (int i = 0; i < freqTable.length; i++) {
            System.out.println(freqTable[i][0] + "\t\t" + freqTable[i][1]);
        }

        sc.close();
    }
}
