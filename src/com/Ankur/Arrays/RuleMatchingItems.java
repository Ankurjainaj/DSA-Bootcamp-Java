package com.Ankur.Arrays;

import java.util.List;

public class RuleMatchingItems {

    //https://leetcode.com/problems/count-items-matching-a-rule/
    public static void main(String[] args) {
    }

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int tmp;
        if (ruleKey.equals("type"))
            tmp = 0;
        else if (ruleKey.equals("color"))
            tmp = 1;
        else
            tmp = 2;
        int count = 0;
        for (List<String> item : items)
            if (item.get(tmp).equals(ruleValue))
                count++;
        return count;
    }
}
