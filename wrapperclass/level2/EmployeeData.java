package com.gla.wrapperclass.level2;
import java.util.*;

public class EmployeeData { public static void main(String[] args) {
    int[] agesArray = {25, 30, 22, 45, 28};

    ArrayList<Integer> agesList = new ArrayList<>();

    // Convert int[] → ArrayList<Integer>
    for (int age : agesArray) {
        agesList.add(age); // auto-boxing
    }

    int youngest = Collections.min(agesList);
    int oldest = Collections.max(agesList);

    System.out.println("Youngest: " + youngest);
    System.out.println("Oldest: " + oldest);
}
}
