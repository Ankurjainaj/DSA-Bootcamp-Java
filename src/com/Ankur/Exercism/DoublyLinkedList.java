package com.Ankur.Exercism;

public class DoublyLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int count;

    public DoublyLinkedList() {
        this.count = 0;
    }

    public void push(T newData) {
        Node<T> node;
        if (count == 0) {
            node = new Node<>(newData);
            head = node;
        } else {
            node = new Node<>(null, tail, newData);
            tail.next = node;
        }
        tail = node;
        count++;
    }

    public T pop() {
        T popData = tail.data;
        tail = tail.previous;
        count--;
        return popData;
    }

    public void unshift(T newData) {
        Node<T> node;
        if (count == 0) {
            node = new Node<>(newData);
            head = node;
            tail = node;
        } else {
            node = new Node<>(head, null, newData);
            head.previous = node;
            head = node;
        }
        count++;
    }

    public T shift() {
        T shiftData = head.data;
        head = head.next;
        count--;
        return shiftData;
    }

    private static class Node<T> {
        private Node<T> next;
        private Node<T> previous;
        private final T data;

        public Node(Node<T> next, Node<T> previous, T data) {
            this.next = next;
            this.previous = previous;
            this.data = data;
        }

        public Node(T data) {
            this(null, null, data);
        }
    }
}
