package com.Ankur.Searching.Medium;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class FindRightInterval {
    //https://leetcode.com/problems/find-right-interval/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(Arrays.toString(findRightInterval(arr)));
    }

    public static int[] findRightInterval(int[][] intervals) {
        int[] result = new int[intervals.length];
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < intervals.length; i++) {
            map.put(intervals[i][0], i);
        }
        for (int i = 0; i < intervals.length; i++) {
            Map.Entry<Integer, Integer> m = map.ceilingEntry(intervals[i][1]);
            result[i] = (m != null) ? m.getValue() : -1;
        }
        return result;
    }
}
