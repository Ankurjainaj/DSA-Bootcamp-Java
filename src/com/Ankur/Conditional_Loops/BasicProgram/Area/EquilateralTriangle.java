package com.Ankur.Conditional_Loops.BasicProgram.Area;

import java.util.Scanner;

public class EquilateralTriangle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the side of the equilateral triangle: ");
        double side = in.nextDouble();
        double area = (Math.sqrt(3) / 4) * side * side;
        System.out.println("The area of the equilateral triangle is " + area);
        in.close();
    }
}
