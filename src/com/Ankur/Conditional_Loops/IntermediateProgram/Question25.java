package com.Ankur.Conditional_Loops.IntermediateProgram;

public class Question25 {

    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 31; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println("No. of days = " + count);
    }
}
