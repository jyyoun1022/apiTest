package org.codej.rest.algorithm.기본자료구조;

import java.util.Scanner;

public class Median {
    static int med3(int a, int b, int c) {
        if (a >= b) {
            if (b >= c) {
                return b;
            } else if (c >= a) {
                return a;
            } else {
                return c;
            }
        } else if (a > c) {
            return a;
        } else if (c > b) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c = 0;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        int result = med3(a, b, c);
        System.out.println(result);
    }
}
