package com.Ankur.Searching.Easy;

import java.util.Scanner;

public class SearchInsertPosition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int target = in.nextInt();
        System.out.println(searchInsert(arr, target));
    }

    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length;
        while (start < end) {
            int m = start + (end - start) / 2;
            if (nums[m] == target)
                return m;
            if (nums[m] > target)
                end = m;
            if (nums[m] < target)
                start = m + 1;
        }
        return start;
    }
}
