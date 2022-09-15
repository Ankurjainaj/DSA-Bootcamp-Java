package com.Ankur.Conditional_Loops.BasicProgram.Area;

import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        double length = in.nextDouble();
        System.out.print("Enter width of rectangle: ");
        double width = in.nextDouble();
        double area = length * width;
        System.out.println("Area of rectangle is " + area);
        in.close();
    }
}
