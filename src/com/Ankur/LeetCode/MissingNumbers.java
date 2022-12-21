package com.Ankur.LeetCode;

import java.util.Scanner;

public class MissingNumbers {

    //https://leetcode.com/problems/missing-number/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i];
            if (arr[i] == arr.length)
                i++;
            else if (arr[i] != arr[correctIndex]) {  //Swap with the correct index
                int tmp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = tmp;
            } else
                i++;
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j)
                return j;
        }
        return arr.length;
    }
}
