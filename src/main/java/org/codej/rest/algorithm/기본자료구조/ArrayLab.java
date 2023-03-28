package org.codej.rest.algorithm.기본자료구조;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayLab {
    public static void main(String[] args) {
//        average();
//        min_max();
//        mix();
//        lotto();
        customLotto();
    }
    private static void average (){
        int sum =0;
        double average = 0;

        int[] score = {100, 88, 90, 36, 80};

        for (int i=0; i<score.length; i++){
            sum += score[i];
        }
        average = (double)sum / score.length;
        System.out.println("SUM ::: "+sum);
        System.out.println("AVERAGE ::: "+average);
    }

    private static void min_max(){
        int[] score = {70, 88, 90, 36, 80};

        int min = score[0]; //배열의 첫 번쨰 값으로 최소값을 초기화
        int max = score[0]; //배열의 첫 번째 값으로 최대값을 초기화

        for(int i=0; i< score.length; i++){
            if(score[i] > max){
                max = score[i];
            } else if(score[i] < min){
                min = score[i];
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);

    }
    private static void mix(){
        int[] numArr = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(numArr));

        for(int i=0; i < 100; i++){
            int n = (int) (Math.random() * 10);// 0-9

            //numArr의 0번째 값과 n번째 값을 서로 바꾸는 코드
            //정렬 코드 짤 떄 많이씀
            int temp = numArr[0];
            numArr[0] = numArr[n];
            numArr[n] = temp;
        }
        System.out.println(Arrays.toString(numArr));
    }
    private static void lotto(){
        int[] lotto = IntStream.rangeClosed(0, 45).toArray();

        for(int i=1; i <=6; i++){
            int random = (int)((Math.random()*45));
            System.out.println(i +"번째 당첨공 ["+lotto[random] +"]");
        }
    }
    private static void customLotto(){
        /**
         * 1 -45 까지의 랜덤으로 값이 뽑혀야한다. 중복은 없다
         * 두번째로 뽑아진 숫자의 크기가 크기 순서대로 출력되어야 한다.
         */
        int[] lotto = new int[6];
        int temp = 0;
        int num = 0;

        Loop1 :
        for(int i =0; i< lotto.length; i++){
            lotto[i] = (int) ((Math.random() * 45) + 1);
            for(int j=0; j< i; j++){
                num += 1;
                if (lotto[i] == lotto[j]) {
                    i--;
                    continue Loop1;
                }
            }
        }
        System.out.println("num = " + num);
        System.out.println(Arrays.toString(lotto));

        // 선택 정렬
        for (int i=0; i< lotto.length; i++){
            for(int j =i+1; j< lotto.length; j++){
                if (lotto[i] >lotto[j]) {
                    num +=1;
                    temp = lotto[i];
                    lotto[i] = lotto[j];
                    lotto[j] = temp;
                    System.out.println(Arrays.toString(lotto));
                }
            }
        }
        System.out.println("num = " + num);

        System.out.printf("최종 로또 번호는 ? ");
        for (int i : lotto) {
            System.out.print(i+" ");
        }
    }

}
