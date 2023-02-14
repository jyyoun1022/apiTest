package org.codej.rest.algorithm.이진검색;

import java.util.*;

public class BinSearch {
    static int binSearch(int[] a, int n, int key) {
        int pl = 0;
        int pr = n-1;

        do {
            int pc = (pl+pr) / 2; // 중앙여소 인덱스
            if (a[pc] == key) {
                return pc;
            } else if (a[pc] < key) {
                pl = pc + 1; //검색 범위를 뒤쪽 절반으로 좁혀준다.
            } else if (a[pc] > key) {
                pr = pc -1;
            }
        } while(pl <= pr);
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        System.out.print("요소수 : ");
        int num = sc.nextInt();
        int[] arr = new int[num];   //요소수가 num인 배열

        System.out.print("arr[0] : ");
        arr[0] = sc.nextInt();

        for(int i=1; i<arr.length; i++) {
            arr[i] = rd.nextInt(30);
        }
        //TODO: 배열을 오름차순으로 입력되게
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.print("키 값을 입력 : ");
        int key = sc.nextInt();

        int result = binSearch(arr, arr.length, key);

        if (result == -1) {
            System.out.println("키 값 없음");
        } else {
            System.out.println(result);
        }


    }
}
class ArraySortLab {
    public static void main(String[] args) {
          int[] intArr = {1,23,4,3,32,1};
          Arrays.sort(intArr);
          System.out.println(Arrays.toString(intArr));

        //Collection.reverseOrder() 는 기본타입은 안되기 때문에 boxing 해줘야하낟.
        Integer[] integerArr = Arrays.stream(intArr).boxed().toArray(value -> new Integer[value]);
        Arrays.sort(integerArr, Collections.reverseOrder());
        System.out.println(Arrays.toString(integerArr));


    }
}

