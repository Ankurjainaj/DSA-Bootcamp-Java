package com.Ankur.Functions;

import java.util.Scanner;

public class SumOfTwo {
    // Write a program to print the sum of two numbers entered by user by defining your own method.

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = in.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = in.nextInt();
        int sum = sumOfTwo(num1, num2);
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
        in.close();
    }

    public static int sumOfTwo(int num1, int num2) {
        return (num1 + num2);
    }
}
