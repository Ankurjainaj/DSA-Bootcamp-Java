package com.Ankur.DailyDataStructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalsTriangle {
    //https://leetcode.com/problems/pascals-triangle/description/?envType=study-plan&id=data-structure-i
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(generate(n));
    }

    public static List<List<Integer>> generate(int n) {
        List<List<Integer>> list = new ArrayList<>();
        if (n == 0)
            return List.of(List.of());
        else {
            list.add(List.of(1));
            if (n == 1)
                return list;
            list.add(List.of(1, 1));
            if (n == 2)
                return list;
            for (int i = 2; i < n; i++) {
                List<Integer> integers = list.get(i - 1);
                List<Integer> l1 = new ArrayList<>();
                l1.add(0, 1);
                for (int j = 1; j < i; j++) {
                    l1.add(integers.get(j) + integers.get(j - 1));
                }
                l1.add(i, 1);
                list.add(l1);
            }
        }
        return list;
    }

    public static List<List<Integer>> generate1(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> row, pre = null;
        for (int i = 0; i < numRows; i++) {
            row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(pre.get(j - 1) + pre.get(j));
                }
            }
            pre = row;
            ans.add(row);
        }
        return ans;
    }
}
