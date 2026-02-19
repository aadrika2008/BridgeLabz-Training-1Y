package com.gla.Methods.Level3;
import java.util.Scanner;
public class StudentMarks13 {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter number of students: ");
    int n = sc.nextInt();

    // Generate random marks
    int[][] marks = generateMarks(n);

    // Calculate totals, averages, percentages
    double[][] results = calculateResults(marks);

    // Display scorecard
    displayScorecard(marks, results);

    sc.close();
}

    // a & b. Generate random 2-digit marks for PCM
    public static int[][] generateMarks(int n) {
        int[][] marks = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = (int)(Math.random() * 51) + 50; // marks 50-100
            }
        }
        return marks;
    }

    // c. Calculate total, average, percentage
    public static double[][] calculateResults(int[][] marks) {
        int n = marks.length;
        double[][] results = new double[n][3]; // [total, average, percentage]
        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = total / 3.0;
            double perc = avg; // since marks out of 100, average = percentage
            results[i][0] = total;
            results[i][1] = Math.round(avg * 100.0) / 100.0; // round 2 decimals
            results[i][2] = Math.round(perc * 100.0) / 100.0;
        }
        return results;
    }

    // d. Display scorecard
    public static void displayScorecard(int[][] marks, double[][] results) {
        System.out.println("Stu\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        for (int i = 0; i < marks.length; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%d\t%.2f\t%.2f\n",
                    i + 1,
                    marks[i][0], marks[i][1], marks[i][2],
                    (int)results[i][0],
                    results[i][1],
                    results[i][2]);
        }
    }
}
