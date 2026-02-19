package com.gla.Methods.Level3;
import java.util.Arrays;
public class OTPProgram8Methods { public static void main(String[] args) {

    int numberOfOTPs = 10;

    // Generate OTPs
    int[] otpArray = generateOTPs(numberOfOTPs);

    // Display OTPs
    displayOTPs(otpArray);

    // Check uniqueness
    boolean unique = checkUniqueOTPs(otpArray);
    System.out.println("All OTPs Unique? " + unique);
}

    // Method a: Generate a single 6-digit OTP
    public static int generateOTP() {
        return (int)(Math.random() * 900000) + 100000; // 6-digit OTP
    }

    // Method b: Generate multiple OTPs and return as array
    public static int[] generateOTPs(int n) {
        int[] otps = new int[n];
        for (int i = 0; i < n; i++) {
            otps[i] = generateOTP();
        }
        return otps;
    }

    // Method b: Display the OTPs
    public static void displayOTPs(int[] otps) {
        System.out.println("Generated OTPs: " + Arrays.toString(otps));
    }

    // Method c: Check uniqueness of OTP array
    public static boolean checkUniqueOTPs(int[] otps) {
        for (int i = 0; i < otps.length; i++)
            for (int j = i + 1; j < otps.length; j++)
                if (otps[i] == otps[j]) return false;
        return true;
    }
}
