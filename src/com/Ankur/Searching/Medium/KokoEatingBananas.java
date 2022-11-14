package com.Ankur.Searching.Medium;

import java.util.Arrays;
import java.util.Scanner;

public class KokoEatingBananas {
    //https://leetcode.com/problems/koko-eating-bananas/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int h = in.nextInt();
        System.out.println(minEatingSpeed(arr, h));
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = Arrays.stream(piles).max().getAsInt();

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (!possible(mid, piles, h)) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    public static boolean possible(int k, int[] piles, int h) {
        int count = 0;
        for (int p : piles) {
            count += (p / k);

            if (p % k != 0) {
                count++;
            }
        }
        return count <= h;
    }
}
