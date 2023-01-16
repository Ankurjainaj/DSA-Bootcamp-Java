package com.Ankur.LeetCode;

public class TeemoAttacking {
    //https://leetcode.com/problems/teemo-attacking/
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        System.out.println(findPoisonedDuration(arr, 2));
    }

    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        int ans = 0;
        if (timeSeries.length == 0)
            return 0;
//        for (int i = 0; i < timeSeries.length; i++) {
//            if ((i + 1) < timeSeries.length && timeSeries[i] + duration - 1 < timeSeries[i + 1]) {
//                ans += duration;
//            } else {
//                if ((i + 1) < timeSeries.length && timeSeries[i] + duration - 1 == timeSeries[i + 1])
//                    ans += duration - 1;
//                else if ((i + 1) < timeSeries.length) {
//                    ans += timeSeries[i + 1] - timeSeries[i];
//                } else
//                    ans += duration;
//            }
//        }
        // Above for loop or this for loop:
        for (int i = 0; i < timeSeries.length - 1; i++) {
            ans += Math.min(timeSeries[i + 1] - timeSeries[i], duration);
        }
        ans += duration;
        return ans;
    }
}
