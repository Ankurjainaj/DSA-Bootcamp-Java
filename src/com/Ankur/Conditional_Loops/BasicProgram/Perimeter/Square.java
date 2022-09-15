package com.Ankur.Conditional_Loops.BasicProgram.Perimeter;

import java.util.Scanner;

public class Square {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of the side of the square: ");
        double side = in.nextDouble();
        System.out.println("The perimeter of the square is " + (side * 4));
        in.close();
    }
}
