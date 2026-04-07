package com.gla.wrapperclass.level2;

public class ShoppingCartCalculator { public static void main(String[] args) {
    String[] prices = {"250", "499", "abc", "99"};
    int total = 0;

    for (String price : prices) {
        try {
            total += Integer.parseInt(price);
        } catch (NumberFormatException e) {
            System.out.println("Invalid price: " + price);
        }
    }

    System.out.println("Total price: " + total);
}
}
