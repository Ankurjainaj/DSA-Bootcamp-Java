package com.Ankur.Exercism;

import java.util.Arrays;

public class RotatingCiphers {

    private int shiftKey;

    RotatingCiphers(int shiftKey) {
        this.shiftKey = shiftKey;
    }

    String rotate(String data) {
        char[] ch = data.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (Character.isLetter(ch[i])) {
                char start = Character.isUpperCase(ch[i]) ? 'A' : 'a';
                ch[i] = (char) (start + (ch[i] + shiftKey - start) % 26);
            }
        }
        return String.valueOf(ch);
    }

    public static void main(String[] args) {
        RotatingCiphers rc = new RotatingCiphers(13);
        String s = "Xiwxmrk 1 2 3 xiwxmrk";
        System.out.println(rc.rotate(s));
    }
}
