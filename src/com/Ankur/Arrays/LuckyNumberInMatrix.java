package com.Ankur.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LuckyNumberInMatrix {
    //https://leetcode.com/problems/lucky-numbers-in-a-matrix/
    //A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(luckyNumber(arr));
    }

    static List<Integer> luckyNumber(int[][] arr) {
        List<Integer> response = new ArrayList<>();
        for (int[] value : arr) {
            int[] a = minElement(value);
            int max = value[a[1]];
            for (int[] ints : arr) {
                if (ints[a[1]] > max) {
                    max = ints[a[1]];
                }
            }
            if (max == a[0])
                response.add(a[0]);
        }
        return response;
    }

    static int[] minElement(int[] arr) {
        int min = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }
        return new int[]{min, index};
    }
}
