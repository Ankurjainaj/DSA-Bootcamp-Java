package com.Ankur.Flow_of_Program;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        if (year % 400 == 0)
            System.out.println(year + " is leap year");
        else if (year % 100 == 0)
            System.out.println(year + " is not a leap year");
        else if (year % 4 == 0)
            System.out.println(year + " is leap year");
        else
            System.out.println(year + " is not a leap year");
        in.close();
    }
}
