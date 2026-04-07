package com.gla.Threads;

public class Ticket extends Thread {
    int id;
    String type;

    public Ticket(int id, String type) {
        this.id = id;
        this.type = type;
    }

    public void run() {
        try {
            int time = (int) (Math.random() * 5000) + 1000;

            System.out.println("Ticket " + id + " (" + type + ") started by " + getName());
            Thread.sleep(time);
            System.out.println("Ticket " + id + " completed in " + time + " ms");

        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Ticket t1 = new Ticket(1, "Critical Bug");
        Ticket t2 = new Ticket(2, "Feature Request");
        Ticket t3 = new Ticket(3, "General Query");

        t1.setPriority(10);
        t2.setPriority(4);
        t3.setPriority(2);

        t1.start();
        t2.start();
        t3.start();
    }
}
