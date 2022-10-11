package com.Ankur.Arrays.Medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpiralMatrix {

    //https://leetcode.com/problems/spiral-arrrix/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(spiral(arr));
    }

    static List<Integer> spiral(int[][] arr) {
        List<Integer> list = new ArrayList<>();

        int top = 0;
        int bottom = arr.length - 1;
        int left = 0;
        int right = arr[0].length - 1;
        int target = arr.length * arr[0].length;
        int count = 0;

        while (top <= bottom || left <= right) {
            for (int i = left; i <= right && count < target; i++) {
                list.add(arr[top][i]);
                count++;
            }
            top++;

            for (int j = top; j <= bottom && count < target; j++) {
                list.add(arr[j][right]);
                count++;
            }
            right--;

            for (int k = right; k >= left && count < target; k--) {
                list.add(arr[bottom][k]);
                count++;
            }
            bottom--;

            for (int l = bottom; l >= top && count < target; l--) {
                list.add(arr[l][left]);
                count++;
            }
            left++;
        }
        return list;
    }
}
