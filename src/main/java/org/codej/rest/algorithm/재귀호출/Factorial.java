package org.codej.rest.algorithm.재귀호출;

import java.util.Scanner;

public class Factorial {

    static int factorial(int n) {
        if (n > 0) {
            return n * factorial(n-1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("정수를 입력하세요 : ");
        int x = sc.nextInt();
        System.out.printf("x 의 팩토리얼은 "+ factorial(x) + "입니다.");
    }
}
