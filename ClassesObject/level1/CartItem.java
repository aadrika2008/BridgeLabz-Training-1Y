package com.gla.ClassesObject.level1;

public class CartItem { String itemName;
    double price;
    int quantity;

    void addItem(String name, double p, int q) {
        itemName = name;
        price = p;
        quantity = q;
    }

    void removeItem() {
        quantity = 0;
        System.out.println("Item removed from cart.");
    }

    void displayTotalCost() {
        System.out.println("Total Cost: " + (price * quantity));
    }

    public static void main(String[] args) {
        CartItem c1 = new CartItem();
        c1.addItem("Pen", 10, 5);
        c1.displayTotalCost();
        c1.removeItem();
        c1.displayTotalCost();
    }
}
