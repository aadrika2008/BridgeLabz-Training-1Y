package com.gla.Methods.Level3;
import java.util.Arrays;
public class EmployeeBonus11 { public static void main(String[] args) {

    int numberOfEmployees = 10;

    // Generate employee data: [salary, years]
    int[][] empData = generateSalaryAndService(numberOfEmployees);

    // Calculate new salary and bonus
    double[][] newData = calculateBonus(empData);

    // Display table
    displaySalaryTable(empData, newData);
}

    // a & b. Generate random salary and years of service
    public static int[][] generateSalaryAndService(int n) {
        int[][] data = new int[n][2];
        for (int i = 0; i < n; i++) {
            data[i][0] = (int)(Math.random() * 90000) + 10000; // 5-digit salary
            data[i][1] = (int)(Math.random() * 10) + 1;        // years 1-10
        }
        return data;
    }

    // c. Calculate new salary and bonus
    public static double[][] calculateBonus(int[][] data) {
        double[][] result = new double[data.length][2];
        for (int i = 0; i < data.length; i++) {
            double bonusPercent = data[i][1] > 5 ? 0.05 : 0.02;
            double bonus = data[i][0] * bonusPercent;
            result[i][0] = data[i][0] + bonus; // new salary
            result[i][1] = bonus;              // bonus
        }
        return result;
    }

    // d. Display salary, bonus, totals
    public static void displaySalaryTable(int[][] oldData, double[][] newData) {
        System.out.println("Emp\tOld Salary\tYears\tBonus\tNew Salary");
        double totalOld = 0, totalNew = 0, totalBonus = 0;
        for (int i = 0; i < oldData.length; i++) {
            System.out.printf("%d\t%d\t\t%d\t%.2f\t%.2f\n",
                    i+1, oldData[i][0], oldData[i][1], newData[i][1], newData[i][0]);
            totalOld += oldData[i][0];
            totalNew += newData[i][0];
            totalBonus += newData[i][1];
        }
        System.out.printf("Totals:\t%.2f\t\t\t%.2f\t%.2f\n", totalOld, totalBonus, totalNew);
    }
}
