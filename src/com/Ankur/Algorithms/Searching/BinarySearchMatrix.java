package com.Ankur.Algorithms.Searching;

import java.util.Scanner;

public class BinarySearchMatrix {
    //Sorted in row wise and column wise manner
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        int target = in.nextInt();
        System.out.println(search(arr, target));
    }

    static int[] search(int[][] arr, int target) {
        int r = 0;
        int c = arr.length - 1;
        while (r < arr.length && c >= 0) {
            if (target == arr[r][c])
                return new int[]{r, c};
            if (arr[r][c] > target)
                c--;
            else
                r++;
        }
        return new int[]{-1, -1};
    }
}
