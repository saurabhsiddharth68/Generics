package com.blz.generics;

public class Maximum {

    public static String findMaximum(String  a, String  b, String  c) {
        String max = a;
        if (b.compareTo(a) > 0 && b.compareTo(c) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {

        System.out.println("Welcome To Generics Maximum Program");
    }
}
