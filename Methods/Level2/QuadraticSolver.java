package com.gla.Methods.Level2;
import java.util.Scanner;
public class QuadraticSolver { public static double[] findQuadraticRoots(double a, double b, double c) {
    double delta = b * b - 4 * a * c;

    if (delta < 0) {
        return new double[0]; // No real roots
    } else if (delta == 0) {
        return new double[] { -b / (2 * a) }; // One real root
    } else {
        double root1 = (-b + Math.sqrt(delta)) / (2 * a);
        double root2 = (-b - Math.sqrt(delta)) / (2 * a);
        return new double[] { root1, root2 };
    }
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter coefficient a: ");
        double a = sc.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = sc.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = sc.nextDouble();

        double[] roots = findQuadraticRoots(a, b, c);

        if (roots.length == 0) {
            System.out.println("The equation has no real roots.");
        } else if (roots.length == 1) {
            System.out.println("The equation has one real root: " + roots[0]);
        } else {
            System.out.println("The equation has two real roots: " + roots[0] + " and " + roots[1]);
        }

        sc.close();
    }
}
