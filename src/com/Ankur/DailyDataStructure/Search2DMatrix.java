package com.Ankur.DailyDataStructure;

import java.util.Scanner;

public class Search2DMatrix {
    //https://leetcode.com/problems/search-a-2d-matrix/?envType=study-plan&id=data-structure-i
//Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:
//
//Integers in each row are sorted from left to right.
//The first integer of each row is greater than the last integer of the previous row.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        int target = in.nextInt();
        System.out.println(searchMatrix(arr, target));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            if (target >= matrix[i][0] && target <= matrix[i][matrix[i].length - 1]) {
                if (binarySearch(matrix[i], target))
                    return true;
            }
        }
        return false;
    }

    private static boolean binarySearch(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        int m;
        while (s <= e) {
            m = s + (e - s) / 2;
            if (arr[m] == target)
                return true;
            if (arr[m] > target)
                e = m - 1;
            else
                s = m + 1;
        }
        return false;
    }

}
