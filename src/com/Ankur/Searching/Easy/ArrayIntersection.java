package com.Ankur.Searching.Easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ArrayIntersection {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int[] arr1 = new int[m];
        int[] arr2 = new int[n];
        for (int i = 0; i < m; i++) {
            arr1[i] = in.nextInt();
        }
        for (int j = 0; j < n; j++) {
            arr2[j] = in.nextInt();
        }
        System.out.println(Arrays.toString(intersection(arr1, arr2)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
//        Set<Integer> s1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
//        return Arrays.stream(nums2).distinct().filter(s1::contains).toArray();
        Set<Integer> set = new HashSet<>();
        Set<Integer> intersect = new HashSet<>();
        for (int j : nums1) {
            set.add(j);
        }
        for (int j : nums2) {
            if (set.contains(j)) {
                intersect.add(j);
            }
        }
        int[] result = new int[intersect.size()];
        int i = 0;
        for (Integer num : intersect) {
            result[i++] = num;
        }
        return result;
    }
}
