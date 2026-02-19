package com.gla.Methods.Level1;
import java.util.Scanner;
public class NumberCheck {public static int checkNumber(int number) {
    if (number > 0) return 1;       // Positive
    else if (number < 0) return -1; // Negative
    else return 0;                  // Zero
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number from user
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        // Call method
        int result = checkNumber(num);

        // Display result
        if (result == 1) System.out.println(num + " is a Positive number.");
        else if (result == -1) System.out.println(num + " is a Negative number.");
        else System.out.println(num + " is Zero.");

        sc.close();
    }
}
