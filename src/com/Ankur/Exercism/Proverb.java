package com.Ankur.Exercism;

public class Proverb {
    private String[] list;

    Proverb(String[] words) {
        list = words;
    }

    static String first = "For want of a ";
    static String second = " was lost.\n";
    static String third = "And all for the want of a ";

    String recite() {
        StringBuilder response = new StringBuilder();
        if (list.length == 0)
            return "";
        if (list.length == 1)
            return third + list[0] + ".";
        else {
            for (int i = 0; i < list.length - 1; i++) {
                response.append(first).append(list[i]).append(" the ").append(list[i + 1]).append(second);
            }
            response.append(third).append(list[0]).append(".");
        }
        return response.toString();
    }

    public static void main(String[] args) {
        String[] words  = new String[]{"nail", "shoe", "horse"};
        System.out.println(new Proverb(words).recite());
    }

}
