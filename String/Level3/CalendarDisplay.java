package com.gla.String.Level3;
import java.util.Scanner;
public class CalendarDisplay {  static String[] months = { "January","February","March","April","May","June",
        "July","August","September","October","November","December"};
    static int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};

    // Leap year check
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Number of days in month
    public static int getDaysInMonth(int month, int year) {
        if (month == 2 && isLeapYear(year)) return 29;
        return days[month - 1];
    }

    // Zeller's Congruence for first day
    public static int getFirstDay(int month, int year) {
        int y = year;
        int m = month;
        if (m < 3) {
            m += 12;
            y -= 1;
        }
        int k = y % 100;
        int j = y / 100;
        int d = 1;
        int f = d + 13*(m + 1)/5 + k + k/4 + j/4 + 5*j;
        return f % 7; // 0=Saturday, 1=Sunday...
    }

    public static void displayCalendar(int month, int year) {
        System.out.println("\n   " + months[month - 1] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = getFirstDay(month, year);
        int dayCount = getDaysInMonth(month, year);

        // Adjusting for Sunday=0
        int start = (firstDay + 6) % 7;

        for (int i = 0; i < start; i++) System.out.print("    ");
        for (int day = 1; day <= dayCount; day++) {
            System.out.printf("%3d ", day);
            if ((day + start) % 7 == 0) System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        displayCalendar(month, year);

        sc.close();
    }
}
