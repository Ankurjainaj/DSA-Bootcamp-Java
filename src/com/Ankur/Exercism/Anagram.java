package com.Ankur.Exercism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Anagram {

    private String ana;

    Anagram(String a) {
        this.ana = a.toLowerCase();
    }

    public List<String> match(List<String> list) {
        List<String> list1 = new ArrayList<>(Arrays.asList(ana.toLowerCase().split("")));
        Collections.sort(list1);
        ArrayList<String> str = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            List<String> myList = new ArrayList<>(Arrays.asList(list.get(i).toLowerCase().split("")));
            Collections.sort(myList);
            if (ana.equalsIgnoreCase(list.get(i))) {
                continue;
            } else if (list1.equals(myList)) {
                str.add(list.get(i));
            }
        }
        Collections.sort(str);
        return str;
    }

    public static void main(String[] args) {
        Anagram detector = new Anagram("Orchestra");
        List<String> match = detector.match(Arrays.asList("cashregister", "Carthorse", "radishes"));
        System.out.println(match);
//        .containsExactlyInAnyOrder("Carthorse");
    }
}
