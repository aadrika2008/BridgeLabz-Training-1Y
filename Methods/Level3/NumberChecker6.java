package com.gla.Methods.Level3;
import java.util.Scanner;
public class NumberChecker6{ public static void main(String[] args) {

    int number = 28;

    System.out.println("Number: " + number);
    System.out.println("Perfect: " + isPerfect(number));
    System.out.println("Abundant: " + isAbundant(number));
    System.out.println("Deficient: " + isDeficient(number));
    System.out.println("Strong: " + isStrong(number));
}

// Sum of proper divisors
public static int sumOfDivisors(int n) {
    int sum = 0;
    for (int i = 1; i < n; i++)
        if (n % i == 0) sum += i;
    return sum;
}

// a. Perfect number
public static boolean isPerfect(int n) {
    return sumOfDivisors(n) == n;
}

// b. Abundant number
public static boolean isAbundant(int n) {
    return sumOfDivisors(n) > n;
}

// c. Deficient number
public static boolean isDeficient(int n) {
    return sumOfDivisors(n) < n;
}

// d. Strong number (sum of factorials of digits equals number)
public static boolean isStrong(int n) {
    int sum = 0;
    int temp = n;
    while (temp > 0) {
        int digit = temp % 10;
        sum += factorial(digit);
        temp /= 10;
    }
    return sum == n;
}

// Factorial helper
public static int factorial(int n) {
    int f = 1;
    for (int i = 1; i <= n; i++) f *= i;
    return f;
}
}
