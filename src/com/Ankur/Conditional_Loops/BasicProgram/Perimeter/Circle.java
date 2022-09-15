package com.Ankur.Conditional_Loops.BasicProgram.Perimeter;

import java.util.Scanner;

import static com.Ankur.Constants.pi;

public class Circle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of the circle to calculate the perimeter: ");
        double radius = in.nextDouble();
        double perimeter = 2 * pi * radius;
        System.out.println("Perimeter of circle with radius " + radius + " is: " + perimeter);
        in.close();
    }
}
