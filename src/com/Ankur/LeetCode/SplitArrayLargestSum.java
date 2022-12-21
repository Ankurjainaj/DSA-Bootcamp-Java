package com.Ankur.LeetCode;

import java.util.Scanner;

public class SplitArrayLargestSum {
    //https://leetcode.com/problems/split-array-largest-sum/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int m = in.nextInt();
        System.out.println(splitArray(arr, m));
    }

    public static int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;
        for (int num : nums) {
            start = Math.max(start, num);
            end += num;
        }//Now start is the max value and end is the sum of all elements
        while (start < end) {
            //try for mid as the ans
            int mid = start + (end - start) / 2;
            //calculate the no. of pieces the array can be divided
            int sum = 0;
            int pieces = 1;
            for (int n : nums) {
                if (sum + n > mid) {
                    //make a new sub array as this has exceeds the possible ans
                    sum = n;
                    pieces++;
                } else
                    sum += n;
            }
            if (pieces > m)
                start = mid + 1;
            else
                end = mid;
        }
        return end;
    }
}
