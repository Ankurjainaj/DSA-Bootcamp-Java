package com.Ankur.DynamicProgramming;

public class LongestCommonSubstring {

// Java program to memoize
// recursive implementation of LCS problem

    public static int[][] arr = new int[1000][1000];

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                arr[i][j] = -1;
            }
        }
        String X = "AGGTAB";
        String Y = "GXTXAYB";
        int m = X.length();
        int n = Y.length();
        System.out.println("Length of LCS is " + lcs(X, Y, m, n));
    }

    public static int lcs(String X, String Y, int m, int n) {
        if (n == 0 || m == 0)
            return 0;
        if (arr[m - 1][n - 1] != -1)
            return arr[m - 1][n - 1];
        // if equal, then we store the value of the function call
        if (X.charAt(m - 1) == Y.charAt(n - 1))
            // store it in arr to avoid further repetitive
            // work in future function calls
            arr[m - 1][n - 1] = 1 + lcs(X, Y, m - 1, n - 1);
        else
            arr[m - 1][n - 1] = Math.max(lcs(X, Y, m, n - 1), lcs(X, Y, m - 1, n));

        return arr[m - 1][n - 1];
    }
}
