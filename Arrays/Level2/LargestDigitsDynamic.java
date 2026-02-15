package com.gla.Arrays.Level2;
import java.util.Scanner;
public class LargestDigitsDynamic {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive number: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Invalid input. Please enter a positive number.");
            return;
        }

        int maxDigit = 10; // initial size of the array
        int[] digits = new int[maxDigit];
        int index = 0;

        int tempNumber = number;

        // Store digits in the array, dynamically increasing size if needed
        while (tempNumber != 0) {
            if (index == maxDigit) {
                // Increase array size by 10
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                for (int j = 0; j < digits.length; j++) {
                    temp[j] = digits[j];
                }
                digits = temp;
            }

            int lastDigit = tempNumber % 10;
            digits[index] = lastDigit;
            tempNumber /= 10;
            index++;
        }

        if (index == 0) {
            System.out.println("The number is 0. Only one digit exists.");
            System.out.println("Largest digit: 0");
            System.out.println("Second largest digit: 0");
            return;
        }

        // Find largest and second largest
        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display digits and results
        System.out.println("\nDigits stored in array:");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }

        System.out.println("\n\nLargest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
    }

}
