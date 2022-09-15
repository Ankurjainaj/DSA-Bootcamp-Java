package com.Ankur.Conditional_Loops.BasicProgram;

import java.util.Scanner;

public class Question24 {
    //Take integer inputs till the user enters 0 and print the sum of all numbers
    public static void main(String[] args) {
        int sum = 0;
        int num;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter number: ");
        do {
            num = in.nextInt();
            sum += num;
        }
        while (num != 0);
        System.out.println("Sum = " + sum);
        in.close();
    }
}
