package org.codej.rest.algorithm.클래스;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayTest {
    public static void main(String[] args) {
        int[] numArr = {2, 4, 1, 0, 1, 8, 0, 7, 4, 5};
        int[] counter = new int[10];


        for (int i = 0; i < numArr.length; i++) {        // i는 0 ~ 9까지 //
            counter[numArr[i]]++;                        // counter[2]++ => counter[2] 인덱스가 3인거를 나중에 쓸때 1더해줘.
                                                        //  counter[4]++ => counter[4] 인덱스가 5인거를 나중에 쓸때 1더해줘.
        }
        // i=0일떄, counter[numArr[0]] = counter[2]++;   0 = 2;
        // i=1일떄, counter[numArr[1]] = counter[4]++;   1 = 2;
        // i=2일떄, counter[numArr[2]] = counter[1]++;   2 = 1;
        // i=3일떄, counter[numArr[3]] = counter[0]++;   3 = 0;
        // i=4일떄, counter[numArr[4]] = counter[1]++;   4 = 1;
        // i=5일떄, counter[numArr[5]] = counter[8]++;   5 = 0;
        // i=6일떄, counter[numArr[6]] = counter[0]++;   6 = 0;
        // i=7일떄, counter[numArr[7]] = counter[7]++;   7 = 0;
        // i=8일떄, counter[numArr[8]] = counter[4]++;   8 = 0;
        // i=9일떄, counter[numArr[9]] = counter[5]++;   9 = 0;
        System.out.println(Arrays.toString(counter));

//        for (int i = 0; i < numArr.length; i++) {
//            System.out.println(i + "의 개수 :" + counter[i]);
//        }
    }   // main의 끝
}
