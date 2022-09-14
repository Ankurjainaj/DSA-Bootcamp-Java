package com.Ankur.First_Java;

import java.util.ArrayList;
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the two numbers to find Armstrong number between");
        int a = in.nextInt();
        int b = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = a; i <= b; i++) {
            if (isArmstrong(i))
                list.add(i);
        }
        System.out.println("Armstrong numbers between " + a + " and " + b + " is: " + list);
    }

    public static boolean isArmstrong(int n) {
        boolean isArmstrong = false;
        int cube = 0;
        int a = n;
        while (n > 0) {
            int r = n % 10;
            cube += r * r * r;
            n /= 10;
        }
        if (cube == a)
            isArmstrong = true;
        return isArmstrong;
    }

}
