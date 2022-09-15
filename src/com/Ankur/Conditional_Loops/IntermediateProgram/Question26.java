package com.Ankur.Conditional_Loops.IntermediateProgram;

import java.util.Scanner;

public class Question26 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numbers of your liking and 0 to stop");
        int num, negSum = 0, evenSum = 0, oddSum = 0;
        while (true) {
            num = in.nextInt();
            if (num < 0)
                negSum += num;
            else {
                if (num % 2 == 0)
                    evenSum += num;
                else
                    oddSum += num;
            }
            if (num == 0) {
                System.out.println("Negative Sum " + negSum + " Even sum " + evenSum + " Odd Sum " + oddSum);
                break;
            }
        }
        in.close();
    }
}
