package com.Ankur.Arrays.Medium;

import java.util.Arrays;
import java.util.Scanner;

public class SpiralMatrix2 {

    //https://leetcode.com/problems/spiral-matrix-ii/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(Arrays.deepToString(generateMatrix(n)));
    }

    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int val = 1;
        int lastRow = n - 1;
        int lastCol = n - 1;
        int firstRow = 0;
        int firstCol = 0;

        while (firstRow <= lastRow && firstCol <= lastCol) {

            for (int i = firstCol; i <= lastCol; i++) {
                matrix[firstRow][i] = val++;
            }
            firstRow++;
            for (int i = firstRow; i <= lastRow; i++) {
                matrix[i][lastCol] = val++;
            }
            lastCol--;
            if (firstRow > lastRow || firstCol > lastCol)
                break;
            for (int i = lastCol; i >= firstCol; i--) {
                matrix[lastRow][i] = val++;
            }
            lastRow--;
            for (int i = lastRow; i >= firstRow; i--) {
                matrix[i][firstCol] = val++;
            }
            firstCol++;
        }
        return matrix;
    }
}
