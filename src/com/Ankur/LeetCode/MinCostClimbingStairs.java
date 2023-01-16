package com.Ankur.LeetCode;

public class MinCostClimbingStairs {
    //https://leetcode.com/problems/min-cost-climbing-stairs/
    public static void main(String[] args) {
        int[] arr = new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        System.out.println(minCostClimbingStairs(arr));
    }

    public static int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length + 1];
        for (int i = 2; i < cost.length + 1; i++)
            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
        return dp[cost.length];
    }
}
