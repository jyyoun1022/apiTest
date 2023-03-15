package org.codej.rest.algorithm.클래스;

import java.util.Arrays;

public class arr {
    public static void main(String[] args) {
        int[] numArr =  {2, 4, 1, 0, 1, 8, 0, 7, 4, 5};
        int[] counter = new int[10]; //000000000000000
        System.out.println(Arrays.toString(counter));
        counter[numArr[0]]++;
        System.out.println(Arrays.toString(counter));

//        for (int i = 0; i < numArr.length; i++) {        // i는 0 ~ 9까지 //
//            counter[numArr[0]]++;                        // counter[2]++ => counter[2] 인덱스가 3인거를 나중에 쓸때 1더해줘.
//              counter[4]++ => counter[4] 인덱스가 5인거를 나중에 쓸때 1더해줘.
//        }
//        for (int i = 0; i < numArr.length; i++) {
//            System.out.println(i + "의 개수 :" + counter[i]);
//        }
    }   // main의 끝
}
