package com.Ankur;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSet {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 2};
        List<List<Integer>> ans = subSetDuplicate(arr);
        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }

    // T(n) = O(n * 2^n) = S(n)
    static List<List<Integer>> subSet(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int a : arr) {
            int size = outer.size();
            for (int i = 0; i < size; i++) {
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(a);
                outer.add(inner);
            }
        }
        return outer;
    }

    static List<List<Integer>> subSetDuplicate(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for (int j = 0; j < arr.length; j++) {
            start = 0;
            // if my current and prev element are same then:
            if (j > 0 && arr[j] == arr[j - 1])
                start = end + 1;
            end = outer.size() - 1;
            int size = outer.size();
            for (int i = start; i < size; i++) {
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(arr[j]);
                outer.add(inner);
            }
        }
        return outer;
    }
}
