package com.gla.Arrays.Level1;
import java.util.Scanner;
public class MultiplicationFromSixToNine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Take integer input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Define array to store multiplication results (6 to 9 → 4 values)
        int[] multiplicationResult = new int[4];

        // Calculate multiplication from 6 to 9
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i;
        }

        // Display the results
        System.out.println("\nMultiplication table of " + number + " from 6 to 9:");
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
        }
    }
}
