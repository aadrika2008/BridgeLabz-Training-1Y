package com.gla.Arrays.Level1;
import java.util.Scanner;
public class OddEvenArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Get integer input
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();

        // Check if natural number (greater than 0)
        if (number <= 0) {
            System.out.println("Error: Please enter a natural number (greater than 0).");
            return; // Exit the program
        }

        // Create arrays for odd and even numbers
        int[] even = new int[number / 2 + 1];
        int[] odd = new int[number / 2 + 1];

        // Index variables
        int evenIndex = 0;
        int oddIndex = 0;

        // Iterate from 1 to number
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                even[evenIndex] = i;
                evenIndex++;
            } else {
                odd[oddIndex] = i;
                oddIndex++;
            }
        }

        // Print even numbers
        System.out.println("\nEven Numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(even[i] + " ");
        }

        // Print odd numbers
        System.out.println("\n\nOdd Numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odd[i] + " ");
        }
    }
}
