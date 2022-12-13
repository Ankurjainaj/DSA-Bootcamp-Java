package com.Ankur.Threads;

import java.util.ArrayList;
import java.util.List;

class Geeks {
    String name = "";
    public int count = 0;

    public void geekName(String geek, List<String> list) {
        // Only one thread is permitted
        // to change geek's name at a time.
        synchronized (this) {
            name = geek;
            count++;  // how many threads change geek's name.
        }

        // All other threads are permitted
        // to add geek name into list.
        list.add(geek);
    }
}

class GFG2 {
    public static void main(String[] args) {
        Geeks gk = new Geeks();
        List<String> list = new ArrayList<>();
        gk.geekName("mohit", list);
        System.out.println(gk.name);

    }
}
