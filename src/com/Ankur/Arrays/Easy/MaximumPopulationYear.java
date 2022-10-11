package com.Ankur.Arrays.Easy;

import java.util.Scanner;

public class MaximumPopulationYear {

    //https://leetcode.com/problems/maximum-population-year/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(maximumPopulation2(arr));
    }

    public static int maximumPopulation(int[][] logs) {
        int temp = 0, tempyr = 0;
        int c = 0;
        for (int[] inner : logs) {
            for (int each : inner) {
                c = 0;
                for (int[] log : logs) {
                    if (each >= log[0] && each < log[1]) {
                        c++;
                    }
                }
                if (c >= temp) {
                    if (tempyr == 0)
                        tempyr = each;
                    else if (c == temp) {
                        if (each < tempyr)
                            tempyr = each;
                    } else
                        tempyr = each;
                    temp = c;
                }
            }
        }
        return tempyr;
    }

    //O(n) solution
    public static int maximumPopulation2(int[][] logs) {
        int[] timeline = new int[101];
        int start = 101;
        int stop = 0;
        for (int[] log : logs) {
            timeline[log[0] - 1950]++;
            timeline[log[1] - 1950]--;
            start = Math.min(start, log[0] - 1950);
            stop = Math.max(stop, log[1] - 1950);
        }

        int pop = 1;
        int year = start + 1950;
        for (int i = start + 1; i <= stop; i++) {
            timeline[i] += timeline[i - 1];
            if (timeline[i] > pop) {
                pop = timeline[i];
                year = i + 1950;
            }
        }
        return year;

    }
}
