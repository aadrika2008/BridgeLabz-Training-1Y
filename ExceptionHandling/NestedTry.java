package com.gla.ExceptionHandling;

public class NestedTry { public static void main(String[] args) {
    int[] arr = {10, 20, 30};

    try {
        int index = 2;
        int divisor = 0;

        try {
            int value = arr[index];
            System.out.println("Result: " + (value / divisor));
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }

    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Invalid array index!");
    }
}
}
