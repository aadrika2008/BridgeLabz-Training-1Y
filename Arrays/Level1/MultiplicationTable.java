package com.gla.Arrays.Level1;
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Get integer input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Define integer array to store results from 1 to 10
        int[] table = new int[10];

        // Loop from 1 to 10 and store results
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        // Display the multiplication table
        System.out.println("\nMultiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }
    }
}
