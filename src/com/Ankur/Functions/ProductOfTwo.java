package com.Ankur.Functions;

import java.util.Scanner;

public class ProductOfTwo {
    // Define a method that returns the product of two numbers entered by user.

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = in.nextInt();
        System.out.print("Enter second number: ");
        int b = in.nextInt();
        System.out.println("The product of " + a + " and " + b + " is " + product(a, b));
        in.close();
    }

    public static int product(int a, int b) {
        return a * b;
    }
}
