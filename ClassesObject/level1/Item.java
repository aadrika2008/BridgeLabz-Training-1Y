package com.gla.ClassesObject.level1;

public class Item {
    int itemCode;
    String itemName;
    double price;

    // Method to display item details
    void displayItem() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Item: " + price);
    }

    // Method to calculate total cost
    double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        Item i1 = new Item();
        i1.itemCode = 101;
        i1.itemName = "Notebook";
        i1.price = 50;

        i1.displayItem();
        System.out.println("Total Cost (5 items): " + i1.calculateTotalCost(5));
    }
}