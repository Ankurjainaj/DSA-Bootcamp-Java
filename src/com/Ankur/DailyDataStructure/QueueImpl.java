package com.Ankur.DailyDataStructure;

public class QueueImpl {
    private int capacity, front, rear;
    private int[] queue;

    QueueImpl(int size) {
        capacity = size;
        front = rear = -1;
        queue = new int[size];
    }

    public void enqueue(int a) {
        if (isFull()) {
            System.out.println("\nQueue is full\n");
        } else {
            if (front == -1) {
                front = 0; //First element to be added
            }
            rear++;
            queue[rear] = a;
            System.out.println("Insert " + a);
        }
    }

    public int dequeue() {
        int element;
        if (isEmpty()) {
            System.out.println("\nQueue is empty\n");
            return -1;
        } else {
            element = queue[front];
            if (front >= rear) {
                front = -1;
                rear = -1;
            } else
                front++;
        }
        System.out.println(element + " Deleted");
        return element;
    }

    public void queueDisplay() {
        int i;
        if (isEmpty()) {
            System.out.printf("Queue is Empty\n");
        }
        // traverse front to rear and print elements
        System.out.println("\nFront index-> " + front);

        // display element of the queue
        System.out.println("Items -> ");
        for (i = front; i <= rear; i++)
            System.out.print(queue[i] + "  ");

        // display the rear of the queue
        System.out.println("\nRear index-> " + rear);
    }

    public void queueFront() {
        if (front == rear) {
            System.out.printf("Queue is Empty\n");
            return;
        }
        System.out.printf("\nFront Element of the queue: %d", queue[front]);
        return;
    }

    public boolean isFull() {
        return front == 0 && rear == capacity - 1;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public static void main(String[] args) {

        QueueImpl q = new QueueImpl(5);

        // try to delete element from the queue
        // currently queue is empty
        // so deletion is not possible
        int dequeue = q.dequeue();

        // insert elements to the queue
        for (int i = 1; i < 6; i++) {
            q.enqueue(i);
        }

        // 6th element can't be added to queue because queue is full
        q.enqueue(6);

        q.queueDisplay();

        // deQueue removes element entered first i.e. 1
        q.dequeue();

        // Now we have just 4 elements
        q.queueDisplay();
    }

}
