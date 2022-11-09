package com.Ankur;

import java.util.*;

public class CollectionFrameworkTest {
    public static void main(String[] args) {
        List<Integer> s = List.of(1, 2, 3, 4, 5, 6, 7);
        Vector<Integer> v= new Vector<>();
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        int search = stack.search(1);
        System.out.println(search);
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.empty());
        Iterator<Integer> iterator = stack.iterator();
        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
            iterator.forEachRemaining(System.out::println);
        }
    }
}
