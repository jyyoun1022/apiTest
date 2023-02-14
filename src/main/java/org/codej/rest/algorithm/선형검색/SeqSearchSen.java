package org.codej.rest.algorithm.선형검색;

import java.util.Scanner;

public class SeqSearchSen {
    //보초법
    static int eqSearchSen(int[]a ,int n , int key) {
        //요수수가 n인 배열 a 에서 key와 같은 요소를 보초법으로 선형 검색합니다.

        int i = 0;
        a[n] = key; //보초를 추가
        while(true) {
            if (a[i] == key) {
                break;
            }
            i++;
        }
        return i == n ? -1 : i;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요소수 : ");
        int num = sc.nextInt();
        int[] x = new int[num +1];

        for(int i=0; i< num; i++) {
            System.out.print("x["+i+"] : ");
            x[i] = sc.nextInt();
        }

        System.out.print("검색할 값 : ");
        int key = sc.nextInt();

        int idx = eqSearchSen(x, num, key);

        if (idx == -1) {
            System.out.println("그 값의 요소가 없습니다.");
        } else {
            System.out.println(idx);
        }
    }


}
