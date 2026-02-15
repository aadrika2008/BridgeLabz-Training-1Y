package com.gla.Arrays.Level2;
import java.util.Scanner;
public class StudentGrades {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        // Arrays to store marks for 3 subjects, percentage, and grade
        int[][] marks = new int[n][3]; // [Physics, Chemistry, Maths]
        double[] percentage = new double[n];
        String[] grade = new String[n];

        // Input marks
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");

            // Physics
            while (true) {
                System.out.print("Physics marks: ");
                marks[i][0] = scanner.nextInt();
                if (marks[i][0] < 0) {
                    System.out.println("Invalid marks. Please enter positive value.");
                } else {
                    break;
                }
            }

            // Chemistry
            while (true) {
                System.out.print("Chemistry marks: ");
                marks[i][1] = scanner.nextInt();
                if (marks[i][1] < 0) {
                    System.out.println("Invalid marks. Please enter positive value.");
                } else {
                    break;
                }
            }

            // Maths
            while (true) {
                System.out.print("Maths marks: ");
                marks[i][2] = scanner.nextInt();
                if (marks[i][2] < 0) {
                    System.out.println("Invalid marks. Please enter positive value.");
                } else {
                    break;
                }
            }

            // Calculate percentage
            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = (totalMarks / 3.0); // average marks

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
