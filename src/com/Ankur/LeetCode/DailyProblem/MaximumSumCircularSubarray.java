package com.Ankur.LeetCode.DailyProblem;

public class MaximumSumCircularSubarray {
    //https://leetcode.com/problems/maximum-sum-circular-subarray/
    public static void main(String[] args) {
        int[] arr = new int[]{5, -3, 5};
        System.out.println(maxSubarraySumCircular(arr));
    }

    public static int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;
        int currMin = 0;
        int currMax = 0;
        int maxSum = nums[0];
        int minSum = nums[0];
        for (int a : nums) {
            totalSum += a;
            currMax = Math.max(currMax + a, a);
            maxSum = Math.max(currMax, maxSum);
            currMin = Math.min(currMin + a, a);
            minSum = Math.min(currMin, minSum);
        }
        return maxSum > 0 ? Math.max(maxSum, totalSum - minSum) : maxSum;
    }
}
