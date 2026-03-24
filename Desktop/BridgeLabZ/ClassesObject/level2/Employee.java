package com.gla.ClassesObject.level2;

public class Employee {public int employeeID;        // Public - accessible everywhere
    protected String department;  // Protected - accessible in subclass
    private double salary;        // Private - accessible only inside this class

    // Public method to modify salary
    public void setSalary(double s) {
        salary = s;
    }

    // Public method to access salary
    public double getSalary() {
        return salary;
    }
}

// Subclass
class Manager extends Employee {

    void displayDetails() {
        System.out.println("Employee ID: " + employeeID);   // Accessible (public)
        System.out.println("Department: " + department);    // Accessible (protected)
        System.out.println("Salary: " + getSalary());       // Access via getter
    }

    public static void main(String[] args) {
        Manager m = new Manager();

        m.employeeID = 1001;
        m.department = "Human Resources";
        m.setSalary(80000);

        m.displayDetails();
    }
}
