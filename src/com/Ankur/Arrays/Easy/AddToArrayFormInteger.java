package com.Ankur.Arrays.Easy;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AddToArrayFormInteger {

    //https://leetcode.com/problems/add-to-array-form-of-integer/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int k = in.nextInt();
        System.out.println(addToArrayForm(arr, k));
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        LinkedList<Integer> result = new LinkedList<>();//linked list of type integer so that we can add at first position of list
        int len = num.length - 1;//length of array
        while (len >= 0 || k != 0) {
            if (len >= 0) { //
                k += num[len--]; //Directly add to digit of k
            }
            result.addFirst(k % 10);//add at first
            k /= 10;
        }
        return result;
    }


}
