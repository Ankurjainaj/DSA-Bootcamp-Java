package com.Ankur;

import java.util.Scanner;
import java.util.function.Consumer;

// Java program to demonstrate lambda expressions to
// implement a user defined functional interface.
//  A functional interface is an interface that contains only one abstract method
@FunctionalInterface
interface Square {
    int calculate(int x);
}


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        /*      Replaced with lambda expression in Java 8
        Square sq = new Square() {
            @Override
            public int calculate(int x) {
                x*=x;
                return x;
            }
        };
        */
        // lambda expression to define the calculate method

        Square s = (int x) -> x * x;
        Consumer<Integer> consumer = (value) -> System.out.println(value);

        // parameter passed and return type must be
        // same as defined in the prototype
        int ans = s.calculate(a);
        System.out.println("Square value of " + a + " is: " + ans);

    }
}
