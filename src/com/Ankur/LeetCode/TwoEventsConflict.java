package com.Ankur.LeetCode;

public class TwoEventsConflict {
    //https://leetcode.com/problems/determine-if-two-events-have-conflict
    public static void main(String[] args) {
        String[] a1 = {"01:15","02:00"};
        String[] b1 = {"02:00","03:00"};
        System.out.println(haveConflict(a1, b1));
    }

    public static boolean haveConflict(String[] event1, String[] event2) {
        if (event2[0].compareTo(event1[0]) > 0)
            return event1[1].compareTo(event2[0]) >= 0;
        else
            return event2[1].compareTo(event1[0]) >= 0;
    }
}
