package com.gla.Methods.Level3;
import java.util.Scanner;
public class DistanceLine12 { public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter x1, y1: ");
    double x1 = sc.nextDouble();
    double y1 = sc.nextDouble();

    System.out.print("Enter x2, y2: ");
    double x2 = sc.nextDouble();
    double y2 = sc.nextDouble();

    // Calculate Euclidean distance
    double distance = euclideanDistance(x1, y1, x2, y2);
    System.out.printf("Euclidean Distance: %.2f\n", distance);

    // Get equation of line
    double[] line = lineEquation(x1, y1, x2, y2);
    System.out.printf("Equation of Line: y = %.2fx + %.2f\n", line[0], line[1]);

    sc.close();
}

    // a & b. Euclidean distance
    public static double euclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // c. Equation of line: returns array [slope, intercept]
    public static double[] lineEquation(double x1, double y1, double x2, double y2) {
        double m = (y2 - y1) / (x2 - x1); // slope
        double b = y1 - m * x1;           // y-intercept
        return new double[]{m, b};
    }
}
