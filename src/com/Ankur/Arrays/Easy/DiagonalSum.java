package com.Ankur.Arrays.Easy;

import java.util.Scanner;

public class DiagonalSum {
    //https://leetcode.com/problems/matrix-diagonal-sum/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(diagonalSum(arr));
    }

    public static int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        if (n == 1)
            return mat[0][0];

        for (int i = 0; i < n; i++) {
            sum = sum + mat[i][i]; //give sum of left diagonal
            sum = sum + mat[i][n - i - 1]; // give sum of right diagonal
        }

        if (n % 2 != 0) {
            sum -= mat[n / 2][n / 2];
        }
        return sum;
    }
}
