package com.Ankur.Conditional_Loops.BasicProgram.Perimeter;

import java.util.Scanner;

public class EquilateralTriangle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of a side of equilateral triangle: ");
        double side = in.nextDouble();
        System.out.println("The perimeter of the equilateral triangle is " + (3 * side));
        in.close();
    }
}
