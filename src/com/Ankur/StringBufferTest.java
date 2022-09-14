package com.Ankur;

public class StringBufferTest {
    public static void main(String[] args) {
//        StringBuffer sb = new StringBuffer("Hello ");
//        sb.replace(1, 3,"Java");
//        sb.delete(1,2);
//        sb.reverse();
//        System.out.println(sb);
        StringBuffer sb=new StringBuffer();
        System.out.println(sb.capacity());//default 16
        sb.append("Hello");
        System.out.println(sb.capacity());//now 16
        sb.append("java is my favourite language");
        System.out.println(sb.capacity()); // now 34
//        sb.appendCodePoint(52);
        System.out.println(sb);
    }

}
