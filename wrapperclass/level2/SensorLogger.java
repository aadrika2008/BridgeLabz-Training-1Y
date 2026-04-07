package com.gla.wrapperclass.level2;
import java.util.*;
public class SensorLogger { public static void logTemperature(Double temp) {
    if (temp != null) {
        System.out.println("Logged temperature: " + temp);
    } else {
        System.out.println("No data");
    }
}

    public static void main(String[] args) {
        double primitiveTemp = 36.5;
        Double wrapperTemp = 40.2;

        logTemperature(primitiveTemp); // auto-boxing
        logTemperature(wrapperTemp);
    }
}
