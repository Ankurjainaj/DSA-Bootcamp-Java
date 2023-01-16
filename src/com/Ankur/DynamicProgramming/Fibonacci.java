package com.Ankur.DynamicProgramming;

public class Fibonacci {

    static int[] terms = new int[1000];

    public static void main(String[] args) {
        System.out.println(fib(20));
    }

    public static int fib(int n) {
        if (n <= 1)
            return n;
        if (terms[n] != 0) {
        } else {
            terms[n] = fib(n - 1) + fib(n - 2);
        }
        return terms[n];
    }
}
