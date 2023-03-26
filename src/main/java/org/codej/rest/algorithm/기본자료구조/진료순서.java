package org.codej.rest.algorithm.기본자료구조;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

import static java.util.Comparator.*;

public class 진료순서 {
    public static void main(String[] args) {

        int[] emergency = {30, 10, 23, 6, 100};
        System.out.println(Arrays.toString(solution(emergency)));
    }
    private static int[] solution(int[] emergency) {
        int [] answer = new int[emergency.length];
        Integer[] arr = Arrays.stream(emergency).boxed().toArray(Integer[]::new);
        Arrays.sort(arr,new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        System.out.println(Arrays.toString(arr));
        for(int i=0; i< answer.length; i++){
           for(int j = 0; j < answer.length; j++){
               if(arr[j] == emergency[i]){
                   answer[i] = j+1;
               }
           }
        }

        int[] result = Arrays.stream(emergency)
                .map(i -> Arrays.stream(emergency).boxed()
                        .sorted(reverseOrder())
                        .collect(Collectors.toList()).indexOf(i) + 1)
                .toArray();
        System.out.println(Arrays.toString(result));
        return answer;
    }
}
