package com.Ankur.Conditional_Loops.IntermediateProgram;

import java.util.Scanner;

public class DepricationValue {

    public static void main(String[] args) {
        long amount, deppercent, year, temp;
        Scanner in = new Scanner(System.in);
        System.out.println("enter amount");
        amount = in.nextLong();
        System.out.println("enter Depreciation percentage");
        deppercent = in.nextLong();
        System.out.println("enter  number of years");
        year = in.nextLong();
        temp = amount;
        for (int i = 0; i < year; i++)
            temp = ((100 - deppercent) * temp) / 100;
        System.out.println("after depreciation = " + temp);
        in.close();
    }
}
