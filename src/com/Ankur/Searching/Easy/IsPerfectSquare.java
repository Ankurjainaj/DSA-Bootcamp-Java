package com.Ankur.Searching.Easy;

import java.util.Scanner;

public class IsPerfectSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isPerfectSquare(n));
    }

    public static boolean isPerfectSquare(int num) {
        if (num == 1 || num == 4)
            return true;
        int start = 2;
        int end = num / 2;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid * mid == num)
                return true;
            if (mid > num / mid)
                end = mid;
            else
                start = mid + 1;
        }
        return false;
    }

    public boolean isPerfectSquare2(int num) {
        int i = 1;
        while (num > 0) {
            num -= i;
            i += 2;
        }
        return num == 0;
    }
}
