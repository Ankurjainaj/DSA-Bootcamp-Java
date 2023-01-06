package com.Ankur.LeetCode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    //https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list
    //https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list
    //https://leetcode.com/problems/middle-of-the-linked-list
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) return null;
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }
        prev.next = slow.next;
        slow.next = null;
        return head;
    }

    // O(N) time ,O(N) Space , 2 Pass
    public int pairSum(ListNode head) {
        int sum = 0;
        Deque<Integer> s = new ArrayDeque<>();
        ListNode middle = middleNode(head);
        while (middle != null) {
            s.push(middle.val);
            middle = middle.next;
        }
        while (!s.isEmpty()) {
            sum = Math.max(s.pop() + head.val, sum);
            head = head.next;
        }
        return sum;
    }

    public int pairSum2(ListNode head) {
        return break2HalfReverseThenSum(head);
    }

    private int break2HalfReverseThenSum(ListNode head) {
        //find mid, break list in two parts then reverse second part and then compute sum and find max
        ListNode firstListEnd = oneNodeBeforeMid(head);
        ListNode temp = firstListEnd.next;
        ListNode curr1 = head;
        ListNode curr2 = reverse(temp);

        int max = Integer.MIN_VALUE;
        while (curr1 != null && curr2 != null) {
            max = Math.max(curr1.val + curr2.val, max);
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        return max;
    }

    //Reverse Linked List
    private ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    private ListNode oneNodeBeforeMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = head;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        return prev;
    }
}
