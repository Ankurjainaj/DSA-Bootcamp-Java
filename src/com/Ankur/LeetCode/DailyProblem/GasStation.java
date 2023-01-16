package com.Ankur.LeetCode.DailyProblem;

public class GasStation {
    //https://leetcode.com/problems/gas-station/description/
    public static void main(String[] args) {
        int[] gas = new int[]{1, 2, 3, 4, 5};
        int[] cost = new int[]{3, 4, 5, 1, 2};
        System.out.println(canCompleteCircuit(gas, cost));
    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int sum = 0;
        int n = gas.length;
        for (int i = 0; i < n; i++) {
            sum += gas[i] - cost[i];
        }
        if (sum < 0) return -1;
        int gasInTank = 0;
        int start = 0;
        for (int j = 0; j < n; j++) {
            gasInTank += gas[j] - cost[j];
            if (gasInTank < 0) {
                start = j + 1;
                gasInTank = 0;
            }
        }
        return start;
    }
}
