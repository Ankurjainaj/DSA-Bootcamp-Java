package com.Ankur.Searching.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class FairCandySwap {
    //https://leetcode.com/problems/fair-candy-swap/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int[] arr1 = new int[m];
        int[] arr2 = new int[n];
        for (int i = 0; i < m; i++) {
            arr1[i] = in.nextInt();
        }
        for (int j = 0; j < n; j++) {
            arr2[j] = in.nextInt();
        }
//        System.out.println(Arrays.toString(fairCandySwap(arr1, arr2)));
    }

//    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
//        int sum1 = 0;
//        int sum2 = 0;
//        for (int aliceSize : aliceSizes) sum1 += aliceSize;
//        for (int bobSize : bobSizes) sum2 += bobSize;
//        int diff = Math.abs(sum1 - sum2) / 2;
//        Arrays.sort(aliceSizes);
//        Arrays.sort(bobSizes);
//        for (int i = 0; i < Math.min(aliceSizes.length, bobSizes.length); i++) {
//            if (sum1 - aliceSizes[i] + bobSizes[i] == sum2 - bobSizes[i] + aliceSizes[i])
//                return new int[]{aliceSizes[i], bobSizes[i]};
//        }
//    }
}
