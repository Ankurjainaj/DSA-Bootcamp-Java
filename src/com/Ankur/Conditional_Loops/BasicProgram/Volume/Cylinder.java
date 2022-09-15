package com.Ankur.Conditional_Loops.BasicProgram.Volume;

import java.util.Scanner;

import static com.Ankur.Constants.pi;

public class Cylinder {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of the cylinder: ");
        double radius = in.nextDouble();
        System.out.println("Enter the height of the cylinder: ");
        double height = in.nextDouble();
        double volume = pi * (radius * radius) * height;
        System.out.println("The volume of the cylinder is: " + volume);
        in.close();
    }
}
