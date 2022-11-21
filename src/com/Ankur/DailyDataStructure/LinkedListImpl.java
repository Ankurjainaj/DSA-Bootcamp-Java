package com.Ankur.DailyDataStructure;

public class LinkedListImpl {
    ListNode head;

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static LinkedListImpl insert(LinkedListImpl list, int data) {
        ListNode n = new ListNode(data);
        if (list.head == null) {
            list.head = n;
        } else {
            ListNode last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = n;
        }
        return list;
    }

    public static LinkedListImpl deleteNode(LinkedListImpl list, int key) {
        ListNode curr = list.head;
        ListNode prev = null;
        //If key is at the head
        if (curr != null && curr.val == key) {
            list.head = curr.next;
            System.out.println("Deleted the key from list");
            return list;
        }
        //If key is in the middle
        while (curr != null && curr.val != key) {
            prev = curr;
            curr = curr.next;
        }
        if (curr != null) {
            prev.next = curr.next;
            System.out.println("Deleted the key from the list");
        }
        //If key is not present in the list
        if (curr == null) {
            System.out.println("Key not found in the list");
        }
        return list;
    }

    public static LinkedListImpl deleteByPosition(LinkedListImpl l, int pos) {
        ListNode curr = l.head;
        ListNode prev = null;
        int counter = 0;
        //If position is at the head
        if (pos == 0 && curr != null) {
            l.head = curr.next;
            System.out.println("Deleted node from position: " + pos);
            return l;
        }
        //If position is in the middle or end
        while (curr != null) {
            if (counter == pos) {
                prev.next = curr.next;
                System.out.println("Deleted node from position: " + pos);
                break;
            } else {
                prev = curr;
                curr = curr.next;
                counter++;
            }
        }
        //If position exceeds the length of the list
        if (curr == null) {
            System.out.println("Element not found at position: " + pos);
        }
        return l;
    }

    public static void reverseLinkedList(LinkedListImpl l) {
        ListNode prev = null;
        ListNode curr = l.head;
        ListNode next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        l.head = prev;
    }

    public static ListNode reverseByRecursion(ListNode head) {
        if (head == null || head.next == null)
            return head;

        // reverse the rest list and put the first element at the end
        ListNode rest = reverseByRecursion(head.next);
        head.next.next = head;

        // tricky step -- see the diagram
        head.next = null;

        // fix the head pointer
        return rest;
    }

    //Using Floyd’s Cycle-Finding Algorithm:
    public static boolean doesCycleExist(LinkedListImpl l) {
        ListNode slow = l.head;
        ListNode fast = l.head;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }
        return false;
    }

    public static void printList(LinkedListImpl list) {
        ListNode curr = list.head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void removeDuplicatesFromSortedList(LinkedListImpl list) {
        ListNode curr = list.head;
        ListNode next = null;
        while (curr != null) {
            ListNode c = curr;
            while (c.next != null && c.val == c.next.val) {
                next = c.next;
                c = c.next;
            }
            if (next != null) {
                curr.next = next.next;
                next = null;
            }
            curr = curr.next;
        }
    }

    public static ListNode removeDuplicatesFromSortedListSlowFast(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode node = head;
        while (head.next != null) {
            if (head.val == head.next.val) {
                head.next = head.next.next;
            } else head = head.next;
        }
        return node;
    }

    public static void main(String[] args) {
        LinkedListImpl l = new LinkedListImpl();
        l = insert(l, 1);
        l = insert(l, 1);
        l = insert(l, 3);
        l = insert(l, 4);
        l = insert(l, 5);
        l = insert(l, 5);
        l = insert(l, 5);
        l = insert(l, 5);
        printList(l);
        deleteNode(l, 5);
        deleteByPosition(l, 0);
        printList(l);
        deleteNode(l, 12);
        deleteByPosition(l, 2);
        printList(l);
        deleteNode(l, 1);
        reverseLinkedList(l);
        l.head = reverseByRecursion(l.head);
        removeDuplicatesFromSortedList(l);
        l.head = removeDuplicatesFromSortedListSlowFast(l.head);
        printList(l);
    }
}
