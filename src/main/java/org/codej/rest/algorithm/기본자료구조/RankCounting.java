package org.codej.rest.algorithm.기본자료구조;

import java.util.*;

public class  RankCounting{
    public static void main(String[] args) {
        /**
         * 영어 + 수학 = 평균 -> 등수
         * 영어점수,수학점수 담은 2차원 배열
         * 등수를 매긴 등수를 담은 배열을 return
         */
        int[][] score = {{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}};

        int[] answer = new int[score.length];

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < score.length; i++){
            list.add(score[i][0]+score[i][1]);
        }
        System.out.println("list = " + list);
        list.sort(Comparator.reverseOrder());
        System.out.println("reverse = " + list);


        for(int i=0; i< score.length; i++) {
            answer[i] = list.indexOf(score[i][0]+score[i][1])+1;
            System.out.println(list.indexOf(score[i][0]+score[i][1])+1);
        }
        System.out.println(Arrays.toString(answer));
    }

}
