package com.Ankur.DailyDataStructure;

public class StackImpl {
    private int arr[];
    private int top;
    private int capacity;

    StackImpl(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int a) {
        if (isFull()) {
            System.out.println("Stack OverFlow");

            // terminates the program
            System.exit(1);
        }
        System.out.println("Inserting: " + a);
        arr[++top] = a;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("STACK EMPTY");
            // terminates the program
            System.exit(1);
        }
        return arr[top--];
    }

    public int getSize() {
        return top + 1;
    }

    public Boolean isEmpty() {
        return top == -1;
    }

    public Boolean isFull() {
        return top == capacity - 1;
    }

    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    public static void main(String[] args) {
        StackImpl stack = new StackImpl(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.print("Stack: ");
        stack.printStack();

        // remove element from stack
        stack.pop();
        System.out.println("\nAfter popping out");
        stack.printStack();
    }

}
