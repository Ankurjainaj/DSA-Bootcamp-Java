package com.Ankur.Searching.Medium;

import java.util.Scanner;

public class FindPeak {
    //https://leetcode.com/problems/find-peak-element/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(findPeakElement(arr));
    }

    public static int findPeakElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int m = start + (end - start) / 2;
            if (arr[m] > arr[m + 1])
                end = m;
            else
                start = m + 1;
        }
        return start;
    }
}
