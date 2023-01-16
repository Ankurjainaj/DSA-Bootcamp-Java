package com.Ankur.LeetCode.DailyProblem;

import java.util.HashMap;
import java.util.Map;

public class MaxPointsOnLine {

    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 1}, {2, 2}, {3, 3}};
        System.out.println(maxPoints(arr));
    }

    public static int maxPoints(int[][] points) {
        int n = points.length;
        int lines = Integer.MIN_VALUE;
        if (n == 1) return 1;
        for (int i = 0; i < n; i++) {
            int x1 = points[i][0];
            int y1 = points[i][1];
            Map<String, Integer> map = new HashMap<>();
            int repeated = 1;
            int max = Integer.MIN_VALUE;
            for (int j = i + 1; j < n; j++) {
                int x2 = points[j][0];
                int y2 = points[j][1];
                if (x1 == x2 && y1 == y2) {
                    repeated++;
                    continue;
                }
                int x = x2 - x1;
                int y = y2 - y1;
                //breaking the points
                int gcd = gcd(x, y);
                x /= gcd;
                y /= gcd;
                //to avoid negative numbers
                if ((x < 0 && y < 0) || (x > 0 && y < 0)) {
                    x *= -1;
                    y *= -1;
                }
                String k = x + "-" + y;
                map.put(k, map.getOrDefault(k, 0) + 1);
                max = Math.max(max, map.get(k));
            }
            lines = Math.max(lines, (max + repeated));
        }
        return lines;
    }

    private static int gcd(int big, int small) {
        if (small == 0) return big;
        return gcd(small, big % small);
    }
}
