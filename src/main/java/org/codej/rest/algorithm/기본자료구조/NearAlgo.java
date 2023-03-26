package org.codej.rest.algorithm.기본자료구조;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NearAlgo {
    public static void main(String[] args) {
        int[] arr = {10,11,12};
        int n = 13;
        System.out.println(solution(arr,n));
    }
    public static int solution(int[] array, int n){
        Arrays.sort(array);//오름차순으로 세팅
        int min = Integer.MAX_VALUE; // min = 최대값으로 세팅
        int answer = 0; // answer= 0;으로 세팅

        for(int i=0; i< array.length; i++){// 배열전체를 돌면서
            int abs = Math.abs(n-array[i] );//절대값을 abs로 뺴고

            if (abs < min){
                min = abs;
                answer = array[i];
            }
        }
        return answer;
    }
}
