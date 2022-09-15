package com.Ankur.Conditional_Loops.BasicProgram;

import java.util.Scanner;

public class Question25 {
    // to find the largest number among all the number till user input 0;
    public static void main(String[] args) {
        int n, max = 0, temp;
        System.out.println("Enter the number: ");
        Scanner in = new Scanner(System.in);
        do {
            n = in.nextInt();
            temp = n;
            if (temp > max) {
                max = temp;
            }
        }
        while (n != 0);
        System.out.println(max);
        in.close();
    }
}
