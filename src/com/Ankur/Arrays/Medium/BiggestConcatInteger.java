package com.Ankur.Arrays.Medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BiggestConcatInteger {
    //https://leetcode.com/problems/largest-number
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        System.out.println(largestInt(a));
    }

    private static Comparator<String> comp = (a, b) -> (b + a).compareTo(a + b);

    public static String largestInt(int[] a) {
        String[] asStrs = new String[a.length];
        for (int i = 0; i < a.length; i++) {
            asStrs[i] = String.valueOf(a[i]);
        }

        // Sort strings according to custom comparator.
        Arrays.sort(asStrs, comp);

        // If, after being sorted, the largest number is `0`, the entire number
        // is zero.
        if (asStrs[0].equals("0")) {
            return "0";
        }
        StringBuilder largestNumberStr = new StringBuilder();
        for (String numAsStr : asStrs) {
            largestNumberStr.append(numAsStr);
        }

        return largestNumberStr.toString();
    }

}
