package com.Ankur.LeetCode;

import java.util.Scanner;

public class FirstAndLastPosition {

    //https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int target = in.nextInt();
        System.out.println(firstAndLast(arr, target));
    }

    static int[] firstAndLast(int arr[], int target) {
        int[] response = {-1, -1};
        int start = search(arr, target, true);
        int end = search(arr, target, false);
        response[0] = start;
        response[1] = end;
        return response;
    }

    static int search(int[] arr, int target, boolean startIndex) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid])
                end = mid - 1;
            else if (target > arr[mid])
                start = mid + 1;
            else {
                ans = mid;
                if (startIndex)
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        return ans;
    }
}
