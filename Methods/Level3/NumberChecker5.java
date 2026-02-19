package com.gla.Methods.Level3;
import java.util.Scanner;
public class NumberChecker5 {public static void main(String[] args) {

    int number = 7;

    System.out.println("Number: " + number);
    System.out.println("Is Prime: " + isPrime(number));
    System.out.println("Is Neon: " + isNeon(number));
    System.out.println("Is Spy: " + isSpy(number));
    System.out.println("Is Automorphic: " + isAutomorphic(number));
    System.out.println("Is Buzz: " + isBuzz(number));
}

    // a. Prime number check
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0) return false;
        return true;
    }

    // b. Neon number check
    public static boolean isNeon(int n) {
        int sq = n * n;
        int sum = 0;
        while (sq > 0) {
            sum += sq % 10;
            sq /= 10;
        }
        return sum == n;
    }

    // c. Spy number check
    public static boolean isSpy(int n) {
        int sum = 0, prod = 1, temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            prod *= digit;
            temp /= 10;
        }
        return sum == prod;
    }

    // d. Automorphic number check
    public static boolean isAutomorphic(int n) {
        int sq = n * n;
        return String.valueOf(sq).endsWith(String.valueOf(n));
    }

    // e. Buzz number check
    public static boolean isBuzz(int n) {
        return n % 7 == 0 || n % 10 == 7;
    }
}
