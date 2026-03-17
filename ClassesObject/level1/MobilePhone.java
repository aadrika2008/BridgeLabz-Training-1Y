package com.gla.ClassesObject.level1;

public class MobilePhone {String brand;
    String model;
    double price;

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        MobilePhone m1 = new MobilePhone();
        m1.brand = "Samsung";
        m1.model = "Galaxy S23";
        m1.price = 75000;

        m1.displayDetails();
    }
}
