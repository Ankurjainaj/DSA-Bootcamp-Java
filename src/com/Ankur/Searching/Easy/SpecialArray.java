package com.Ankur.Searching.Easy;

import java.util.Scanner;

public class SpecialArray {
    //https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(specialArray(arr));
    }

    //O(n) = T(n) = S(n)
    public static int specialArray(int[] nums) {
        int numOfElements = nums.length;

        // Bucket sort Time: O(N), Space: O(N)
        // Count #occurences for each number within 0 - nums.length
        // Counts[1] = #occurences of 1
        // Counts[i] = #occurences of i
        // ...
        // while counts[counts.length - 1] store the #occurences for all numbers >= counts.length - 1
        // numOfElements is the max possible answer, so no need to count #occurences for each number >= numOfElements
        int[] counts = new int[numOfElements + 1];
        for (int elem : nums) {
            if (elem >= numOfElements)
                counts[numOfElements]++;
            else
                counts[elem]++;
        }

        // Reverse order
        // Consider the index i as x, and the goal is to find when (res = current number of elements >= x) == x
        int res = 0;
        for (int i = counts.length - 1; i > 0; i--) {
            res += counts[i];
            if (res == i) {
                return i;
            } // res: (number of elements in nums that are >= x)  == i: (x)
        }

        return -1;
    }
}
