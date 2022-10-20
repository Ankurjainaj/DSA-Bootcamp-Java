package com.Ankur;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class RandomQues {
    public static void main(String[] args) {
        Map<String, String> mp = new HashMap<>();
        mp.put("4", "Kumar");
        mp.put("5", "Kumar");
        mp.put("6", "Kumar");
        mp.put("2", "Rahul");
        mp.put("10", "Rahul");
        mp.put("3", "Amit");
        mp.put("7", "Amit");
        mp.put("8", "Amit");
        mp.put("1", "Mohan");
        mp.put("9", "Mohan");

//        System.out.println(sortByValue(mp));
    }

//    private static List<String> sortByValue(Map<String, String> mp) {
//        Stream<Map.Entry<String, String>> entriesStream = mp.entrySet().stream().sorted(Comparator.comparing());
//        Stream<String> valuesStream = mp.values().stream().sorted();
//        Stream<String> keysStream = mp.keySet().stream();
//        System.out.println(valuesStream.);
//    }
}
