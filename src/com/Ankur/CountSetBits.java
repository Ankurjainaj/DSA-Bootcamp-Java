package com.Ankur;

import java.util.Scanner;

public class CountSetBits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();  //number
        System.out.println(Integer.toBinaryString(n));//will give binary representation of the number
        System.out.println(setBits(n));
    }

    static int setBits(int n) {
        int count = 0;
//        while (n > 0) {
//            count++;
//            n -= n & (-n);
//        }
//        OR
        while (n > 0) {
            count++;
            n = n & (n - 1);
        }
        return count;
    }
}
