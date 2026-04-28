package com.gla.regex;
import java.util.regex.*;
import java.util.Scanner;
public class EmailExtractor {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter text:");
    String text = sc.nextLine();

    String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z.-]+\\.[a-zA-Z]{2,}";

    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(text);

    System.out.println("Emails found:");
    while (matcher.find()) {
        System.out.println(matcher.group());
    }

    sc.close();
}
}
