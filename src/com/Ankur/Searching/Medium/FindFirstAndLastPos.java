package com.Ankur.Searching.Medium;

import java.util.Arrays;
import java.util.Scanner;

public class FindFirstAndLastPos {
    //https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int target = in.nextInt();
        System.out.println(Arrays.toString(searchRange(arr, target)));
    }

    public static int[] searchRange(int[] arr, int target) {
        int[] response = new int[]{-1, -1};
        int start = search(arr, target, true);
        int end = search(arr, target, false);
        response[0] = start;
        response[1] = end;
        return response;
    }

    public static int search(int[] arr, int target, boolean startIndex) {
        int start = 0;
        int ans = -1;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target)
                end = mid - 1;
            else if (arr[mid] < target)
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
