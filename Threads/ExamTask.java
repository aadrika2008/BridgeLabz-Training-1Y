package com.gla.Threads;

public class ExamTask  extends Thread {
    String task;

    public ExamTask(String task) {
        this.task = task;
    }

    public void run() {
        try {
            System.out.println(task + " State: " + getState());

            if (task.equals("Question Paper")) Thread.sleep(5000);
            if (task.equals("Attendance")) Thread.sleep(10000);

            System.out.println(task + " running...");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        ExamTask entry = new ExamTask("Entry");
        ExamTask paper = new ExamTask("Question Paper");
        ExamTask attendance = new ExamTask("Attendance");
        ExamTask collection = new ExamTask("Collection");

        paper.setPriority(10);
        attendance.setPriority(8);
        entry.setPriority(5);
        collection.setPriority(7);

        entry.start();
        paper.start();
        attendance.start();
        collection.start();
    }
}

