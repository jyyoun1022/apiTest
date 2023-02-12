package org.codej.rest.algorithm;

import java.util.Random;
import java.util.Scanner;

public class Chapter2_7 {

    static boolean equals(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }

        for(int i=0; i<a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.print("배열 a의 요소 수 : ");
        int na = sc.nextInt();
        int[] a = new int[na];

        for(int i=0; i<na; i++) {
            System.out.print("a[" + i + "] : ");
            a[i] = random.nextInt(50);
        }

        System.out.print("\n배열 b의 요소 수 : ");
        int nb = sc.nextInt();
        int[] b = new int[nb];

        for(int i=0; i<na; i++) {
            System.out.print("b[" + i + "] : ");
            b[i] = random.nextInt(50);
        }

        boolean result = equals(a, b);
        System.out.println("\n"+result);
    }
}
