package com.Ankur.Conditional_Loops.BasicProgram;

import java.util.Scanner;

import static com.Ankur.Constants.pi;

public class CurvedSurfaceAreaCylinder {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of the cylinder");
        double r = in.nextDouble();
        System.out.println("Enter the height of the cylinder");
        double h = in.nextDouble();
        double curvedSurfaceArea = 2 * pi * r * h;
        System.out.println("Curved Surface Area Of Cylinder is " + curvedSurfaceArea);
        in.close();

    }
}
