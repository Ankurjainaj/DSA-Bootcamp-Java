package com.Ankur.Exercism;

public class Exercism {

    public static void main(String[] args) {
        System.out.println(transcribe("Something - I made up from thin air"));
    }

    static String transcribe(String phrase) {
        String[] words = phrase.replaceAll("\\!|\\?|\\'|\\,|\\;|\\.|\\_", "").split("\\W+");

        String acronym = "";
        for (String word : words) {
            acronym += Character.toUpperCase(word.charAt(0));
        }
        return acronym;
    }
}
