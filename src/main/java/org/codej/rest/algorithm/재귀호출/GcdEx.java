package org.codej.rest.algorithm.재귀호출;

import java.util.Scanner;

public class GcdEx {
    static int gcd(int x, int y) {
        while(y != 0){
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(gcd(sc.nextInt(),sc.nextInt()));
    }
}
