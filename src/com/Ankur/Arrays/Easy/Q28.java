package com.Ankur.Arrays.Easy;

import java.util.Scanner;

public class Q28 {

    //https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] pos = new int[n];
        for (int i = 0; i < n; i++) {
            pos[i] = in.nextInt();
        }
        System.out.println(minCostToMoveChips(pos));
    }

    static int minCostToMoveChips(int[] pos) {
        int even = 0;
        for (int j : pos) {
            if (j % 2 == 0) {
                even++;
            }
        }
        return Math.min(even, pos.length - even);
    }
}
