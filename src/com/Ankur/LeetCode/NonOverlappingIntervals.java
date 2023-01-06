package com.Ankur.LeetCode;

import java.util.Arrays;
import java.util.Comparator;

public class NonOverlappingIntervals {
    //https://leetcode.com/problems/non-overlapping-intervals/
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        System.out.println(eraseOverlapIntervals(arr));
    }

    public static int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        int response = 0;
        int prev = 0;
        for (int i = 1; i < intervals.length; i++) {

            //In case of [1,4],[3,5] or [1,4],[2,3]
            //Increment the response and update prev.
            if (intervals[i][0] < intervals[prev][1]) {
                response++;
                if (intervals[i][1] <= intervals[prev][1])
                    prev = i;
            } else // Case of [1,2],[2,3] // Do nothing
                prev = i;
        }
        return response;
    }
}
