package com.Ankur;

import java.util.Scanner;

public class SmallestLetter {
    //https://leetcode.com/problems/find-smallest-letter-greater-than-target/submissions/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char[] arr = new char[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextLine().charAt(i);
        }
        char target = in.nextLine().charAt(0);
        System.out.println(shortestChar(arr, target));
    }

    static char shortestChar(char arr[], char target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return arr[start % arr.length];

    }
}
