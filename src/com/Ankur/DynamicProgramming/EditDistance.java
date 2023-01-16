package com.Ankur.DynamicProgramming;

public class EditDistance {
    public static void main(String[] args) {
        String str1 = "sunday";
        String str2 = "saturday";

        System.out.println(editDistDP(str1, str2, str1.length(), str2.length()));
        System.out.println(EditDistDP(str1, str2));
    }

    private static int editDist(String str1, String str2, int m, int n) {
        if (m == 0)
            return n;
        if (n == 0)
            return m;

        // If last characters of two strings are same,
        // nothing much to do. Ignore last characters and get count for remaining strings.
        if (str1.charAt(m - 1) == str2.charAt(n - 1))
            return editDist(str1, str2, m - 1, n - 1);

        // If last characters are not same, consider all three operations on last character of first
        // string, recursively compute minimum cost for all three operations and take minimum of three values.
        return 1 + Math.min(editDist(str1, str2, m - 1, n), Math.min(editDist(str1, str2, m, n - 1), editDist(str1, str2, m - 1, n - 1)));
        //Remove, Insert, Replace
    }

    private static int editDistDP(String str1, String str2, int m, int n) {
        // Create a table to store results of subproblems
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                // If first string is empty, only option is to insert all characters of second string
                if (i == 0)
                    dp[i][j] = j;

                    // If second string is empty, only option is to insert all characters of first string
                else if (j == 0)
                    dp[i][j] = i;

                    // If last characters are same, ignore last char and recur for remaining string
                else if (str1.charAt(i - 1) == str2.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1];

                else dp[i][j] = 1 + Math.min(dp[i][j - 1], Math.min(dp[i - 1][j], dp[i - 1][j - 1]));
            }
        }
        return dp[m][n];
    }

    // A Space efficient Dynamic Programming program
    static int EditDistDP(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();

        // Create a DP array to memoize result of previous computations
        int[][] DP = new int[2][len1 + 1];


        // Base condition when second String is empty then we remove all characters
        for (int i = 0; i <= len1; i++)
            DP[0][i] = i;

        // Start filling the DP
        // This loop run for every character in second String
        for (int i = 1; i <= len2; i++) {

            // This loop compares the char from second String with first String characters
            for (int j = 0; j <= len1; j++) {

                // if first String is empty then we have to perform add character operation to get second String
                if (j == 0)
                    DP[i % 2][j] = i;

                    // if character from both String is same then we do not perform any
                    // operation . here i % 2 is for bound the row number.
                else if (str1.charAt(j - 1) == str2.charAt(i - 1)) {
                    DP[i % 2][j] = DP[(i - 1) % 2][j - 1];
                }

                // if character from both String is not same then we take the minimum
                // from three specified operation
                else {
                    DP[i % 2][j] = 1 + Math.min(DP[(i - 1) % 2][j],
                            Math.min(DP[i % 2][j - 1],
                                    DP[(i - 1) % 2][j - 1]));
                }
            }
        }

        // after complete fill the DP array if the len2 is even then we end
        // up in the 0th row else we end up in the 1th row so we take len2 % 2
        // to get row
        return (DP[len2 % 2][len1]);
    }


}
