package com.gla.regex;

public class Username {public static void main(String[] args) {
    String s = "user_123";
    System.out.println(s.matches("^[A-Za-z][A-Za-z0-9_]{4,14}$"));
}
}
