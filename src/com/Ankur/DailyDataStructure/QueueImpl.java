package com.Ankur.DailyDataStructure;

public class QueueImpl {
    private int capacity, front, rear;
    private int[] queue;

    QueueImpl(int size) {
        capacity = size;
        front = rear = 0;
        queue = new int[size];
    }

    public void enqueue(int a) {
        if (capacity == rear) {
            System.out.println("\nQueue is full\n");
            return;
        } else {
            queue[rear] = a;
            rear++;
        }
    }

    public void dequeue() {
        if (front == rear) {
            System.out.println("\nQueue is empty\n");
            return;
        } else {
            for (int i = 0; i < rear - 1; i++) {
                queue[i] = queue[i + 1];
            }
            if (rear < capacity)
                queue[rear] = 0;
            rear--;
        }
        return;
    }

    public void queueDisplay() {
        int i;
        if (front == rear) {
            System.out.printf("Queue is Empty\n");
            return;
        }
        // traverse front to rear and print elements
        for (i = front; i < rear; i++) {
            System.out.printf(" %d , ", queue[i]);
        }
        return;
    }

    public void queueFront()
    {
        if (front == rear) {
            System.out.printf("Queue is Empty\n");
            return;
        }
        System.out.printf("\nFront Element of the queue: %d", queue[front]);
        return;
    }

    public static void main(String[] args) {

    }

}
