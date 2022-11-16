package com.Ankur.Exercism;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SqueakyClean {
    public static void main(String[] args) {
        String s = "[INFO]: Operation completed";
        String[] split = s.split(":");
        String s1 = split[1].replaceAll("\\r|\\t|\\n", "").trim();
        System.out.println(s1);
        String s2 = split[0].replace("[", "").replace("]", "").toLowerCase();
        System.out.println(s2);
        String s3 = s1 + " (" + s2 + ")";
        System.out.println(s3);
        System.out.println(clean("m  y-i\0dΟβιεγτFi234\uD83D\uDE00\uD83D\uDE00\uD83D\uDE00"));
    }

    static String clean(String identifier) {
        String s = identifier.replace(" ", "_").replaceAll("\\p{Cc}", "CTRL")
                .replaceAll("[α-ω]", "").replaceAll("[0-9]", "")
                .replaceAll("[\\x{0001f300}-\\x{0001f64f}]|[\\x{0001f680}-\\x{0001f6ff}]", "");
        return Pattern.compile("-(.)")
                .matcher(s)
                .replaceAll(mr -> mr.group(1).toUpperCase());
    }

    static String clean2(String identifier) {
        return toCamelCase(identifier.split(""))
                .stream()
                .filter(c -> !c.equals(""))
                .map(c -> c.equals(" ") ? "_" : c)
                .map(c -> Character.isISOControl(c.charAt(0)) ? "CTRL" : c)
                .map(c -> ((c.charAt(0) >= 'α' && c.charAt(0) <= 'ω') || (!Character.isAlphabetic(c.charAt(0)) && !c.equals("_"))) ? "" : c)
                .collect(Collectors.joining());
    }

    static List<String> toCamelCase(String[] list) {
        int[] indexes = IntStream.range(0, list.length).filter(i -> list[i].equals("-")).toArray();
        for (int i : indexes) list[i + 1] = list[i + 1].toUpperCase();
        return Arrays.stream(list).filter(c -> !c.equals("-")).collect(Collectors.toList());
    }

}
