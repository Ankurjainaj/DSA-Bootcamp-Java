package com.Ankur.Conditional_Loops.BasicProgram.Area;

import java.util.Scanner;

public class IsoscelesTriangle {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of same sided: ");
        double side = in.nextDouble();
        System.out.println("Enter the length of base: ");
        double base = in.nextDouble();
        double area = (base / 4) * Math.sqrt((4 * side * side) - (base * base));
        System.out.println("The area of Isosceles Triangle is: " + area);
        in.close();
    }
}
