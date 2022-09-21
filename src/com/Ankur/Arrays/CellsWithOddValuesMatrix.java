package com.Ankur.Arrays;

import java.util.Scanner;

public class CellsWithOddValuesMatrix {

    //https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();

        int[][] indices = new int[m][2];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < 2; j++) {
                indices[i][j] = in.nextInt();
            }
        }
        System.out.println(oddCells(m, n, indices));
    }

    public static int oddCells(int m, int n, int[][] indices) {
        int count = 0;
        int[] row = new int[m];
        int[] col = new int[n];

        for (int[] a : indices) {
            row[a[0]]++;
            col[a[1]]++;
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((row[i] + col[j]) % 2 != 0)
                    count++;
            }
        }
        return count;
    }


}
