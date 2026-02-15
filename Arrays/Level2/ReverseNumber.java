package com.gla.Arrays.Level2;
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive number: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Invalid input. Please enter a positive number.");
            return;
        }

        // Count digits
        int tempNumber = number;
        int count = 0;
        if (tempNumber == 0) {
            count = 1; // special case for 0
        } else {
            while (tempNumber != 0) {
                tempNumber /= 10;
                count++;
            }
        }

        // Store digits in an array
        int[] digits = new int[count];
        tempNumber = number;
        for (int i = 0; i < count; i++) {
            digits[i] = tempNumber % 10;
            tempNumber /= 10;
        }

        // Display digits in reverse order (simply the array elements)
        System.out.println("\nDigits of the number in reverse order:");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }
    }
}
