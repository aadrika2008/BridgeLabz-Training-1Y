package com.gla.wrapperclass.level1;

public class WrapperToPrimitive { public static void main(String[] args) {
    Double obj = 45.67;

    double d = obj;
    int i = (int) d;

    System.out.println("Double: " + d);
    System.out.println("Int: " + i);
}
}
