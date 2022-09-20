package com.Ankur.Algorithms.Searching;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int target = in.nextInt();
        System.out.println(linearSearch(arr, target));
    }

    //Return index if item found else return -1
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0)
            return -1;
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target)
                return index;
        }
        return -1;
    }
}
