package com.gla.regex;
import java.util.Scanner;

public class CensorWords { public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String text = "This is a damn bad example with stupid words";

    // Replace bad words
    String result = text.replaceAll("damn|stupid", "****");

    System.out.println(result);

    sc.close();
}
}
