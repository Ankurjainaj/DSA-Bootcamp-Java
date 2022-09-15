package com.Ankur.Conditional_Loops.BasicProgram.Perimeter;

import java.util.Scanner;

public class Rhombus {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the side of Rhombus: ");
        float side = in.nextFloat();
        System.out.println("ans is: " + (side * 4));
        in.close();
    }
}
