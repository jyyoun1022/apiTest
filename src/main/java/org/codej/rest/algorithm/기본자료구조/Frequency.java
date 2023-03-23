package org.codej.rest.algorithm.기본자료구조;

import java.util.*;
import java.util.stream.Collectors;

public class Frequency {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 3, 4};
        System.out.println(solution(array));
    }
    private static int solution(int[] array){
      int answer =0;
      int maxCount = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i : array) {
            int count = map.getOrDefault(i, 0) + 1;
            if (count > maxCount) {
                maxCount = count;
                answer = i;
            } else if(count ==maxCount) {
                answer = -1;
            }
            map.put(i,count);
        }

        return answer;
    }
}
