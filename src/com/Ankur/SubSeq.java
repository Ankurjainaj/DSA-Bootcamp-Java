package com.Ankur;

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
        subSeq("", "abc");
        System.out.println(subSeqReturn("", "abcd"));
    }

    static void subSeq(String p, String up) {
        if (up.isEmpty()) {
            System.out.print(p + ", ");
            return;
        }
        char ch = up.charAt(0);
        subSeq(p + ch, up.substring(1));    //Add it in the final permutation
        subSeq(p, up.substring(1));            //Ignore the character from the permutation
    }

    static ArrayList<String> subSeqReturn(String p, String up) {
        ArrayList<String> list = new ArrayList<>();
        if (up.isEmpty()) {
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subSeqReturn(p + ch, up.substring(1));    //Add it in the final permutation
        ArrayList<String> right = subSeqReturn(p, up.substring(1));            //Ignore the character from the permutation
        left.addAll(right);
        return left;
    }

    static void subseqAscii(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseqAscii(p + ch, up.substring(1));
        subseqAscii(p, up.substring(1));
        subseqAscii(p + (ch + 0), up.substring(1));
    }

    static ArrayList<String> subseqAsciiRet(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first = subseqAsciiRet(p + ch, up.substring(1));
        ArrayList<String> second = subseqAsciiRet(p, up.substring(1));
        ArrayList<String> third = subseqAsciiRet(p + (ch + 0), up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
