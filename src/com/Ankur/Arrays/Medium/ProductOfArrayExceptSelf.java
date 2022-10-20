package com.Ankur.Arrays.Medium;

import java.util.Arrays;
import java.util.Scanner;

public class ProductOfArrayExceptSelf {

    //https://leetcode.com/problems/product-of-array-except-self/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(productExceptSelf2(arr)));
    }

    public static int[] productExceptSelf(int[] nums) {
        int product = 1;
        int isZero = 0;
        for (int num : nums) {
            if (num == 0)
                isZero++;
            else
                product *= num;
        }
        for (int i = 0; i < nums.length; i++) {
            if (isZero == 0) {
                nums[i] = product / nums[i];
            } else if (isZero == 1) {
                if (nums[i] != 0)
                    nums[i] = 0;
                else
                    nums[i] = product;
            } else {
                nums[i] = 0;
            }
        }
        return nums;
    }

    //Without the use of divide operator but S(n) = O(n)
    public static int[] productExceptSelf2(int[] nums) {
        int n = nums.length;
        int left = 1;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            if (i > 0)
                left *= nums[i - 1];
            res[i] = left;
        }
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            if (i < n - 1)
                right *= nums[i + 1];
            res[i] *= right;
        }
        return res;
    }
}
