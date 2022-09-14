package com.Ankur.ConsumerProducer;

class Consumer1 extends Thread {
    Producer producer;

    Consumer1(Producer p) {
        producer = p;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String message = producer.getMessage();

                // sends a reply to producer got a message
                System.out.println("Got message: " + message);
                sleep(2000);
            }
        } catch (InterruptedException e) {
        }
    }

    public static void main(String args[]) {
        Producer producer = new Producer();
        producer.start();
        new Consumer1(producer).start();
    }
}
