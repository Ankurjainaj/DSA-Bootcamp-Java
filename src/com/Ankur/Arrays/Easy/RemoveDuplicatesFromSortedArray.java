package com.Ankur.Arrays.Easy;

import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray {

    // https://leetcode.com/problems/remove-duplicates-from-sorted-array/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(removeDuplicates(arr));
    }

    static int removeDuplicates1(int[] arr) {
        int count = 0;
        for (int i = 0, j; i < arr.length - 1; i = j) {
            j = i + 1;
            while (j < arr.length && arr[i] == arr[j]) {
                arr[j] = -200;
                j++;
            }
        }
        for (int j : arr) {
            if (j != -200)
                count++;
        }
        return count;
    }

    //Solution
    static int removeDuplicates(int[] arr) {
        int r = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[r++] = arr[i];
            }
        }
        return r;
    }

}
