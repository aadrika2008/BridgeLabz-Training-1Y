package com.gla.String.Level2;
import java.util.Scanner;
public class StudentScorecard {public static int[][] generateScores(int n) {

    int[][] scores = new int[n][3];

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < 3; j++) {
            scores[i][j] = (int)(Math.random() * 90) + 10;
        }
    }

    return scores;
}

    // Calculate total, average, percentage
    public static double[][] calculateResults(int[][] scores) {

        int n = scores.length;
        double[][] result = new double[n][3];

        for (int i = 0; i < n; i++) {

            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            result[i][0] = total;
            result[i][1] = Math.round(average * 100.0) / 100.0;
            result[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        return result;
    }

    // Assign grades
    public static String[] assignGrades(double[][] result) {

        String[] grades = new String[result.length];

        for (int i = 0; i < result.length; i++) {

            double percent = result[i][2];

            if (percent >= 90) grades[i] = "A+";
            else if (percent >= 80) grades[i] = "A";
            else if (percent >= 70) grades[i] = "B";
            else if (percent >= 60) grades[i] = "C";
            else if (percent >= 50) grades[i] = "D";
            else grades[i] = "F";
        }

        return grades;
    }

    // Display scorecard
    public static void display(int[][] scores, double[][] result, String[] grades) {

        System.out.println("Phy\tChem\tMath\tTotal\tAvg\t%\tGrade");
        System.out.println("------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {

            System.out.println(
                    scores[i][0] + "\t" +
                            scores[i][1] + "\t" +
                            scores[i][2] + "\t" +
                            result[i][0] + "\t" +
                            result[i][1] + "\t" +
                            result[i][2] + "\t" +
                            grades[i]
            );
        }
    }

    public static void main(String[] args) {

        int students = 5;

        int[][] scores = generateScores(students);

        double[][] result = calculateResults(scores);

        String[] grades = assignGrades(result);

        display(scores, result, grades);
    }
}
