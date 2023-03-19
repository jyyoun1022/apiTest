package org.codej.rest.algorithm.기본자료구조;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Dont_like_even {
    public static void main(String[] args) {
        int n = 10;
        int[] answer = IntStream.rangeClosed(1, n).filter(i -> i % 2 != 0).toArray();
        System.out.println(Arrays.toString(answer));
    }
}
