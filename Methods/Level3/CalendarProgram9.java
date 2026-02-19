package com.gla.Methods.Level3;
import java.util.Scanner;
public class CalendarProgram9 {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter month (1-12): ");
    int month = sc.nextInt();

    System.out.print("Enter year: ");
    int year = sc.nextInt();

    displayCalendar(month, year);
    sc.close();
}

    // a. Get month name
    public static String getMonthName(int month) {
        String[] months = { "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December" };
        return months[month - 1];
    }

    // b. Get number of days in month
    public static int getDaysInMonth(int month, int year) {
        int[] days = { 31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31 };
        if (month == 2 && isLeapYear(year)) return 29;
        return days[month - 1];
    }

    // Leap year check
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // c. Get first day of month (0=Sunday, 1=Monday, ..., 6=Saturday)
    public static int getFirstDay(int month, int year) {
        int m = month;
        int y = year;
        if (m < 3) {
            m += 12;
            y -= 1;
        }
        int k = y % 100;
        int j = y / 100;
        int h = (1 + (13 * (m + 1)) / 5 + k + k/4 + j/4 + 5*j) % 7;
        // Zeller's congruence: 0=Saturday, 1=Sunday,...6=Friday
        int day = (h + 6) % 7; // Convert 0=Sunday, 1=Monday,...6=Saturday
        return day;
    }

    // d. Display calendar
    public static void displayCalendar(int month, int year) {
        System.out.println("\n  " + getMonthName(month) + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");

        int firstDay = getFirstDay(month, year);
        int days = getDaysInMonth(month, year);

        // Print initial spaces
        for (int i = 0; i < firstDay; i++) {
            System.out.print("   ");
        }

        // Print days
        for (int i = 1; i <= days; i++) {
            System.out.printf("%2d ", i);
            if ((i + firstDay) % 7 == 0) System.out.println();
        }
        System.out.println();
    }
}
