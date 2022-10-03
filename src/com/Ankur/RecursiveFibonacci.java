package com.Ankur;

import java.util.Scanner;

public class RecursiveFibonacci {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long ans = fiboWithFormula(n);
        System.out.println(ans);
    }

    static long fiboWithFormula(int n) {
        return (long) ((Math.pow(((1 + Math.sqrt(5)) / 2), n) - Math.pow(((1 - Math.sqrt(5)) / 2), n)) / Math.sqrt(5));
    }

    static int fibo(int n) {
        if (n < 2)
            return n;
        return fibo(n - 1) + fibo(n - 2);
    }
}
