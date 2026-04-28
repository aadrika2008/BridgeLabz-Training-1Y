package com.gla.regex;
import java.util.Scanner;

public class RemoveSpaces {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter text:");
    String text = sc.nextLine();

    // Replace multiple spaces with single space
    String result = text.replaceAll("\\s+", " ");

    System.out.println("Output: " + result);

    sc.close();
}
}
