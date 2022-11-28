package com.Ankur;

import java.util.*;

class Main {
    public static void main(String[] args) {
        //----------hashtable -------------------------
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(101, " ajay");
        ht.put(101, "Vijay");
        ht.put(102, "Ravi");
        ht.put(103, "Rahul");
        ht.compute(103, (k, v) -> k.toString());
        System.out.println("-------------Hash table--------------");
        System.out.println(ht);
        for (Map.Entry<Integer, String> m : ht.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        //----------------hashmap--------------------------------
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(100, "Amit");
        hm.put(104, "Amit");
        hm.put(101, "Vijay");
        hm.put(102, "Rahul");
        System.out.println("-----------Hash map-----------");
        System.out.println(hm);
        for (Map.Entry<Integer, String> m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        //-------------------  Queue ----------------------------
        System.out.println("----------- Queue --------------");
        Queue<Integer> q = new LinkedList<>();
        q.peek();
        q.poll();
        for (int i = 0; i < 5; i++)
            q.add(i);
        System.out.println("Elements of queue " + q);

        // To remove the head of queue.
        int removedele = q.poll();
        int removedele1 = q.remove();
        System.out.println("removed element-" + removedele);

        System.out.println(q);

        // To view the head of queue
        int head = q.peek();
        System.out.println("head of queue-" + head);

        // Rest all methods of collection interface like size and contains
        // can be used with this implementation.
        int size = q.size();
        System.out.println("Size of queue-" + size);

        //------------------- Priority Queue -------------------------
        System.out.println("----------- Priority Queue --------------");
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(1);
        pq.offer(24);
        pq.offer(12);
        pq.offer(123);
        System.out.println(pq);
        pq.add(2);
        System.out.println(pq);
        System.out.println(pq.remove());
        System.out.println(pq.peek());
        System.out.println(pq);

        //------------------- Deque -------------------------
        System.out.println("----------- Deque --------------");

        Deque<Integer> d = new ArrayDeque<>();
        d.addLast(12);
        System.out.println(d.poll());
        d.addFirst(123);
        d.addFirst(12);
        d.removeFirstOccurrence(12);
        System.out.println(d.peek());
        System.out.println(d);
    }
}