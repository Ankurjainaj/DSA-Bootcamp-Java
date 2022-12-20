package com.Ankur.Threads;

// Java Program to demonstrate the
// use of Volatile Keyword in Java

public class VolatileTest {
    private static volatile int MY_INT = 0;

    public static void main(String[] args) {
        new ChangeListener().start();
        new ChangeMaker().start();
    }

    static class ChangeListener extends Thread {
        @Override
        public void run() {
            int localValue = MY_INT;
            while (localValue < 5) {
                if (localValue != MY_INT) {
                    System.out.println("Got Change for MY_INT : " + MY_INT);
                    localValue = MY_INT;
                }
            }
        }
    }

    static class ChangeMaker extends Thread {
        @Override
        public void run() {
            int localValue = MY_INT;
            while (MY_INT < 5) {
                System.out.println("Incrementing MY_INT to " + (localValue + 1));
                MY_INT = ++localValue;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

