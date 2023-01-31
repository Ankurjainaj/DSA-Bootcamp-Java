package com.Ankur.Exercism;

import java.util.Arrays;

public class PascalsTriangleGenerator {

    int[][] generateTriangle(int n) {
        int[][] response = new int[n][];
        if (n == 0) return new int[][]{};
        if (n == 1) return new int[][]{{1}};
        response[0] = new int[]{1};
        if (n == 2) return new int[][]{{1}, {1, 1}};
        response[1] = new int[]{1, 1};
        for (int i = 2; i < n; i++) {
            int[] a = new int[i + 1];
            a[0] = 1;
            a[i] = 1;
            for (int j = 1; j < i; j++)
                a[j] = response[i - 1][j] + response[i - 1][j - 1];
            response[i] = a;
        }
        return response;
    }

    public int[][] generateTriangle1(int level) {
        if (level < 0) {
            throw new IllegalArgumentException();
        }
        int[][] retVal = new int[level][];
        for (int i = 0; i < level; i++) {
            retVal[i] = new int[i + 1];
            retVal[i][0] = 1;
            for (int j = 1; j <= i; j++) {
                retVal[i][j] = retVal[i - 1][j - 1] + (j <= i - 1 ? retVal[i - 1][j] : 0);
            }
        }
        return retVal;
    }

    public static void main(String[] args) {
        PascalsTriangleGenerator ps = new PascalsTriangleGenerator();
        System.out.println(Arrays.deepToString(ps.generateTriangle(10)));
        System.out.println(Arrays.deepToString(ps.generateTriangle1(10)));
    }
}
