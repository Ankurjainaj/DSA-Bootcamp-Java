package com.Ankur.Searching.Medium;

import java.util.Scanner;

public class ReachANumber {
    //https://leetcode.com/problems/reach-a-number/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        System.out.println(reachNumber(target));
    }

    public static int reachNumber(int target) {
        int step = 0;
        target = Math.abs(target);
        int sum = 0;
        while (sum < target) {
            step++;
            sum += step;
        }
        while ((sum - target) % 2 != 0) {
            step++;
            sum += step;
        }
        return step;
    }

}
