package com.Ankur.LeetCode.DailyProblem;

import java.util.Arrays;

public class BestTeamNoConflicts {
    //https://leetcode.com/problems/best-team-with-no-conflicts/
    public static void main(String[] args) {

        int[] score = new int[]{4, 5, 6, 5};
        int[] age = new int[]{2, 1, 2, 1};
        System.out.println(bestTeamScore(score, age));
    }

    public static int bestTeamScore(int[] scores, int[] ages) {
        int response = 0;
        int n = scores.length;
        int[][] players = new int[n][2];
        for (int i = 0; i < n; i++) {
            players[i][0] = ages[i];
            players[i][1] = scores[i];
        }
        Arrays.sort(players, (a, b) -> {
            if (a[0] == b[0])
                return Integer.compare(b[1], a[1]);
            else
                return Integer.compare(b[0], a[0]);
        });
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            int currScore = players[i][1];
            dp[i] = currScore;
            for (int j = 0; j < i; j++) {
                if (players[j][1] >= currScore)
                    dp[i] = Math.max(dp[i], dp[j] + currScore);
            }
            response = Math.max(response, dp[i]);
        }
        return response;
    }
}
