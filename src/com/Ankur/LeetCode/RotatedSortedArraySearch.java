package com.Ankur.LeetCode;

import java.util.Scanner;

public class RotatedSortedArraySearch {

    //https://leetcode.com/problems/search-in-rotated-sorted-array/
    //https://leetcode.com/problems/search-in-rotated-sorted-array-ii/

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int target = in.nextInt();
        System.out.println(rotatedBinarySearch(arr, target));
    }

    static boolean rotatedBinarySearch(int[] arr, int target) {
        int pivot = findPivot(arr);
        int a = 0;
        //if pivot =-1 then just do normal binary search
        if (pivot == -1)
            a = binarySearch(arr, target, 0, arr.length - 1);
        else {
            if (arr[pivot] == target)
                a = pivot;
            else {
                int firstTry = binarySearch(arr, target, 0, pivot - 1);
                if (firstTry != -1)
                    return true;
                a = binarySearch(arr, target, pivot + 1, arr.length - 1);
            }
        }
        return a != -1;
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1])
                return mid;
            if (mid > start && arr[mid] < arr[mid - 1])
                return mid - 1;
            if (arr[start] >= arr[mid]) {
                end = mid - 1;
            } else
                start = mid + 1;
        }
        return -1;
    }

    //Use this if the array contains duplicate elements
    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1])
                return mid;
            if (mid > start && arr[mid] < arr[mid - 1])
                return mid - 1;
            //if elements at the start, end and mid are duplicates then skip them
            if (arr[mid] == arr[start] && arr[end] == arr[mid]) {
                //Check if start is pivot:
                if (arr[start] > arr[(start + 1) % arr.length])
                    return start;
                start++;
                if (end - 1 >= 0 && arr[end] < arr[end - 1])
                    return end - 1;
                end--;
            }
            //left side is sorted so pivot in right side
            else if (arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end])
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid])
                end = mid - 1;
            else if (target > arr[mid])
                start = mid + 1;
            else
                return mid;
        }
        return -1;
    }
}
