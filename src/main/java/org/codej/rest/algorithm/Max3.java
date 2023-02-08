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
class Max4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int max = a;
        if (max < b) max = b;
        if (max < c) max = c;
        if (max < d) max = d;
        System.out.println(max);
    }
}
class Min3 {
    static int min3 (int a, int b, int c) {
        int min = a;
        if (min > b) min = b;
        if (min > c) min = c;
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c = 0;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        int result = min3(a, b, c);
        System.out.println(result);
    }
}
class Min4 {
    static int min4(int a, int b, int c , int d) {
        int min = a;
        if (min > b) min = b;
        if (min > c) min = c;
        if (min > d) min = d;
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,d = 0;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        int result = min4(a, b, c, d);
        System.out.println(result);


    }
}
