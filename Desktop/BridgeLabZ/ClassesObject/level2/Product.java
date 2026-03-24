package com.gla.ClassesObject.level2;

public class Product {String productName;
    double price;

    // Class variable
    static int totalProducts = 0;

    // Constructor
    Product(String name, double p) {
        productName = name;
        price = p;
        totalProducts++;   // Increase count when object is created
    }

    // Instance method
    void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    // Class method
    static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    public static void main(String[] args) {
        Product p1 = new Product("Pen", 10);
        Product p2 = new Product("Book", 50);

        p1.displayProductDetails();
        p2.displayProductDetails();

        Product.displayTotalProducts();
    }
}
