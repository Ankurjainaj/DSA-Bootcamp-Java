package com.Ankur.Arrays.Easy;

import java.util.Scanner;

public class MaximumSubArray {

    //https://leetcode.com/problems/maximum-subarray/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(maxSubArray(arr));
    }

    static int maxSubArray(int[] nums) {
//        int ans = Integer.MIN_VALUE;
//        int preMin = 0;
//        int sum = 0;
//        for (int num : arr) {
//            sum += num;
//            ans = Math.max(ans, sum - preMin);
//            preMin = Math.min(preMin, sum);
//        }
//        return ans;


        if (nums.length == 1) {
            return nums[0];
        } else {
            int cursum = 0;
            int maxsum = Integer.MIN_VALUE;
            for (int num : nums) {
                cursum = cursum + num;
                if (cursum > maxsum)
                    maxsum = cursum;
                if (cursum < 0)
                    cursum = 0;
            }
            return maxsum;
        }
    }
}
