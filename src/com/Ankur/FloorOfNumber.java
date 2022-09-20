package com.Ankur;

import java.util.Scanner;

public class FloorOfNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int target = in.nextInt();
        System.out.println(floor(arr, target));
    }

    static int floor(int[] arr, int target) {
        // if the target element i less than the smallest element in the array then there is no floor
        //in this case end will become -1 as itself so no need for another condition
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid])
                end = mid - 1;
            else if (target > arr[mid])
                start = mid + 1;
            else
                return mid;
        }
        return end;
    }
}
