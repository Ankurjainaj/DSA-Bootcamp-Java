package com.Ankur.Functions;

import java.util.Scanner;

public class SumOfN {
    // Write a function that returns the sum of first n natural numbers.

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int n = in.nextInt();
        int sum = sumOfN(n);
        System.out.println("The sum of N natural numbers : " + sum);
        in.close();
    }

    public static int sumOfN(int n) {
        return n * (n + 1) / 2;
    }
}
