package com.gla.Methods.Level2;
import java.util.Scanner;
public class HealthUnitConverter {public static double fahrenheitToCelsius(double fahrenheit) {
    return (fahrenheit - 32) * 5 / 9;
}

    // b. Convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // c. Convert pounds to kilograms
    public static double poundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    // d. Convert kilograms to pounds
    public static double kilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    // e. Convert gallons to liters
    public static double gallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    // f. Convert liters to gallons
    public static double litersToGallons(double liters) {
        return liters * 0.264172;
    }

    // Test main method
    public static void main(String[] args) {
        System.out.println("98 F = " + fahrenheitToCelsius(98) + " C");
        System.out.println("37 C = " + celsiusToFahrenheit(37) + " F");
        System.out.println("150 pounds = " + poundsToKilograms(150) + " kg");
        System.out.println("68 kg = " + kilogramsToPounds(68) + " pounds");
        System.out.println("5 gallons = " + gallonsToLiters(5) + " liters");
        System.out.println("10 liters = " + litersToGallons(10) + " gallons");
    }
}
