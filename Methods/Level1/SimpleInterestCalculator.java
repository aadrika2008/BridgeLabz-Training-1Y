package com.gla.Methods.Level1;
import java.util.Scanner;
public class SimpleInterestCalculator { public static double calculateSimpleInterest(double principal, double rate, double time) {
    return (principal * rate * time) / 100;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter Principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate of Interest (%): ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();

        // Call method to calculate Simple Interest
        double simpleInterest = calculateSimpleInterest(principal, rate, time);

        // Display result
        System.out.println("\nThe Simple Interest is " + simpleInterest +
                " for Principal " + principal +
                ", Rate of Interest " + rate +
                "% and Time " + time + " years.");

        sc.close();
    }
}
