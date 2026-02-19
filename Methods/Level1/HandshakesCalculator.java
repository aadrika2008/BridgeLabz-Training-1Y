package com.gla.Methods.Level1;
import java. util.Scanner;
public class HandshakesCalculator {public static int calculateHandshakes(int numberOfStudents) {
    return (numberOfStudents * (numberOfStudents - 1)) / 2;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        if (numberOfStudents < 2) {
            System.out.println("At least 2 students are required for a handshake.");
        } else {
            // Call method to calculate handshakes
            int maxHandshakes = calculateHandshakes(numberOfStudents);

            // Display result
            System.out.println("\nThe maximum number of possible handshakes among " +
                    numberOfStudents + " students is " + maxHandshakes + ".");
        }

        sc.close();
    }
}
