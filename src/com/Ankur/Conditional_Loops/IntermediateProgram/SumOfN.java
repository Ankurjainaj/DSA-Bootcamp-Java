package com.Ankur.Conditional_Loops.IntermediateProgram;

import java.util.Scanner;

public class SumOfN {

    public static void main(String[] args) {
        double sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter how many numbers: ");
        int num = in.nextInt();
        System.out.println("Please enter numbers: ");
        for (int i = 1; i <= num; i++) {
            int numbers = in.nextInt();
            sum += numbers;
        }
        System.out.println("Sum of " + num + " is :" + sum);
        in.close();
    }
}
