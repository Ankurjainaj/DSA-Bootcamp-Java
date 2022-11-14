package com.Ankur.Searching.Medium;

import java.util.Scanner;

public class MaxValueBoundedArray {
    //https://leetcode.com/problems/maximum-value-at-a-given-index-in-a-bounded-array/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int index = in.nextInt();
        int maxSum = in.nextInt();
        System.out.println(maxValue(n, index, maxSum));
    }

    public static int maxValue(int n, int index, int maxSum) {
        maxSum -= n;
        int left = 0, right = maxSum, mid;
        while (left < right) {
            mid = (left + right + 1) / 2;
            if (test(n, index, mid) <= maxSum)
                left = mid;
            else
                right = mid - 1;
        }
        return left + 1;
    }

    private static long test(int n, int index, int a) {
        int b = Math.max(a - index, 0);
        long res = (long) (a + b) * (a - b + 1) / 2;
        b = Math.max(a - ((n - 1) - index), 0);
        res += (long) (a + b) * (a - b + 1) / 2;
        return res - a;
    }
}
