package com.Ankur.Exercism;

import java.util.List;
import java.util.Objects;

public class BinarySearch {

    List<Integer> list;

    BinarySearch(List<Integer> list) {
        this.list = list;
    }

    int indexOf(Integer a) throws ValueNotFoundException {
        int start = 0;
        int end = list.size() - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (Objects.equals(a, list.get(mid))) return mid;
            if (list.get(mid) > a) end = mid - 1;
            else start = mid + 1;
        }
        throw new ValueNotFoundException("Value not in array");
    }
}

class ValueNotFoundException extends Exception {
    ValueNotFoundException(String message) {
        super(message);
    }
}

