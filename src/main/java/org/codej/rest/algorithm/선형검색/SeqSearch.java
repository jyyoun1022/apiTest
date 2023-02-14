package org.codej.rest.algorithm.선형검색;

import java.util.Scanner;

public class SeqSearch {

    static int seqSearch(int[] a, int n, int key) {
        int i = 0;

        while(true) {
            if (i == n) {
                return -1; // 검색실패
            }
            if (a[i] == key) {
                return i; // 성공(인덱스를 반환)
            }
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요수수 : ");
        int num = sc.nextInt();

        int[] x = new int[num]; //요소수가 num인 배열

        for(int i=0; i<x.length; i++) {
            System.out.print("x[" +i+"] :");
            x[i] = sc.nextInt();
        }

        System.out.println("검색할 값 : ");
        int key = sc.nextInt();

        int idx = seqSearch(x, num, key);

        if (idx == -1) {
            System.out.println("그 값의 요소가 없습니다.");
        } else {
            System.out.println("인덱스는" + idx);
        }


    }
}
