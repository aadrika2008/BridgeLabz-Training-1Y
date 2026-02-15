package com.gla.Arrays.Level1;
import java.util.Scanner;
public class MeanHeight {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Create double array of size 11
        double[] heights = new double[11];
        double sum = 0;

        // Get input values
        System.out.println("Enter the heights of 11 football players:");

        for (int i = 0; i < heights.length; i++) {
            System.out.print("Height of player " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
            sum += heights[i];   // Add each height to sum
        }

        // Calculate mean
        double mean = sum / heights.length;

        // Display result
        System.out.println("\nMean height of the football team: " + mean);
    }
}
