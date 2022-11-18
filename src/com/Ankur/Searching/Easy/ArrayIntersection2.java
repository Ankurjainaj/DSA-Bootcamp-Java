package com.Ankur.Searching.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayIntersection2 {
    //https://leetcode.com/problems/intersection-of-two-arrays-ii/
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
        System.out.println(Arrays.toString(intersect(arr1, arr2)));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length == 0) return nums1;
        if (nums2.length == 0) return nums2;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                nums1[k++] = nums2[j];
                i++;
                j++;
            }
        }
        return Arrays.copyOfRange(nums1, 0, k);
//        int[] result = new int[set.size()];
//        int k = 0;
//        for (Integer num : set) {
//            result[k++] = num;
//        }
//        return result;
    }
}
