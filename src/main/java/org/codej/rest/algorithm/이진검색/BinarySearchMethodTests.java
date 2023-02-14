package org.codej.rest.algorithm.이진검색;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BinarySearchMethodTests {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.printf("요소수 : ");
        int num = sc.nextInt();
        int[] arr = new int[num];

        for(int i=0; i<arr.length; i++) {
            arr[i] = random.nextInt(30);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.printf("검색할 값 : ");
        int key = sc.nextInt();

        int idx = Arrays.binarySearch(arr, key); // 중복되는 값이 있다면 무작위로 출력

        if (idx == -1){
            System.out.println("없어");
        } else {
            System.out.println(idx);
        }


    }
}
