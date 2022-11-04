package com.Ankur;

import java.util.*;
import java.util.stream.Collectors;

public class MapModificationUsingStream {
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

        System.out.println(mapFunctionOfStream(mp));        //Make value uppercase
        System.out.println(groupedMapUsingValue(mp));       //group by value
        System.out.println(groupedMapUsingValueAndSort(mp));//group by value and sort by value
        System.out.println(sortedMapUsingValue(mp));        //Sort by value

    }

    private static Map<String, String> mapFunctionOfStream(Map<String, String> mp) {
        return mp.entrySet().stream()
                .map(entry -> new AbstractMap.SimpleEntry<>(entry.getKey(), entry.getValue().toUpperCase()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    private static Map<String, List<Map.Entry<String, String>>> groupedMapUsingValue(Map<String, String> mp) {
        return mp.entrySet().stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue));
    }

    private static Object groupedMapUsingValueAndSort(Map<String, String> mp) {
        return mp.entrySet().stream().collect(Collectors.groupingBy(Map.Entry::getValue))
                .entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> b, LinkedHashMap::new));
    }

    private static Map<String, String> sortedMapUsingValue(Map<String, String> mp) {
        return mp.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> b, LinkedHashMap::new));
    }
}
