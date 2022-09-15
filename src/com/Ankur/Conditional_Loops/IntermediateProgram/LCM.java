package com.Ankur.Conditional_Loops.IntermediateProgram;

import java.util.Scanner;

public class LCM {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int max = Math.max(num1, num2);
        int flag = 0;

        if (num1 == 1 || num2 == 1)
            System.out.println("LCM is " + 1);
        else {
            for (int i = 2; i <= max; i++) {
                if (num1 % i == 0 && num2 % i == 0) {
                    System.out.println("LCM is " + i);
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println("LCM is " + num1 * num2);
            }
        }
        in.close();
    }
}
