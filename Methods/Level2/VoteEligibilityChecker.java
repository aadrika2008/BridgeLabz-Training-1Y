package com.gla.Methods.Level2;
import java.util.Scanner;
public class VoteEligibilityChecker {  public static boolean checkVotingEligibility(int age) {
    if (age < 0) {
        return false; // Invalid age
    }
    return age >= 18;
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ages = new int[10]; // Array to store ages of 10 students

        // Input ages
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
        }

        // Check eligibility for each student
        for (int i = 0; i < ages.length; i++) {
            if (checkVotingEligibility(ages[i])) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }

        scanner.close();
    }
}
