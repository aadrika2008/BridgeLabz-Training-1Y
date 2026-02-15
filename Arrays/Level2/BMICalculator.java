package com.gla.Arrays.Level2;
import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Take input for number of persons
        System.out.print("Enter the number of persons: ");
        int n = scanner.nextInt();

        // Arrays to store weight (kg), height (m), BMI, and status
        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        // Input weight and height for each person
        for (int i = 0; i < n; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");

            while (true) {
                System.out.print("Weight (kg): ");
                weight[i] = scanner.nextDouble();
                if (weight[i] <= 0) {
                    System.out.println("Invalid weight. Please enter a positive value.");
                } else {
                    break;
                }
            }

            while (true) {
                System.out.print("Height (m): ");
                height[i] = scanner.nextDouble();
                if (height[i] <= 0) {
                    System.out.println("Invalid height. Please enter a positive value.");
                } else {
                    break;
                }
            }
        }

        // Calculate BMI and determine weight status
        for (int i = 0; i < n; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]); // BMI formula

            // Determine weight status
            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] < 24.9) {
                status[i] = "Normal weight";
            } else if (bmi[i] < 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // Display results
        System.out.println("\nHeight (m)\tWeight (kg)\tBMI\t\tStatus");
        System.out.println("-------------------------------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f\t\t%.2f\t\t%.2f\t%s%n", height[i], weight[i], bmi[i], status[i]);
        }
    }

}
