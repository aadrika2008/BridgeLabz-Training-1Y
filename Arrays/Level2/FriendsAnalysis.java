package com.gla.Arrays.Level2;
import java.util.Scanner;
public class FriendsAnalysis {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Input age and height for each friend
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for " + friends[i] + ":");

            // Input age
            while (true) {
                System.out.print("Age: ");
                ages[i] = scanner.nextInt();
                if (ages[i] <= 0) {
                    System.out.println("Invalid age. Please enter a positive number.");
                } else {
                    break;
                }
            }

            // Input height
            while (true) {
                System.out.print("Height (in cm): ");
                heights[i] = scanner.nextDouble();
                if (heights[i] <= 0) {
                    System.out.println("Invalid height. Please enter a positive number.");
                } else {
                    break;
                }
            }
        }

        // Find the youngest
        int youngestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }

        // Find the tallest
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Display results
        System.out.println("\nThe youngest friend is: " + friends[youngestIndex] + " with age " + ages[youngestIndex]);
        System.out.println("The tallest friend is: " + friends[tallestIndex] + " with height " + heights[tallestIndex] + " cm");

        scanner.close();
    }
}


