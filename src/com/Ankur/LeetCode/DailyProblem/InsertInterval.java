package com.Ankur.LeetCode.DailyProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class InsertInterval {
    //https://leetcode.com/problems/insert-interval/

    public static void main(String[] args) {

        int[][] arr = new int[][]{{1, 3}, {6, 9}};
        int[] ar1 = new int[]{2, 5};
        System.out.println(Arrays.deepToString(insert(arr, ar1)));
    }

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> result = new ArrayList<>();
        int i = 0;
        int start = newInterval[0];
        int end = newInterval[1];
        while (i < intervals.length && intervals[i][1] < start) {
            result.add(intervals[i++]);
        }
        while (i < intervals.length && intervals[i][0] <= end) {
            start = Math.min(start, intervals[i][0]);
            end = Math.max(end, intervals[i][1]);
            i++;
        }
        result.add(new int[]{start, end});
        while (i < intervals.length)
            result.add(intervals[i++]);
        return result.toArray(int[][]::new);
    }
}
