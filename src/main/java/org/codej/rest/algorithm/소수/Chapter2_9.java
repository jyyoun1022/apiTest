package org.codej.rest.algorithm.소수;

public class Chapter2_9 {
    public static void main(String[] args) {
        int counter = 0; //나누셈의 횟수

        for(int i = 2; i <= 1000; i++) {
            int j;
            for(j = 2; j < i; j++) {
                counter++;
                if (i % j == 0) {
                    break;
                }
            }
            if (i == j){
                System.out.println(i);
            }
        }
        System.out.println("나눗셈 수행횟수 : "+counter);

    }
}
