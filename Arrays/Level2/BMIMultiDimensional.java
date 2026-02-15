package com.gla.Arrays.Level2;
import java.util.Scanner;
public class BMIMultiDimensional {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Take input for number of persons
        System.out.print("Enter the number of persons: ");
        int number = scanner.nextInt();

        // Create 2D array to store [weight, height, BMI] for each person
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number]; // Array to store weight status

        // Input weight and height
        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");

            while (true) {
                System.out.print("Weight (kg): ");
                personData[i][0] = scanner.nextDouble();
                if (personData[i][0] <= 0) {
                    System.out.println("Invalid weight. Please enter a positive value.");
                } else {
                    break;
                }
            }

            while (true) {
                System.out.print("Height (m): ");
                personData[i][1] = scanner.nextDouble();
                if (personData[i][1] <= 0) {
                    System.out.println("Invalid height. Please enter a positive value.");
                } else {
                    break;
                }
            }

            // Calculate BMI and store in array
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            // Determine weight status
            double bmi = personData[i][2];
            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display results
        System.out.println("\nHeight (m)\tWeight (kg)\tBMI\t\tStatus");
        System.out.println("-------------------------------------------------------");
        for (int i = 0; i < number; i++) {
            System.out.printf("%.2f\t\t%.2f\t\t%.2f\t%s%n",
                    personData[i][1], // height
                    personData[i][0], // weight
                    personData[i][2], // BMI
                    weightStatus[i]); // status
        }
    }
}
