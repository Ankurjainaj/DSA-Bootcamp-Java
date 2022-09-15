package com.Ankur.Conditional_Loops.BasicProgram.Volume;

import java.util.Scanner;

import static com.Ankur.Constants.pi;

public class Sphere {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of sphere");
        double radius = in.nextDouble();
        System.out.println("The volume of sphere is " + (4 * pi * radius * radius * radius) / 3);
        in.close();
    }
}
