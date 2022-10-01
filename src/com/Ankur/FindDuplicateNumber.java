package com.Ankur;

import java.util.Scanner;

public class FindDuplicateNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(findDuplicate(arr));
    }

    public static int findDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {  //Swap with the correct index
                int tmp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = tmp;
            } else
                i++;
        }
        //Find the duplicate element
        for (int j = 0; j < arr.length - 1; j++) {
            if (arr[j] != j + 1)
                return arr[j];
        }
        return arr[arr.length - 1];
    }
}
