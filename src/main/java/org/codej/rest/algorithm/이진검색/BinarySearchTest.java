package org.codej.rest.algorithm.이진검색;

import java.util.*;

public class BinarySearchTest {
    // 요소수가 num인 배열 arr에서 key와 일치하는 모든 요소의 인덱스를 배열 idx의 맨앞부터 순서대로 저장,
    // 일치한 요소수를 반환하는 메서드를 작성
    // 예를들어 요소수가 8일때, {1,9,2,9,4,6,7,9} 일 때 , key = 9 라면 배열 idx 에 1,3,7 을 저장하고 3을 반환
   static int[] binarySearchCount (int[] arr, int num , int key, int[] count) {

       List<Integer> list = new ArrayList<>();
       for (int i=0; i< arr.length; i++) {
           if (arr[i] == key) {
               list.add(arr[i]);
           }
       }
       return list.stream().mapToInt(i -> i).toArray();
   }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();


        System.out.printf("Arr Num : ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        int[] count = new int[num];

        for(int i=0; i<arr.length; i++) {
            arr[i] = random.nextInt(30);
        }

        System.out.println(Arrays.toString(arr));

        System.out.printf("키 값 : ");
        int key = sc.nextInt();

        int[] resultarr = binarySearchCount(arr, num, key, count);
        System.out.println("count 배열의 개수 : " +resultarr.length);
        System.out.println("Count 배열 : "+Arrays.toString(resultarr));
    }

}
