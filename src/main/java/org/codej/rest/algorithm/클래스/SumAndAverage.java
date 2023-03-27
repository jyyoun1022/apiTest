package org.codej.rest.algorithm.클래스;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Arrays;

public class SumAndAverage {
    public static void main(String[] args) {
        int numArray[] = {211, 240, 189, 99, 312, 105, 22, 14, 659, 48,
                140, 60, 121, 66, 841, 312, 123, 45, 554, 12,
                32, 99, 151, 144, 141, 213, 288, 612, 147, 9 };
        int sum = 0;
        double average = 0;
        System.out.println("::: 2번문제 :::");
        for(int i = 0; i < numArray.length; i++){
            System.out.printf("%3s ",numArray[i]);
            if (i % 5 == 4) {
                System.out.println();
            }
        }
        System.out.println("\n::: 3번문제 :::");
        sum = Arrays.stream(numArray).sum();
        average = (double)Arrays.stream(numArray).sum()/ numArray.length;

        System.out.println(" 합 : " + sum);
        System.out.println("평균 : " + average);

        System.out.println("\n::: 4번문제 :::");
        System.out.println(getCountAboveAvg(numArray,average));
    }
    private static int getCountAboveAvg(int numArray[], double average){
        int count = 0;
        for (int i = 0; i < numArray.length; i++) {
            if (average < numArray[i]) {
                count++;
            }
        }
        return count;
    }
}

