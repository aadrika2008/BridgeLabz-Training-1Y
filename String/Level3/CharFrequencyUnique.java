package com.gla.String.Level3;
import java.util.Scanner;
public class CharFrequencyUnique {public static char[] uniqueCharacters(String text) {
    int length = text.length();
    char[] temp = new char[length];
    int count = 0;

    for (int i = 0; i < length; i++) {
        char current = text.charAt(i);
        boolean isUnique = true;
        for (int j = 0; j < i; j++) {
            if (text.charAt(j) == current) {
                isUnique = false;
                break;
            }
        }
        if (isUnique) {
            temp[count++] = current;
        }
    }

    char[] result = new char[count];
    for (int i = 0; i < count; i++) {
        result[i] = temp[i];
    }
    return result;
}

    // Frequency using unique characters
    public static String[][] frequencyUsingUnique(String text) {
        int[] freq = new int[256];
        int length = text.length();
        for (int i = 0; i < length; i++) {
            freq[text.charAt(i)]++;
        }

        char[] uniqueChars = uniqueCharacters(text);
        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = Character.toString(uniqueChars[i]);
            result[i][1] = Integer.toString(freq[uniqueChars[i]]);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] freqTable = frequencyUsingUnique(input);

        System.out.println("\nCharacter\tFrequency");
        System.out.println("--------------------------");
        for (int i = 0; i < freqTable.length; i++) {
            System.out.println(freqTable[i][0] + "\t\t" + freqTable[i][1]);
        }

        sc.close();
    }
}
