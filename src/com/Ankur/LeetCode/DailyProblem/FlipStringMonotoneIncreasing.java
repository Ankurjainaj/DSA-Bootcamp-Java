package com.Ankur.LeetCode.DailyProblem;

public class FlipStringMonotoneIncreasing {
    //https://leetcode.com/problems/flip-string-to-monotone-increasing/
    public static void main(String[] args) {
        System.out.println(minFlipsMonoIncr("010110"));
    }

    //Considering a DP problem:
    //the string is 01 with oneCount=1 then came 0 at the left
    //so now two options: either flip prev oneCounter or flip the new zeroCount as the tail must be one
    //so flipCount will be the min of the two and will keep on increasing.
    public static int minFlipsMonoIncr(String s) {
        if (s.isBlank())
            return 0;
        int flipCount = 0;
        int oneCount = 0;
        for (char c : s.toCharArray()) {
            if (c == '1')
                oneCount++;
            else
                flipCount++;
            flipCount = Math.min(oneCount, flipCount);
        }
        return flipCount;
    }
}
