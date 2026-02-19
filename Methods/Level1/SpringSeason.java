package com.gla.Methods.Level1;
import java.util.Scanner;
public class SpringSeason {public static boolean isSpring(int month, int day) {
    // Spring: March 20 to June 20
    if (month < 3 || month > 6) return false; // before March or after June

    if (month == 3 && day >= 20) return true; // March 20 onwards
    if (month == 6 && day <= 20) return true; // up to June 20
    if (month == 4 || month == 5) return true; // April and May

    return false; // other days in March or June
}

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide month and day as command line arguments.");
            return;
        }

        // Parse command line arguments
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Check Spring Season
        if (isSpring(month, day)) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }
    }
}
