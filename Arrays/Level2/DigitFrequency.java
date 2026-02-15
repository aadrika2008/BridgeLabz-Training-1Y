package com.gla.Arrays.Level2;
import java.util.Scanner;
public class DigitFrequency {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Take input for the number
        System.out.print("Enter a positive number: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Invalid input. Please enter a positive number.");
            return;
        }

        // Special case for 0
        if (number == 0) {
            System.out.println("Digit 0 occurs 1 time.");
            return;
        }

        // Count digits
        int tempNumber = number;
        int count = 0;
        while (tempNumber != 0) {
            tempNumber /= 10;
            count++;
        }

        // Store digits in an array
        int[] digits = new int[count];
        tempNumber = number;
        for (int i = 0; i < count; i++) {
            digits[i] = tempNumber % 10;
            tempNumber /= 10;
        }

        // Frequency array for digits 0-9
        int[] frequency = new int[10];
        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }

        // Display frequency of each digit
        System.out.println("\nFrequency of digits in the number:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " time(s).");
            }
        }
    }
}
