package com.Ankur.Conditional_Loops.BasicProgram;

import java.util.Scanner;

public class SurfaceAreaCube {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the side of the cube");
        double side = in.nextDouble();
        double surfaceArea = 6 * side * side;
        System.out.println("The total surface area of the cube is " + surfaceArea);
        in.close();
    }
}
