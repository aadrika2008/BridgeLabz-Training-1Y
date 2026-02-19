package com.gla.Methods.Level3;
import java.util.Arrays;
public class NumberChecker3 {public static void main(String[] args) {

    int number = 21;

    System.out.println("Number: " + number);

    int count = countDigits(number);
    int[] digits = getDigits(number);

    System.out.println("Digit Count: " + count);
    System.out.println("Digits: " + Arrays.toString(digits));

    int sum = sumDigits(digits);
    int sumSquares = sumSquareDigits(digits);

    System.out.println("Sum of digits: " + sum);
    System.out.println("Sum of squares: " + sumSquares);

    System.out.println("Harshad Number: " + isHarshad(number, digits));

    int[][] freq = digitFrequency(digits);
    System.out.println("Digit Frequency:");
    System.out.println("Digit\tFrequency");
    for (int i = 0; i < freq.length; i++) {
        if (freq[i][1] > 0) {
            System.out.println(freq[i][0] + "\t" + freq[i][1]);
        }
    }
}

    // a. Count digits
    public static int countDigits(int n) {
        return String.valueOf(n).length();
    }

    // a. Store digits in array
    public static int[] getDigits(int n) {
        String s = String.valueOf(n);
        int[] d = new int[s.length()];
        for (int i = 0; i < s.length(); i++)
            d[i] = s.charAt(i) - '0';
        return d;
    }

    // b. Sum of digits
    public static int sumDigits(int[] d) {
        int sum = 0;
        for (int x : d) sum += x;
        return sum;
    }

    // c. Sum of squares
    public static int sumSquareDigits(int[] d) {
        int sum = 0;
        for (int x : d) sum += Math.pow(x, 2);
        return sum;
    }

    // d. Harshad number
    public static boolean isHarshad(int n, int[] d) {
        return n % sumDigits(d) == 0;
    }

    // e. Frequency of each digit (0-9)
    public static int[][] digitFrequency(int[] d) {
        int[][] freq = new int[10][2]; // [digit, count]
        for (int i = 0; i < 10; i++) freq[i][0] = i;

        for (int x : d) freq[x][1]++;
        return freq;
    }
}
