package com.gla.Threads;

public class Device implements Runnable {
    String name;
    int interval;

    public Device(String name, int interval) {
        this.name = name;
        this.interval = interval;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(name + " running at " + System.currentTimeMillis());
                Thread.sleep(interval);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Thread temp = new Thread(new Device("Temperature Sensor", 5000));
        Thread cam = new Thread(new Device("Security Camera", 3000));
        Thread light = new Thread(new Device("Light Controller", 4000));
        Thread door = new Thread(new Device("Door Lock", 6000));

        cam.setPriority(10);
        temp.setPriority(7);
        light.setPriority(5);
        door.setPriority(5);

        temp.start();
        cam.start();
        light.start();
        door.start();
    }
}
