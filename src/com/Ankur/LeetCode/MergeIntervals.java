package com.Ankur.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    //https://leetcode.com/problems/merge-intervals/

    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 4}, {0, 4}, {8, 10}, {15, 18}};
        System.out.println(Arrays.deepToString(merge(arr)));
    }

    public static int[][] merge(int[][] intervals) {
        if (intervals.length <= 1)
            return intervals;
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> result = new ArrayList<>();
        int[] a = intervals[0];
        result.add(a);
        for (int[] i : intervals) {
            if (i[0] <= a[1]) // Overlapping intervals, move the end if needed
                a[1] = Math.max(a[1], i[1]);
            else {                             // Disjoint intervals, add the new interval to the list
                a = i;
                result.add(a);
            }
        }
        System.out.println(Arrays.deepToString(result.toArray(int[][]::new)));
        return result.toArray(int[][]::new);
    }
}
