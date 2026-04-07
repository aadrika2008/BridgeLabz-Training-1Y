package com.gla.Threads;

public class BankAccount implements Runnable {
    String name;
    String type;

    public BankAccount(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println(name + " (" + type + ") checking balance | Priority: "
                        + Thread.currentThread().getPriority());
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new BankAccount("Aadrika", "Premium"));
        Thread t2 = new Thread(new BankAccount("Riya", "Regular"));
        Thread t3 = new Thread(new BankAccount("Aman", "Basic"));

        t1.setPriority(10);
        t2.setPriority(5);
        t3.setPriority(1);

        t1.start();
        t2.start();
        t3.start();
    }
}

