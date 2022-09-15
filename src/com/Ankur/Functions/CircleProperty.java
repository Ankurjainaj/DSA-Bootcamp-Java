package com.Ankur.Functions;

import java.util.Scanner;

import static com.Ankur.Constants.pi;

public class CircleProperty {
    // Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double radius = in.nextDouble();
        System.out.println("The circumference of the circle is " + calculateCircumference(radius));
        System.out.println("The area of the circle is " + calculateArea(radius));
        in.close();
    }

    public static double calculateCircumference(double radius) {
        return 2 * pi * radius;
    }

    public static double calculateArea(double radius) {
        return pi * Math.pow(radius, 2);
    }
}
