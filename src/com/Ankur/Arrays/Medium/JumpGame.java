package com.Ankur.Arrays.Medium;

import java.util.Scanner;

public class JumpGame {

    //https://leetcode.com/problems/jump-game/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(jumpGame(arr));
    }

    static boolean jumpGame(int[] arr) {
        int m = arr.length - 1;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (i + arr[i] >= m)
                m = i;
        }
        return m == 0;
    }
}
