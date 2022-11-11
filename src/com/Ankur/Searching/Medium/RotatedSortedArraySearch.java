package com.Ankur.Searching.Medium;

import java.util.Scanner;

public class RotatedSortedArraySearch {

    //https://leetcode.com/problems/search-in-rotated-sorted-array/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int target = in.nextInt();
        System.out.println(find(arr, target));
    }

    private static int find(int[] arr, int target) {
        int pivot = findPivot(arr);
        if (pivot == -1)
            return binarySearch(arr, target, 0, arr.length - 1);
        else {
            if (arr[pivot] == target)
                return pivot;
            else {
                int first = binarySearch(arr, target, 0, pivot - 1);
                if (first != -1)
                    return first;
                return binarySearch(arr, target, pivot + 1, arr.length - 1);
            }
        }
    }

    private static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int m = start + (end - start) / 2;
            if (arr[m] == target)
                return m;
            else if (arr[m] > target)
                end = m - 1;
            else
                start = m + 1;
        }
        return -1;
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
