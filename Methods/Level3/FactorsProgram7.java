package com.gla.Methods.Level3;
import java.util.Arrays;
public class FactorsProgram7 {public static void main(String[] args) {

    int number = 12;

    int[] factors = getFactors(number);

    System.out.println("Number: " + number);
    System.out.println("Factors: " + Arrays.toString(factors));
    System.out.println("Greatest Factor: " + factors[factors.length - 1]);
    System.out.println("Sum of Factors: " + sumFactors(factors));
    System.out.println("Product of Factors: " + productFactors(factors));
    System.out.println("Product of Cubes of Factors: " + productCubeFactors(factors));
}

    // a. Get factors
    public static int[] getFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0) count++;

        int[] f = new int[count];
        int index = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0) f[index++] = i;

        return f;
    }

    // b. Sum of factors
    public static int sumFactors(int[] f) {
        int sum = 0;
        for (int x : f) sum += x;
        return sum;
    }

    // c. Product of factors
    public static long productFactors(int[] f) {
        long prod = 1;
        for (int x : f) prod *= x;
        return prod;
    }

    // d. Product of cubes of factors
    public static double productCubeFactors(int[] f) {
        double prod = 1;
        for (int x : f) prod *= Math.pow(x, 3);
        return prod;
    }
}
