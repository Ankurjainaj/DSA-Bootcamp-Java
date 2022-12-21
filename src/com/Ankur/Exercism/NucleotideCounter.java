package com.Ankur.Exercism;

import java.util.HashMap;
import java.util.Map;

public class NucleotideCounter {

    String n;
    Map<Character, Integer> map = new HashMap<>();

    public NucleotideCounter(String n) {
        if (!n.isBlank() && !n.matches("[ACGT]+"))
            throw new IllegalArgumentException();
        this.n = n;
        map.put('A', 0);
        map.put('C', 0);
        map.put('G', 0);
        map.put('T', 0);
    }

    public Map<Character, Integer> nucleotideCounts() {
        if (n.isBlank())
            return map;
        for (int i = 0; i < n.length(); i++) {
            map.put(n.charAt(i), map.get(n.charAt(i)) + 1);
        }
        return map;
    }

    public static void main(String[] args) {
        NucleotideCounter n = new NucleotideCounter("");
        System.out.println(n.nucleotideCounts());
    }
}
