package com.gla.Arrays.Level2;
import java.util.Scanner;
public class StudentGrades2D {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        // 2D array to store marks: [student][subject] => 0: Physics, 1: Chemistry, 2: Maths
        int[][] marks = new int[n][3];

        // Arrays to store percentage and grade
        double[] percentage = new double[n];
        String[] grade = new String[n];

        // Input marks for each student
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");

            // Loop through each subject
            String[] subjects = {"Physics", "Chemistry", "Maths"};
            for (int j = 0; j < 3; j++) {
                while (true) {
                    System.out.print(subjects[j] + " marks: ");
                    marks[i][j] = scanner.nextInt();
                    if (marks[i][j] < 0) {
                        System.out.println("Invalid marks. Please enter a positive value.");
                    } else {
                        break;
                    }
                }
            }

            // Calculate percentage
            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = totalMarks / 3.0; // average

            // Assign grade based on percentage
            if (percentage[i] >= 90) {
                grade[i] = "A+";
            } else if (percentage[i] >= 80) {
                grade[i] = "A";
            } else if (percentage[i] >= 70) {
                grade[i] = "B+";
            } else if (percentage[i] >= 60) {
                grade[i] = "B";
            } else if (percentage[i] >= 50) {
                grade[i] = "C";
            } else {
                grade[i] = "F";
            }
        }

        // Display results
        System.out.println("\nStudent\tPhysics\tChemistry\tMaths\tPercentage\tGrade");
        System.out.println("---------------------------------------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%.2f\t\t%s%n",
                    i + 1, marks[i][0], marks[i][1], marks[i][2], percentage[i], grade[i]);
        }


    }
}
