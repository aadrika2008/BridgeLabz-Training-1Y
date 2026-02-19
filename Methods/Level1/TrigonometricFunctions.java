package com.gla.Methods.Level1;
import java.util.Scanner;
public class TrigonometricFunctions {public static double[] calculateTrigonometricFunctions(double angleDegrees) {
    double radians = Math.toRadians(angleDegrees);
    double sin = Math.sin(radians);
    double cos = Math.cos(radians);
    double tan = Math.tan(radians);
    return new double[]{sin, cos, tan};
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();

        double[] trigValues = calculateTrigonometricFunctions(angle);
        System.out.printf("Sine: %.4f\nCosine: %.4f\nTangent: %.4f\n", trigValues[0], trigValues[1], trigValues[2]);

        sc.close();
    }
}
