package com.Ankur.LeetCode;

import java.util.Scanner;

public class PeakOfMountainArray {
    //https://leetcode.com/problems/peak-index-in-a-mountain-array/
    //https://leetcode.com/problems/find-peak-element/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(mountainArray(arr));
    }

    public static int mountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) //In decreasing part of array so it may be the ans but look before it also
                end = mid;
            else //In increasing part of array so look after this
                start = mid + 1;
        }
        //In the end start==end and will be pointing to the largest element as they are finding the largest element in the array.
        return start;
    }

}
