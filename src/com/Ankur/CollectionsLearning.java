package com.Ankur;

import java.util.*;

public class CollectionsLearning {
    public static void main(String[] args) {
        List<Integer> emptyList = Collections.EMPTY_LIST;
        System.out.println(emptyList);
        Deque<Integer> deq = new ArrayDeque<>();
        Queue<Integer> integers = Collections.asLifoQueue(deq);
        List<Integer> copy = new ArrayList<>();
        Collections.copy(copy, emptyList);
        Enumeration<Integer> en = Collections.enumeration(emptyList);
        Collections.fill(copy, 1);
        int frequency = Collections.frequency(copy, 1);
        try {
            // creating object of LinkedList
            List<Integer> list = new ArrayList<>();
            list.add(-1);
            list.add(4);
            list.add(-5);
            list.add(1);
            Collections.swap(list, 2,3);
            int i = Collections.binarySearch(list, 3);
            Collections.shuffle(list);
            // printing the max value
            // using max() method
            System.out.println("Max value is: " + Collections.min(list));
        } catch (ClassCastException | NoSuchElementException e) {
            System.out.println("Exception thrown : " + e);
        }

        AbstractList<Integer> absList= new ArrayList<>();
        absList.size();

    }
}
