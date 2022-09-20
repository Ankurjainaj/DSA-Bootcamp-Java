package com.Ankur;

import java.util.Scanner;

public class CustomerWealth {

    //https://leetcode.com/problems/richest-customer-wealth/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        int col = in.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
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
