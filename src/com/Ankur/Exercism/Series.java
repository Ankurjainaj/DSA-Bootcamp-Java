package com.Ankur.Exercism;

import java.util.ArrayList;
import java.util.List;

class Series {

    String seq;

    Series(String string) {
        seq = string;
    }

    List<String> slices(int num) {
        List<String> response = new ArrayList<>();
        if (num > seq.length())
            throw new IllegalArgumentException("Slice size is too big.");
        if (num <= 0)
            throw new IllegalArgumentException("Slice size is too small.");
        for (int i = 0; i < seq.length() - num + 1; i++) {
            response.add(seq.substring(i, i + num));
        }
        return response;
    }

    public static void main(String[] args) {
        Series s = new Series("918493904243");
        System.out.println(s.slices(5));
    }
}
