package com.Ankur.Conditional_Loops.BasicProgram.Area;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the height and base length to calculate the area of triangle: ");
        double h = in.nextDouble();
        double b = in.nextDouble();
        double area = 0.5 * h * b;
        System.out.println("Area of triangle with height " + h + " and breadth " + b + " is: " + area);
        in.close();
    }
}
