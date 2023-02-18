package org.codej.rest.algorithm.재귀호출;

import java.util.Scanner;

public class GCD_FOR_ARRAY {

    static int gcd(int x, int y) {
        while(y != 0) {
            int temp =y;
            y = x % y;
            x = temp;
        }
        return (x);
    }

    static int gcdArray(int[] x,int start, int no) {
        if (no == 1) {
            return x[start];
        } else if(no == 2) {
            return gcd(x[start],x[start + 1]);
        } else {
            return gcd(x[start],gcdArray(x,start+1,no-1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num ;
        do {
            num = sc.nextInt();
        }while (num <= 1);

        int[] x = new int[num];

        for(int i=0; i<num; i++) {
            System.out.printf("x["+i+"] : ");
            x[i] = sc.nextInt();
        }
        System.out.println(gcdArray(x,0,num));

    }
}
