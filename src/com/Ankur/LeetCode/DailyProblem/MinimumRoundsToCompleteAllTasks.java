package com.Ankur.LeetCode.DailyProblem;

import java.util.HashMap;
import java.util.Map;

public class MinimumRoundsToCompleteAllTasks {
    //https://leetcode.com/problems/minimum-rounds-to-complete-all-tasks/
    public static void main(String[] args) {
        int[] arr = new int[]{2, 2, 3, 3, 2, 4, 4, 4, 4, 4};
        System.out.println(minimumRounds(arr));

    }

    public static int minimumRounds(int[] tasks) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int rounds = 0;
        for (int task : tasks) {
            map.put(task, map.getOrDefault(task, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            if (m.getValue() == 1)
                return -1;
            rounds += m.getValue() / 3;
        /*
			We can have 1 or 2 tasks remaining. We're not supposed to take task of count 1,
			but we can 'borrow' 1 from the previous
			ex. [5,5,5,5,5,5,5] -> [5,5,5][5,5,5][5]
			In this example, treat the last [5,5,5], [5] as [5,5], [5,5]
        */
            if (m.getValue() % 3 != 0)
                rounds++;
        }
        return rounds;
    }
}
