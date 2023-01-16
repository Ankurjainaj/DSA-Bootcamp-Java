package com.Ankur.DynamicProgramming;

import java.util.Arrays;

public class CuttingARod {

    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 9, 10, 17, 17, 20};
        int size = arr.length;
        int[][] dp = new int[size][size + 1];
        for (int i = 0; i < size; i++) {
            Arrays.fill(dp[i], -1);
        }
        System.out.println("Maximum Obtainable Value is " + cutRod(arr, size - 1, size));
        System.out.println("Maximum Obtainable Value is " + cutRodDP(arr, size - 1, size, dp));
        System.out.println("Maximum Obtainable Value is " + cutRod(arr, size));
    }

    private static int cutRod(int[] arr, int i, int n) {
        if (i == 0)
            return n * arr[i];

        // At any index we have 2 options either
        // cut the rod of this length or not cut it
        int notCut = cutRod(arr, i - 1, n);
        int cut = Integer.MIN_VALUE;
        int rodLength = i + 1;
        if (rodLength <= n)
            cut = arr[i] + cutRod(arr, i, n - rodLength);
        return Math.max(cut, notCut);
    }

    private static int cutRodDP(int[] prices, int i, int n, int[][] dp) {
        if (i == 0)
            return prices[i] * n;
        if (dp[i][n] != -1)
            return dp[i][n];

        // At any index we have 2 options either
        // cut the rod of this length or not cut it
        int notCut = cutRodDP(prices, i - 1, n, dp);
        int cut = Integer.MIN_VALUE;
        int rodLength = i + 1;
        if (rodLength <= n) {
            cut = prices[i] + cutRodDP(prices, i, n - rodLength, dp);
        }
        return dp[i][n] = Math.max(cut, notCut);
    }

    /* Returns the best obtainable price for a rod of
       length n and price[] as prices of different pieces */
    static int cutRod(int[] price, int n) {
        int[] val = new int[n + 1];
        val[0] = 0;

        // Build the table val[] in bottom up manner and return
        // the last entry from the table
        for (int i = 1; i <= n; i++) {
            int maxVal = Integer.MIN_VALUE;
            for (int j = 0; j < i; j++)
                maxVal = Math.max(maxVal, price[j] + val[i - j - 1]);
            val[i] = maxVal;
        }
        return val[n];
    }
}
