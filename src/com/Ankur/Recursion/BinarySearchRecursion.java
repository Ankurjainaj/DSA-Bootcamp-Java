package com.Ankur.Recursion;

import java.util.Scanner;

public class BinarySearchRecursion {
    //https://leetcode.com/problems/binary-search/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int target = in.nextInt();
        System.out.println(search(arr, target, 0, arr.length - 1));
    }

    static int search(int[] arr, int target, int s, int e) {
        if (s > e)
            return -1;
        int m = s + (e - s) / 2;
        if (arr[m] == target)
            return m;
        else if (arr[m] > target)
            return search(arr, target, s, m - 1);
        else
            return search(arr, target, m + 1, e);
    }
}
