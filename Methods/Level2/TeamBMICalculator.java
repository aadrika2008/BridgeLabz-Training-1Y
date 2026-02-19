package com.gla.Methods.Level2;
import java.util.Scanner;
public class TeamBMICalculator {public static double calculateBMI(double weightKg, double heightCm) {
    double heightM = heightCm / 100.0; // Convert cm to meters
    return weightKg / (heightM * heightM);
}

    // Method to determine BMI status
    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal";
        else if (bmi < 30) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] teamData = new double[10][3];
        // Column 0: weight, Column 1: height, Column 2: BMI

        // Input weight and height for 10 members
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) of member " + (i + 1) + ": ");
            teamData[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) of member " + (i + 1) + ": ");
            teamData[i][1] = sc.nextDouble();
            // Calculate BMI
            teamData[i][2] = calculateBMI(teamData[i][0], teamData[i][1]);
        }

        // Display results
        System.out.println("\nMember\tWeight(kg)\tHeight(cm)\tBMI\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t%.1f\t\t%.1f\t\t%.2f\t%s\n",
                    (i + 1), teamData[i][0], teamData[i][1], teamData[i][2],
                    getBMIStatus(teamData[i][2]));
        }

        sc.close();
    }
}
