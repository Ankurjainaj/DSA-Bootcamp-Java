package com.Ankur.Arrays.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class PlusOne {

    //https://leetcode.com/problems/plus-one/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(plusOne(arr)));
    }

    private static int[] plusOne(int[] arr) {
        int carry = 1;
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            arr[i] += carry;   // add carry in every digit
            carry = arr[i] / 10;   // update carry for next digit
            arr[i] = arr[i] % 10;   //  put remainder in the digit
            if (carry == 0)
                break;
        }
        if (carry == 1) {   // in case of carry, we need to return n+1 length array
            int[] res = new int[n + 1];
            res[0] = 1;
            // assigning values of digit in new array
            System.arraycopy(arr, 0, res, 1, n);
            return res;
        }
        return arr;
    }
}
