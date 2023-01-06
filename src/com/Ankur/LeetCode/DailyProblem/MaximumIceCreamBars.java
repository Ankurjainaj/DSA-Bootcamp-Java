package com.Ankur.LeetCode.DailyProblem;

import java.util.Arrays;

public class MaximumIceCreamBars {
    //https://leetcode.com/problems/maximum-ice-cream-bars/
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 2, 4, 1};
        int coins = 7;
        System.out.println(maxIceCream(arr, coins));
    }

    public static int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int bars = 0;
        for (int cost : costs) {
            if (cost <= coins) {
                bars++;
                coins -= cost;
            }
        }
        return bars;
    }
}
