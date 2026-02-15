package com.gla.Arrays.Level1;
import java.util.Scanner;

public class StoreAndSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];   // Maximum of 10 values
        int count = 0;                // To track how many numbers are entered
        int sum = 0;

        System.out.println("Enter up to 10 positive numbers (0 or negative number to stop):");

        // Store values until max 10 or user enters 0/negative
        while (count < 10) {
            System.out.print("Enter number " + (count + 1) + ": ");
            int input = scanner.nextInt();

            if (input <= 0) {
                break;  // Stop if 0 or negative number is entered
            }

            numbers[count] = input;
            sum += input;
            count++;
        }

        // Display entered numbers
        System.out.println("\nNumbers entered:");
        for (int i = 0; i < count; i++) {
            System.out.println(numbers[i]);
        }

        // Display sum
        System.out.println("\nSum of all numbers: " + sum);

        scanner.close();
    }

}
