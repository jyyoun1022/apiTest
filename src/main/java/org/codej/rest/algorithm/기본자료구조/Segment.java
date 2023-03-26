package org.codej.rest.algorithm.기본자료구조;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Segment {
    public static void main(String[] args) {
        int[][] lines = {{0, 5}, {3, 9}, {1, 10}};
        System.out.println(solution(lines));
    }
    public static int solution(int[][] lines){
        // 1. arr 배열 및 변수 초기화
        int[] arr = new int[200];
        int answer = 0;

        // 2. lines 정보를 arr 배열에 적용
        for(int i = 0; i < lines.length; i++)
            for(int j = lines[i][0] + 100; j < lines[i][1] + 100; j++)
                arr[j]++;

        // 3. arr 배열에서 겹친 부분 세기
        for(int i = 0; i < 200; i++)
            if(arr[i] > 1)
                answer++;
        return answer;
    }
}
