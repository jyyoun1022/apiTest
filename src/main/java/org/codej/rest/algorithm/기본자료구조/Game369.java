package org.codej.rest.algorithm.기본자료구조;

import org.codej.rest.algorithm.클래스.arr;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Game369 {
    public static void main(String[] args) {

        int order = 294230; // order에 3,6,9 가들어가는 개수 구하시오.
        int answer = 0;
        answer = (int)Arrays.stream(String.valueOf(order).split(""))
                .mapToInt(Integer::parseInt).boxed()
                .collect(Collectors.toList())
                .stream().filter(i -> i>0)
                .filter(i -> i % 3 == 0).count();
        System.out.println(answer);

    }
}
