package com.Ankur.Conditional_Loops.IntermediateProgram;

import java.util.Scanner;

public class AverageOfN {

    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        n = in.nextInt();
        float average = (float) (n + 1) / 2;
        System.out.println("Average is: " + average);
        in.close();
    }
}
