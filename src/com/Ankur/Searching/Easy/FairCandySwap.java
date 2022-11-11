package com.Ankur.Searching.Easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.stream.IntStream;

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
        System.out.println(Arrays.toString(fairCandySwap(arr1, arr2)));
    }

    public static int[] fairCandySwap(int[] A, int[] B) {
//        int sum1 = 0;
//        int sum2 = 0;
//        for (int aliceSize : aliceSizes) sum1 += aliceSize;
//        for (int bobSize : bobSizes) sum2 += bobSize;
//        int diff = (sum1 - sum2) / 2;
//        Set<Integer> s1 = Arrays.stream(aliceSizes).boxed().collect(Collectors.toSet());
//        Set<Integer> s2 = Arrays.stream(bobSizes).boxed().collect(Collectors.toSet());
//        for (Integer i : s1) {
//            if (s2.contains(i - diff))
//                return new int[]{i, i - diff};
//        }
//        return null;

        int dif = (IntStream.of(A).sum() - IntStream.of(B).sum()) / 2;
        HashSet<Integer> S = new HashSet<>();
        for (int a : A) S.add(a);
        for (int b : B) if (S.contains(b + dif)) return new int[]{b + dif, b};
        return new int[0];
    }
}
