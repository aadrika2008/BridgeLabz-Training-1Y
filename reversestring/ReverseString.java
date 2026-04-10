package com.gla.reversestring;
import java.util.Stack;
public class ReverseString { public static void main(String[] args) {
    String s = "Hello";
    Stack<Character> stack = new Stack<>();

    // Push all characters
    for (char c : s.toCharArray()) {
        stack.push(c);
    }

    // Pop and build reversed string
    String reversed = "";
    while (!stack.isEmpty()) {
        reversed += stack.pop();
    }

    System.out.println("Reversed String: " + reversed);
}
}
