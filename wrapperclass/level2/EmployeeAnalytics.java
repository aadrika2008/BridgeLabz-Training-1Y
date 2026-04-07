package com.gla.wrapperclass.level2;
import java.util.*;
public class EmployeeAnalytics {  public static void main(String[] args) {
    int[] ages = {22, 35, 18, 40};

    ArrayList<Integer> list = new ArrayList<>();
    for (int age : ages) {
        list.add(age); // auto-boxing
    }

    System.out.println("Youngest: " + Collections.min(list));
    System.out.println("Oldest: " + Collections.max(list));
}
}
