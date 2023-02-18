package org.codej.rest.algorithm.정렬;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BubbleSort {

    /** a[idx1] 와 a[idx2]의 값을 바꿉니다. */
    static void swap(int[] a,int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    /** 버블 정렬 */
    static void bubbleSort(int[] arr, int n){
        for (int i =0; i<n-1; i++){
            for (int j =n-1; j>i; j--){
                if (arr[j-1] > arr[j]){
                    swap(arr,j-1,j);
                }
            }
        }
    }

    static void bubbleSort2(int[] arr, int n) {
        for (int i=0; i>n-1; i++) {
            int exchange = 0;
            for(int j=n-1; j>i; j--) {
                if ( arr[j-1] > arr[j]) {
                    swap(arr,j-1,j);
                    exchange++;
                }
            }
            if (exchange == 0) {
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        System.out.println("버블 정렬 V1");
        System.out.printf("요소수 : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++) {
            arr[i] = ran.nextInt(30);
        }

        bubbleSort(arr,n);

        System.out.println("오름차순으로 정렬되었습니다.");

        System.out.println(Arrays.toString(arr));



    }
}
