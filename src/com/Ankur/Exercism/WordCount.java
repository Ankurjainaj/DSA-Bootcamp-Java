package com.Ankur.Exercism;

import java.util.HashMap;
import java.util.Map;

class WordCount {
    public Map<String, Integer> phrase(String input) {
        input = input.replaceAll("[?@#$%^&*().;:!]", "").trim();
        Map<String, Integer> response = new HashMap<>();
        String[] split = input.split("[ \\t\\n,]");
        for (String s : split) {
            String k = s.toLowerCase().trim().replace(",", "");
            if (k.isBlank())
                continue;
            if (k.matches("('\\w+)|(\\w+')|('\\w+')"))
                k = k.replace("'", "");
            if (response.containsKey(k))
                response.put(k, response.get(k) + 1);
            else
                response.put(k, 1);
        }
        return response;
    }

    public static void main(String[] args) {
        System.out.println(new WordCount().phrase("one,two,three"));
    }
}
