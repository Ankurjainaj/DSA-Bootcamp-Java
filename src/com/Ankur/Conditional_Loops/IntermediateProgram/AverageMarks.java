package com.Ankur.Conditional_Loops.IntermediateProgram;

import java.util.Scanner;

public class AverageMarks {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your marks, terminate be inputting -1: ");
        double marks = in.nextDouble();
        double sum = 0;
        int num = 0;
        while (marks != -1) {
            sum += marks;
            num++;
            marks = in.nextDouble();
        }
        double average = sum / num;
        System.out.println("Average: " + average);
    }
}
