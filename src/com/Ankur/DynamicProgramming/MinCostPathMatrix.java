package com.Ankur.DynamicProgramming;

public class MinCostPathMatrix {

    public static void main(String[] args) {
        int[][] cost = {{1, 2, 3}, {4, 8, 2}, {1, 5, 3}};
        System.out.println(minCost(cost, 2, 2));
    }

    public static int minCost(int[][] cost, int m, int n) {

        int[][] arr = new int[m + 1][n + 1];
        int i;
        int j;
        arr[0][0] = cost[0][0];
        for (i = 1; i <= m; i++)
            arr[i][0] = arr[i - 1][0] + cost[i][0];
        for (j = 1; j <= n; j++)
            arr[0][j] = arr[0][j - 1] + cost[0][j];

        for (i = 1; i <= m; i++) {
            for (j = 1; j <= n; j++) {
                arr[i][j] = Math.min(arr[i][j - 1], Math.min(arr[i - 1][j - 1], arr[i - 1][j])) + cost[i][j];
            }
        }
        return arr[m][n];
    }

}
