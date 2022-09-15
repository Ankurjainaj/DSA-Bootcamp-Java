package com.Ankur.Functions;

import java.util.Scanner;

public class Factorial {
    // Write a program to print the factorial of a number by defining a method named 'Factorial'.

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = in.nextInt();
        System.out.println("Factorial of " + num + " is " + factorial(num));
        in.close();
    }

    public static int factorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }

}
