package com.Ankur.LeetCode.DailyProblem;

public class FindtheTownJudge {
    //https://leetcode.com/problems/find-the-town-judge/

    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 3}, {2, 3}};
        System.out.println(findJudge(3, arr));
    }

    public static int findJudge(int n, int[][] trust) {
        int[] arr = new int[n + 1];
        for (int[] a : trust) {
            arr[a[0]]--;
            arr[a[1]]++;
        }
        for (int i = 1; i <= n; i++) {
            if (arr[i] == n - 1) return i;
        }
        return -1;
    }
}
