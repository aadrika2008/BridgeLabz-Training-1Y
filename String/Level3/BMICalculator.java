package com.gla.String.Level3;
import java.util.Scanner;
public class BMICalculator { public static String[] calculateBMI(double weight, double heightCm) {

    double heightMeter = heightCm / 100.0;

    double bmi = weight / (heightMeter * heightMeter);

    // Round BMI to 2 decimal places
    bmi = Math.round(bmi * 100.0) / 100.0;

    String status;

    if (bmi < 18.5)
        status = "Underweight";
    else if (bmi < 24.9)
        status = "Normal";
    else if (bmi < 29.9)
        status = "Overweight";
    else
        status = "Obese";

    return new String[]{String.valueOf(bmi), status};
}

    // Method to process all persons
    public static String[][] generateBMIReport(double[][] data) {

        String[][] report = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {

            double weight = data[i][0];
            double height = data[i][1];

            String[] bmiResult = calculateBMI(weight, height);

            report[i][0] = String.valueOf(height);      // Height (cm)
            report[i][1] = String.valueOf(weight);      // Weight (kg)
            report[i][2] = bmiResult[0];                // BMI
            report[i][3] = bmiResult[1];                // Status
        }

        return report;
    }

    // Method to display result in tabular format
    public static void displayReport(String[][] report) {

        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\t\tStatus");
        System.out.println("---------------------------------------------------------");

        for (int i = 0; i < report.length; i++) {

            System.out.println(
                    report[i][0] + "\t\t" +
                            report[i][1] + "\t\t" +
                            report[i][2] + "\t\t" +
                            report[i][3]
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] persons = new double[10][2]; // 10 rows, 2 columns

        // Take input
        for (int i = 0; i < 10; i++) {

            System.out.println("\nEnter details for Person " + (i + 1));

            System.out.print("Weight (kg): ");
            persons[i][0] = sc.nextDouble();

            System.out.print("Height (cm): ");
            persons[i][1] = sc.nextDouble();
        }

        // Generate report
        String[][] bmiReport = generateBMIReport(persons);

        // Display report
        displayReport(bmiReport);

        sc.close();
    }
}
