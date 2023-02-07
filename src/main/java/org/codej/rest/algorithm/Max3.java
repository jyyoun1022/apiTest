package org.codej.rest.algorithm;

import java.util.Scanner;

public class Max3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("세 정수의 최대값을 구해라");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = a;

        if (max < b)
            max = b;
        if (max < c)
            max = c;

        System.out.println(max);
    }
}
