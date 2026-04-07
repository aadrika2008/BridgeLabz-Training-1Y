package com.gla.wrapperclass.level2;
import java.util.*;
public class ProductRatings {public static void main(String[] args) {
    int[] primitiveRatings = {4, 5, 3};
    ArrayList<Integer> objectRatings = new ArrayList<>(
            Arrays.asList(5, null, 4)
    );

    ArrayList<Integer> allRatings = new ArrayList<>();

    // Add primitive array (auto-boxing)
    for (int r : primitiveRatings) {
        allRatings.add(r);
    }

    // Add object list
    allRatings.addAll(objectRatings);

    int sum = 0, count = 0;

    for (Integer rating : allRatings) {
        if (Objects.nonNull(rating)) {
            sum += rating; // auto-unboxing
            count++;
        }
    }

    double avg = (count == 0) ? 0 : (double) sum / count;

    System.out.println("Average Rating: " + avg);
}
}
