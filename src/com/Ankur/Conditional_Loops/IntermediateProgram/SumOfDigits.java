package com.Ankur.Conditional_Loops.IntermediateProgram;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to find sum of digits: ");
        int n = in.nextInt();
        int sum = 0;
        while (n >= 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println("Sum of digits of the number is: " + sum);
        in.close();
    }
}
