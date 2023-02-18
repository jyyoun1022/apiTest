package org.codej.rest.algorithm.재귀호출;

import java.util.Scanner;

public class Recur2 {
    static void recur(int n) {
        if (n > 0) {
            recur(n-2);
            System.out.println(n);
            recur(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        recur(x);
    }
}
