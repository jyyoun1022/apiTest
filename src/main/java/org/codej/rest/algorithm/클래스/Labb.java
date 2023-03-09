package org.codej.rest.algorithm.클래스;

public class Labb {
    public static void main(String[] args) {
        String a = "Hello";
        String b = a;
        a += " world";
        b = a;
        System.out.println(a==b);
        System.out.println(a);
        System.out.println(b);
        String c = "abc" +"cd";
        String d = "abc" + "cd";
        String e = d;
        System.out.println(c==d);
        System.out.println(c==d);

    }
}
