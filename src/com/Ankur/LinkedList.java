package com.Ankur;

public class LinkedList {
    Node head;

    class Node {
        private int data;
        private Node next;

        Node(int s) {
            data = s;
            next = null;
        }
    }

    public void push(int d) {
        Node newNode = new Node(d);
        newNode.next = head;
        head = newNode;
    }

    public void insertAfter(Node n, int d) {
        if (n == null) {
            System.out.println("The given previous node cannot be null");
            return;
        }
        Node newNode = new Node(d);
        newNode.next = n.next;
        n.next = newNode;
    }

    public void append(int n) {
        Node newNode = new Node(n);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = null;
        Node last = head;
        while (last.next != null)
            last = last.next;
        last.next = newNode;
        return;
    }

    public void deleteNode(int key) {
        Node tmp = head;
        Node prev = null;
        if (head == null) {
            System.out.println("The given list is empty");
            return;
        }
        if (tmp.data == key) {
            head = tmp.next;
            return;
        }
        while (tmp != null && tmp.data != key) {
            prev = tmp;
            tmp = tmp.next;
        }
        if (tmp == null)
            return;
        prev.next = tmp.next;

    }

    public void printList() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    /* Returns count of nodes in linked list */
    public int getCount() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        llist.append(6);
        llist.push(7);
        llist.push(1);
        llist.append(4);
        llist.insertAfter(llist.head.next, 8);
        System.out.println("\nCreated Linked list is: ");
        llist.printList();
        llist.deleteNode(1); // Delete node with data 1

        System.out.println(
                "\nLinked List after Deletion of 1:");
        llist.printList();
    }
}


