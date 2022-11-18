package com.Ankur;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

class Main {
    public static void main(String[] args) {
        //----------hashtable -------------------------
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(101, " ajay");
        ht.put(101, "Vijay");
        ht.put(102, "Ravi");
        ht.put(103, "Rahul");
        ht.compute(103, (k, v) -> k.toString());
        System.out.println("-------------Hash table--------------");
        System.out.println(ht);
        for (Map.Entry<Integer, String> m : ht.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        //----------------hashmap--------------------------------
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(100, "Amit");
        hm.put(104, "Amit");
        hm.put(101, "Vijay");
        hm.put(102, "Rahul");
        System.out.println("-----------Hash map-----------");
        System.out.println(hm);
        for (Map.Entry<Integer, String> m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}