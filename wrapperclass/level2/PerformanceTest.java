package com.gla.wrapperclass.level2;
import java.util.*;
public class PerformanceTest { public static void main(String[] args) {
    int n = 1_000_000;

    // int[]
    long start1 = System.currentTimeMillis();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
        arr[i] = i;
    }

    long sum1 = 0;
    for (int i : arr) {
        sum1 += i;
    }
    long end1 = System.currentTimeMillis();

    // ArrayList<Integer>
    long start2 = System.currentTimeMillis();
    ArrayList<Integer> list = new ArrayList<>();

    for (int i = 0; i < n; i++) {
        list.add(i); // auto-boxing
    }

    long sum2 = 0;
    for (Integer i : list) {
        sum2 += i; // auto-unboxing
    }
    long end2 = System.currentTimeMillis();

    System.out.println("int[] time: " + (end1 - start1) + " ms");
    System.out.println("ArrayList<Integer> time: " + (end2 - start2) + " ms");
}
}
