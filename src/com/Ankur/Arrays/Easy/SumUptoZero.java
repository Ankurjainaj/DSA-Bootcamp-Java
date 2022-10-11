package com.Ankur.Arrays.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class SumUptoZero {

    //https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(Arrays.toString(sumUptoZero(n)));
    }

    static int[] sumUptoZero(int n) {
        if (n == 1)
            return new int[]{0};
        int[] response = new int[n];
        for (int i = 0; i < n / 2; i++) {
            response[i] = i + 1;
            response[n - i - 1] = -response[i];
        }
        if (n % 2 != 0)
            response[n / 2] = 0;
        return response;
    }
}
