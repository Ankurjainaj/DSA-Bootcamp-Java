package com.Ankur.Flow_of_Program;

import java.util.Scanner;

public class SumOfAll {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        while (in.hasNext()) {
            String s = in.next();
            if (s.equals("x")) {
                System.out.println("Sum: " + sum);
                break;
            } else
                sum += Integer.parseInt(s);
        }
        in.close();
    }
}
