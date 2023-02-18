package org.codej.rest.algorithm.재귀호출;

import com.fasterxml.jackson.annotation.JsonIgnoreType;

import java.util.Scanner;

public class Recur {
    static void recur(int n) {
        if (n>0) {
            recur(n-1);
            System.out.println(n);
            recur(n -2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        recur(sc.nextInt());
    }
}
