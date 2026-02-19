package com.gla.Methods.Level3;
import java.util.Scanner;
public class NumberChecker { public static void main(String[] args) {

    int number = 153;

    int count = countDigits(number);
    int[] digits = getDigits(number);

    System.out.println("Number: " + number);
    System.out.println("Count of digits: " + count);

    System.out.print("Digits: ");
    for (int d : digits) {
        System.out.print(d + " ");
    }

    System.out.println("\nIs Duck Number: " + isDuckNumber(digits));
    System.out.println("Is Armstrong Number: " + isArmstrong(number, digits));

    int[] largest = findLargestAndSecondLargest(digits);
    System.out.println("Largest Digit: " + largest[0]);
    System.out.println("Second Largest Digit: " + largest[1]);

    int[] smallest = findSmallestAndSecondSmallest(digits);
    System.out.println("Smallest Digit: " + smallest[0]);
    System.out.println("Second Smallest Digit: " + smallest[1]);
}

    // a. Count digits
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    // b. Store digits in array
    public static int[] getDigits(int num) {
        String str = String.valueOf(num);
        int[] digits = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            digits[i] = str.charAt(i) - '0';
        }
        return digits;
    }

    // c. Duck number (contains at least one zero)
    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) {
            if (d == 0) {
                return true;
            }
        }
        return false;
    }

    // d. Armstrong number
    public static boolean isArmstrong(int number, int[] digits) {
        int power = digits.length;
        int sum = 0;

        for (int d : digits) {
            sum += Math.pow(d, power);
        }

        return sum == number;
    }

    // e. Largest and Second Largest
    public static int[] findLargestAndSecondLargest(int[] digits) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int d : digits) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }

        return new int[]{largest, secondLargest};
    }

    // f. Smallest and Second Smallest
    public static int[] findSmallestAndSecondSmallest(int[] digits) {

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int d : digits) {
            if (d < smallest) {
                secondSmallest = smallest;
                smallest = d;
            } else if (d < secondSmallest && d != smallest) {
                secondSmallest = d;
            }
        }

        return new int[]{smallest, secondSmallest};
    }
}
