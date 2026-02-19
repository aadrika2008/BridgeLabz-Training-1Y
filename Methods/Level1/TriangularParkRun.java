package com.gla.Methods.Level1;
import java.util.Scanner;
public class TriangularParkRun { public static double calculateRounds(double side1, double side2, double side3, double targetDistanceMeters) {
    double perimeter = side1 + side2 + side3; // Perimeter of triangle in meters
    return targetDistanceMeters / perimeter;  // Number of rounds
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for sides of the triangle in meters
        System.out.print("Enter side 1 of the triangle (meters): ");
        double side1 = sc.nextDouble();

        System.out.print("Enter side 2 of the triangle (meters): ");
        double side2 = sc.nextDouble();

        System.out.print("Enter side 3 of the triangle (meters): ");
        double side3 = sc.nextDouble();

        // Target distance: 5 km = 5000 meters
        double targetDistance = 5000.0;

        // Call method to calculate rounds
        double rounds = calculateRounds(side1, side2, side3, targetDistance);

        // Display result
        System.out.printf("\nThe athlete must complete %.2f rounds to cover %.0f meters.\n", rounds, targetDistance);

        sc.close();
    }
}
