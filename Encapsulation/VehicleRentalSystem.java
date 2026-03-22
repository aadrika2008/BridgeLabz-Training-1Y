package com.gla.Encapsulation;
interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

// Abstract Class
abstract class Vehicle implements Insurable {
    private String vehicleNumber;
    private String type;
    private double rentalRate;
    private String insurancePolicyNumber; // encapsulated (sensitive)

    // Constructor
    public Vehicle(String vehicleNumber, String type, double rentalRate, String policyNo) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
        this.insurancePolicyNumber = policyNo;
    }

    // Getters (Encapsulation)
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    // Protected access (restricted)
    protected String getInsurancePolicyNumber() {
        return insurancePolicyNumber;
    }

    // Abstract Method
    public abstract double calculateRentalCost(int days);

    // Display Method
    public void displayDetails(int days) {
        System.out.println("Vehicle No: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Rental Cost (" + days + " days): " + calculateRentalCost(days));
        System.out.println("Insurance: " + getInsuranceDetails());
        System.out.println("-----------------------------");
    }
}

// Car Class
class Car extends Vehicle {
    public Car(String number, double rate, String policyNo) {
        super(number, "Car", rate, policyNo);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    public double calculateInsurance() {
        return getRentalRate() * 0.10; // 10%
    }

    public String getInsuranceDetails() {
        return "Car Insurance (Policy: " + getInsurancePolicyNumber() +
                ", Amount: " + calculateInsurance() + ")";
    }
}

// Bike Class
class Bike extends Vehicle {
    public Bike(String number, double rate, String policyNo) {
        super(number, "Bike", rate, policyNo);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    public double calculateInsurance() {
        return getRentalRate() * 0.05; // 5%
    }

    public String getInsuranceDetails() {
        return "Bike Insurance (Policy: " + getInsurancePolicyNumber() +
                ", Amount: " + calculateInsurance() + ")";
    }
}

// Truck Class
class Truck extends Vehicle {
    public Truck(String number, double rate, String policyNo) {
        super(number, "Truck", rate, policyNo);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 1.5; // extra load charge
    }

    public double calculateInsurance() {
        return getRentalRate() * 0.15; // 15%
    }

    public String getInsuranceDetails() {
        return "Truck Insurance (Policy: " + getInsurancePolicyNumber() +
                ", Amount: " + calculateInsurance() + ")";
    }
}
public class VehicleRentalSystem {
    public static void main(String[] args) {

        Vehicle v1 = new Car("UP32-1234", 2000, "CAR123");
        Vehicle v2 = new Bike("UP32-5678", 500, "BIKE456");
        Vehicle v3 = new Truck("UP32-9999", 4000, "TRUCK789");

        Vehicle[] vehicles = {v1, v2, v3};

        int days = 3;

        // Polymorphism
        for (Vehicle v : vehicles) {
            v.displayDetails(days);
        }
    }
}
