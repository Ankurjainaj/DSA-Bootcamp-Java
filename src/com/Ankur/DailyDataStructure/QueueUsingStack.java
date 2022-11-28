package com.Ankur.DailyDataStructure;

import java.util.Stack;

public class QueueUsingStack {
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    static void enqueue(int a) {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        s1.push(a);
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    static int dequeue() {
        if (s1.isEmpty()) {
            System.out.println("Q is Empty");
            System.exit(0);
        }
        // Return top of s1
        int x = s1.peek();
        s1.pop();
        return x;
    }

    public static void main(String[] args) {
        QueueUsingStack q = new QueueUsingStack();
        enqueue(1);
        enqueue(2);
        enqueue(3);

        System.out.println(dequeue());
        System.out.println(dequeue());
        System.out.println(dequeue());
    }
}
