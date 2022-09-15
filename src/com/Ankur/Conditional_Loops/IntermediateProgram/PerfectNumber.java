package com.Ankur.Conditional_Loops.IntermediateProgram;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the number: ");
        int n = in.nextInt();
        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                sum += i;
        }
        if (sum == n)
            System.out.println("the given number is Perfect number");
        else
            System.out.println("the given number is not a Perfect number");
        in.close();
    }
}
