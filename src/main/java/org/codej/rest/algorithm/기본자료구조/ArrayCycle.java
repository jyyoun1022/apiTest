package org.codej.rest.algorithm.기본자료구조;

import java.util.Arrays;

public class ArrayCycle {
    public static void main(String[] args) {
        int[] numbers = {4, 455, 6, 4, -1, 45, 6}; // 7
        String direction ="left";

        int[] answer = new int[numbers.length]; //7
        if("left".equals(direction)) {
            for(int i =0; i< numbers.length-1; i++){
                // 0 <= 1 ~
                // last <= 0
                answer[i] = numbers[i+1];
            }
            answer[numbers.length-1] = numbers[0];
        }else {
            for (int i=0; i< numbers.length-1; i++){
                // 1 <= 0 ~
                // 0 <= last
                answer[i+1] = numbers[i];
            }
            answer[0] = numbers[numbers.length-1];
        }
        System.out.println(Arrays.toString(answer));


    }
}
