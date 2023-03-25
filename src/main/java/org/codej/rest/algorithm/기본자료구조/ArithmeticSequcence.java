package org.codej.rest.algorithm.기본자료구조;

import java.util.Arrays;

public class  ArithmeticSequcence{
    public static void main(String[] args) {
        int num = 4;
        int total = 14;

        System.out.println(Arrays.toString(solution(num,total)));
    }
    private static int[] solution(int num, int total){
        int[] answer = new int[num];
        int nSum = num*(num+1) /2 - num;
        int start = (total-nSum) / num;
        for(int i=0; i<num; i++){
            answer[i] = start+i;
        }
        return answer;
    }
}
