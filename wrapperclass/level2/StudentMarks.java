package com.gla.wrapperclass.level2;
import java.util.*;
public class StudentMarks { public static void main(String[] args) {
    Object[] inputs = {"85", 95, Integer.valueOf(88), "null", "abc"};

    ArrayList<Integer> validMarks = new ArrayList<>();

    for (Object input : inputs) {
        try {
            if (input instanceof String) {
                String str = (String) input;
                if (str.equalsIgnoreCase("null")) continue;

                validMarks.add(Integer.parseInt(str));
            } else if (input instanceof Integer) {
                validMarks.add((Integer) input);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input skipped: " + input);
        }
    }

    int sum = 0;
    for (Integer mark : validMarks) {
        sum += mark;
    }

    double avg = validMarks.isEmpty() ? 0 : (double) sum / validMarks.size();

    System.out.println("Average Marks: " + avg);
}
}
