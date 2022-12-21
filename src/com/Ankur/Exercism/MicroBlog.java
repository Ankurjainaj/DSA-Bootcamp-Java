package com.Ankur.Exercism;

public class MicroBlog {
    public static void main(String[] args) {
        String s = "\uD83C\uDCCE\uD83C\uDCB8\uD83C\uDCC5\uD83C\uDCCB\uD83C\uDCCD\uD83C\uDCC1\uD83C\uDCCA";
        System.out.println(s.codePoints()
                .limit(5)
                .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString());
    }
}
