package com.Ankur.Conditional_Loops.BasicProgram;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number for fibonacci series sequence: ");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        System.out.println("Fibonacci series till " + n + " is:");
        if (n == 1)
            System.out.print(a);
        else if (n == 2)
            System.out.print(a + " " + b);
        else {
            System.out.print(a + " " + b + " ");
            for (int i = 3; i <= n; i++) {
                int c = a + b;
                a = b;
                b = c;
                System.out.print(b + " ");
            }
        }
        in.close();
    }
}
