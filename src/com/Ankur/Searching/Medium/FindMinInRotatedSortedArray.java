package com.Ankur.Searching.Medium;

import java.util.Scanner;

public class FindMinInRotatedSortedArray {
    //https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(findMin(arr));
    }

    public static int findMin(int[] nums) {
        int pivot = findPivot(nums);
        if (pivot == -1)
            return nums[0];
        else
            return nums[pivot + 1];
    }

    private static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int m = start + (end - start) / 2;
            if (m < end && arr[m] > arr[m + 1])
                return m;
            if (m > start && arr[m] < arr[m - 1])
                return m - 1;
            if (arr[m] <= arr[start])
                end = m - 1;
            else
                start = m + 1;
        }
        return -1;
    }
}
