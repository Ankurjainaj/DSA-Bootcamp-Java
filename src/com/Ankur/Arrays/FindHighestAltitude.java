package com.Ankur.Arrays;

import java.util.Scanner;

public class FindHighestAltitude {

    //https://leetcode.com/problems/find-the-highest-altitude/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(largestAltitude(arr));
    }

    public static int largestAltitude(int[] gain) {
        int max = 0;
        for (int i = 1; i < gain.length; i++) {
            gain[i] = gain[i] + gain[i - 1];
        }
        for (int j : gain) {
            if (j > max)
                max = j;
        }
        return max;
    }
}
