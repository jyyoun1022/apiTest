package org.codej.rest.algorithm.기본자료구조;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SpeicalSort {
    /**
     * 정수 n 을 기준으로 n과 가까운 수부터 정렬,
     * 이 때, n으로부터 거리가 같다면 더 큰수를 앞에 오도록 배치
     * numlist의 원소를 n으로붙터 가까운 순서대로 정렬
     */
    public static void main(String[] args) {

        int[] numlist = {10000,20,36,47,40,6,10,7000};
        int n = 30;

        int[] answer = solution(numlist, n);
        System.out.println(Arrays.toString(answer));
    }
    public static int[] solution(int[] numlist, int n){

        List<Integer> list = Arrays.stream(numlist).boxed().collect(Collectors.toList());

        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                System.out.println(o1);
                System.out.println(o2);
                int abs1 = Math.abs(o1 - n);
                int abs2 = Math.abs(o2 - n);

                if (abs1 == abs2) {
                    if (o1 > o2) return -1;
                    else return 1;
                } else {
                    return abs1 - abs2;
                }
            }
        });
        return list.stream().mapToInt(i->(int)i).toArray();
    }
}
