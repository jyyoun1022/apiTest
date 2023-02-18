package org.codej.rest.algorithm.재귀호출;

import java.util.Scanner;

public class FactorialEx {

    static int factorial(int x) {
        int result = 1;

        while(x > 1) {
            result *= x--;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(factorial(x));
    }
}
