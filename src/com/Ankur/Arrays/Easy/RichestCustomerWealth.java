package com.Ankur.Arrays.Easy;

import java.util.Scanner;

public class RichestCustomerWealth {

    //https://leetcode.com/problems/richest-customer-wealth/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c = in.nextInt();
        int[][] arr = new int[n][c];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(maximumWealth(arr));
    }

    static int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for (int[] account : accounts) {
            int sum = 0;
            for (int i : account) {
                sum += i;
            }
            if (sum > max)
                max = sum;
        }
        return max;
    }
}
