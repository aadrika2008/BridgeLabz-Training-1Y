package com.gla.Threads;

public class Order  implements Runnable {
    int id;
    String restaurant;
    int time;

    public Order(int id, String restaurant, int time) {
        this.id = id;
        this.restaurant = restaurant;
        this.time = time;
    }

    @Override
    public void run() {
        try {
            System.out.println("Order " + id + " picked up by " + Thread.currentThread().getName());
            Thread.sleep(time * 1000);

            System.out.println("Order " + id + " in transit...");
            Thread.sleep(time * 1000);

            System.out.println("Order " + id + " delivered!");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Order(1, "Dominos", 2));
        Thread t2 = new Thread(new Order(2, "KFC", 3));
        Thread t3 = new Thread(new Order(3, "Pizza Hut", 1));

        t1.setPriority(10);
        t2.setPriority(5);
        t3.setPriority(3);

        t1.start();
        t2.start();
        t3.start();
    }
}
