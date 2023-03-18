package org.codej.rest.algorithm.기본자료구조;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaxArray {
    public static void main(String[] args) {
        int[] numbers = {0, 31, 24, 10, 1, 9};
        Integer[] newArr = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
        Arrays.sort(newArr,Comparator.reverseOrder());
        System.out.println(Arrays.toString(newArr));
        System.out.println(newArr[0] * newArr[1]);
    }
}
