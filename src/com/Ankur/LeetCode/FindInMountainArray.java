package com.Ankur.LeetCode;

import java.util.Scanner;

public class FindInMountainArray {

    // https://leetcode.com/problems/find-in-mountain-array/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int target = in.nextInt();
        System.out.println(mountainArraySearch(arr, target));
    }

    public static int mountainArraySearch(int[] arr, int target) {
        int peak = peakInMountainArray(arr);
        if (arr[peak] == target)
            return peak;
        else {
            int firstTry = orderAgnosticSearch(arr, target, 0, peak - 1);//Search in the first half of the array
            if (firstTry == -1) {
                return orderAgnosticSearch(arr, target, peak + 1, arr.length - 1);//Search in the second half of the array
            } else return firstTry;
        }
    }

    public static int peakInMountainArray(int[] arr) {
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

    static int orderAgnosticSearch(int[] arr, int target, int start, int end) {
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target)
                return mid;
            if (isAsc) {
                if (target < arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            } else {
                if (target < arr[mid])
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }
        return -1;
    }

}
