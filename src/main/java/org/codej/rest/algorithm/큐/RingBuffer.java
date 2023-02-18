package org.codej.rest.algorithm.큐;

import java.util.Scanner;

public class RingBuffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = 10;
        int[] arr = new int[N];

        int count = 0;
        int retry;

        System.out.println("정수를 입력하세요 :");
        do {
            System.out.printf("%d번째 정수 : ",count+1);
            arr[count++ % N] = sc.nextInt();
            System.out.printf("계속할까요? (예.1/ 아니오.0 : ");
            retry = sc.nextInt();
        } while(retry >= 1);

        int i = count - N;
        if (i < 0) {
            i = 0;
        }
        for(; i<count; i++) {
            System.out.printf("%2d번쨰의  정수 = %d\n",i+1,arr[i % N]);
        }
    }
}
