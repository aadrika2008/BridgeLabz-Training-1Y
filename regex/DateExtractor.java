package com.gla.regex;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class DateExtractor { public static void main(String[] args) {

    String text = "Events on 12/05/2023 and 15/08/2024";

    // Correct regex
    String regex = "\\b\\d{2}/\\d{2}/\\d{4}\\b";

    Pattern p = Pattern.compile(regex);
    Matcher m = p.matcher(text);

    System.out.println("Dates found:");

    while (m.find()) {
        System.out.println(m.group());
    }
}
}
