package com.gla.ClassesObject.level2;

public class CollegeStudent {    public int rollNumber;
    protected String name;
    private double CGPA;

    public void setCGPA(double cgpa) {
        CGPA = cgpa;
    }

    public double getCGPA() {
        return CGPA;
    }
}

class SeniorStudent extends CollegeStudent {
    void displayDetails() {
        System.out.println("Roll No: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + getCGPA());
    }

    public static void main(String[] args) {
        SeniorStudent ss = new SeniorStudent();
        ss.rollNumber = 101;
        ss.name = "Aadrika";
        ss.setCGPA(9.0);

        ss.displayDetails();
    }
}
