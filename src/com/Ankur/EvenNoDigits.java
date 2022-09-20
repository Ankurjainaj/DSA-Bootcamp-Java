package com.Ankur;

import java.util.Scanner;

public class EvenNoDigits {
    //https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
//        System.out.println(findNumbers(arr));
        System.out.println(digits(arr));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int a : nums) {
            int c = 0;
            while (a > 0) {
                a /= 10;
                c++;
            }
            if (c % 2 == 0)
                count++;
        }
        return count;
    }

    static int digits(int[] arr) {
        int count = 0;
        for (int a : arr) {
            if (a < 0)
                a *= -1;
            int digits = (int) Math.log10(a) + 1;
            if (digits % 2 == 0)
                count++;
        }
        return count;
    }
}
