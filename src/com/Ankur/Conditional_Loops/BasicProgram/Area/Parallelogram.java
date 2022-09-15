package com.Ankur.Conditional_Loops.BasicProgram.Area;

import java.util.Scanner;

public class Parallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base and height of the parallelogram : ");
        double b = in.nextDouble();
        double h = in.nextDouble();
        double area = b * h;
        System.out.println("Area of parallelogram is " + area);
        in.close();
    }
}
