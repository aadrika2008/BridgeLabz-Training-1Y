package com.gla.workshop;

public class PrimeNumbers {
        public static void main(String[] args) {

            System.out.println("Prime numbers between 1 and 100 are:");

            for (int num = 2; num <= 100; num++) {
                boolean isPrime = true;

                // Check if number is prime
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }

                // Print if prime
                if (isPrime) {
                    System.out.print(num + " ");
                }
            }
        }

}
