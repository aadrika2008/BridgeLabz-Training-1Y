package com.gla.ClassesObject.level1;

public class Circle {double radius;

    // Method to calculate area
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display results
    void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }

    // Main method
    public static void main(String[] args) {
        // Creating object
        Circle c1 = new Circle();

        // Assigning value
        c1.radius = 7;

        // Displaying results
        c1.display();
    }
}
