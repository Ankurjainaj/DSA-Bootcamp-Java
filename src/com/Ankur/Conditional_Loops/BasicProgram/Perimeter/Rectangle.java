package com.Ankur.Conditional_Loops.BasicProgram.Perimeter;

import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the lenght of rectangle: ");
        float rectLen = in.nextFloat();
        System.out.println("enter the width of rectangle: ");
        float rectWid = in.nextFloat();
        System.out.println("ans is: " + 2 * (rectLen + rectWid));
        in.close();
    }
}
