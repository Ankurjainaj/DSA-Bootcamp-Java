package com.Ankur.Conditional_Loops.BasicProgram.Volume;

import java.util.Scanner;

public class Prism {

    public static void main(String[] args) {
        // volume of prism : V = Bh (B = base area, h = height)
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of the prism");
        double length = in.nextDouble();
        System.out.println("Enter the width of the prism");
        double width = in.nextDouble();
        System.out.println("Enter the height of the prism");
        double height = in.nextDouble();
        double volume = length * width * height;
        System.out.println("The volume of the prism is " + volume);
        in.close();
    }
}
