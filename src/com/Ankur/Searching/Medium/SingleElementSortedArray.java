package com.Ankur.Searching.Medium;

import java.util.Scanner;

public class SingleElementSortedArray {
    //https://leetcode.com/problems/single-element-in-a-sorted-array/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(singleNonDuplicate(arr));
    }

    public static int singleNonDuplicate(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int m = start + (end - start) / 2;
            if ((m + 1 < arr.length) && arr[m] == arr[m + 1]) {
                if ((arr.length - m) % 2 == 0)
                    end = m - 1;
                else
                    start = m + 1;
            } else if ((m - 1 >= 0) && arr[m] == arr[m - 1]) {
                if ((m - 1) % 2 == 0)
                    start = m + 1;
                else
                    end = m - 1;
            } else
                return arr[m];
        }
        return -1;
    }

}
