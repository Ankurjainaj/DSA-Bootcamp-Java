package com.Ankur.Conditional_Loops.BasicProgram;

import java.util.Scanner;

public class Factors {
    //Input a number and print all the factors of that number.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int num = in.nextInt();
        System.out.println("Factors of " + num + " are: ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
        in.close();
    }
}
