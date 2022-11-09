package com.Ankur.Searching.Easy;

import java.util.Scanner;

public class CountNegativesInSortedMatrix {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(countNegatives(arr));
    }

    public static int countNegatives(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int r = m - 1;
        int c = 0;
        int count = 0;
        while (r >= 0 && c < n) {
            if (grid[r][c] < 0) {
                --r;
                count += n - c; // there are n - c negative numbers in current row.
            }else {
                ++c;
            }
        }
        return count;
    }



}
