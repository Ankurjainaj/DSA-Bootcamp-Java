package com.Ankur.Conditional_Loops.BasicProgram.Volume;

import java.util.Scanner;

import static com.Ankur.Constants.pi;

public class Cone {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of the cone: ");
        double radius = in.nextDouble();
        System.out.println("Enter the height of the cone: ");
        double height = in.nextDouble();
        double volume = (pi * radius * radius) * height / 3;
        System.out.println("The volume of the cone is: " + volume);
        in.close();
    }
}
