package com.gla.Methods.Level2;
import java.util.Scanner;
public class FriendStats { public static String findYoungest(String[] names, int[] ages) {
    int minAge = ages[0];
    int index = 0;
    for (int i = 1; i < ages.length; i++) {
        if (ages[i] < minAge) {
            minAge = ages[i];
            index = i;
        }
    }
    return names[index];
}

    // Method to find the tallest friend
    public static String findTallest(String[] names, double[] heights) {
        double maxHeight = heights[0];
        int index = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                index = i;
            }
        }
        return names[index];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Input ages and heights
        for (int i = 0; i < friends.length; i++) {
            System.out.print("Enter age of " + friends[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of " + friends[i] + " in cm: ");
            heights[i] = sc.nextDouble();
        }

        // Find youngest and tallest
        String youngest = findYoungest(friends, ages);
        String tallest = findTallest(friends, heights);

        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);

        sc.close();
    }
}
