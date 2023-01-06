package com.Ankur.LeetCode.DailyProblem;

import java.util.Arrays;
import java.util.Comparator;

public class MinimumArrowsToBurstBalloons {
    //https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons
    public static void main(String[] args) {
        int[][] arr = new int[][]{{10, 16}, {2, 8}, {1, 6}, {7, 12}};
        System.out.println(findMinArrowShots(arr));
    }

    public static int findMinArrowShots(int[][] points) {
        int arrows = 1;
        Arrays.sort(points, Comparator.comparingInt(a -> a[1]));
        System.out.println(Arrays.deepToString(points));
        int end = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > end) {
                arrows++;
                end = points[i][1];
            }
        }
        return arrows;
    }
}
