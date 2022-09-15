package com.Ankur.Conditional_Loops.BasicProgram.Volume;

import java.util.Scanner;

public class Pyramid {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the height of the pyramid: ");
        double height = in.nextInt();
        System.out.println("Enter the width of the pyramid: ");
        double width = in.nextInt();
        System.out.println("Enter the length of the pyramid: ");
        double length = in.nextInt();
        double volume = (height * width * length) / 3;
        System.out.println("The volume of the pyramid is: " + volume);
        in.close();
    }
}
