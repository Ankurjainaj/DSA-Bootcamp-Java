package com.Ankur.Conditional_Loops.BasicProgram.Area;

import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of one diagonal of the rhombus: ");
        double d1 = in.nextDouble();
        System.out.println("Enter the length of the other diagonal of the rhombus: ");
        double d2 = in.nextDouble();
        double area = (d1 * d2) / 2;
        System.out.println("The area of the rhombus is: " + area);
        in.close();
    }
}
