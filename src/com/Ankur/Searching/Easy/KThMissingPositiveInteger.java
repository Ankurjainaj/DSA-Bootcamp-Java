package com.Ankur.Searching.Easy;

import java.util.Scanner;

public class KThMissingPositiveInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int target = in.nextInt();
        System.out.println(findKthPositive(arr, target));
    }

    public static int findKthPositive(int[] arr, int k) {
        int l = 0;
        int r = arr.length;
        int m;
        while (l < r) {
            m = l + (r - l) / 2;
            if (arr[m] - 1 - m < k)
                l = m + 1;
            else
                r = m;
        }
        return l + k;
    }

}
