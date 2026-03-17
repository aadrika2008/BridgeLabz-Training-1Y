package com.gla.ClassesObject.level1;

public class Employee {    String name;
    int id;
    double salary;

    // Method to display employee details
    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
    }

    // Main method
    public static void main(String[] args) {
        // Creating object of Employee class
        Employee emp1 = new Employee();

        // Assigning values
        emp1.name = "Aadrika";
        emp1.id = 101;
        emp1.salary = 50000;

        // Calling method
        emp1.displayDetails();
    }

}
