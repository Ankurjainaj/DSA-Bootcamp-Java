package com.Ankur.Exercism;

import java.util.*;

public class ProteinTranslator {

    Map<String, String> proteinMap = new HashMap<>();

    ProteinTranslator() {
        multiPut("Methionine", "AUG");
        multiPut("Phenylalanine", "UUU", "UUC");
        multiPut("Leucine", "UUA", "UUG");
        multiPut("Serine", "UCU", "UCC", "UCA", "UCG");
        multiPut("Tyrosine", "UAU", "UAC");
        multiPut("Cysteine", "UGU", "UGC");
        multiPut("Tryptophan", "UGG");
        multiPut("STOP", "UAA", "UAG", "UGA");
    }

    String multiPut(String value, String... keys) {
        for (String key : keys) {
            proteinMap.put(key, value);
        }
        return value;
    }

    List<String> translate(String rnaSequence) {
        List<String> response = new ArrayList<>();
        String s, rna;
        for (int i = 0; i < rnaSequence.length(); i += 3) {
            s = rnaSequence.substring(i, i + 3);
            rna = proteinMap.get(s);
            if (Objects.equals(rna, "STOP"))
                return response;
            if (rna == null) throw new IllegalArgumentException("codon must be an accepted codon.");
            response.add(rna);
        }
        return response;
    }
}