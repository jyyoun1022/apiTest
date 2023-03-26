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
        int min = Integer.MAX_VALUE;
        int answer = 0;

        for(int i=0; i< array.length; i++){
            int abs = Math.abs(array[i] - n);

            if (abs <min){
                min= abs;
                answer = array[i];
            }
        }
        return answer;
    }
}
