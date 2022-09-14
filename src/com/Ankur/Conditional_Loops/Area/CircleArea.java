package com.Ankur.Conditional_Loops.Area;

import java.util.Scanner;

import static com.Ankur.Constants.pi;

public class CircleArea {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of the circle to calculate the area: ");
        double radius = in.nextDouble();
        double area = pi * radius * radius;
        System.out.println("Area of circle with radius " + radius + " is: " + area);
    }
}
