package org.codej.rest.algorithm.기본자료구조;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseArray2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(arr));

        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        int[] result = Arrays.stream(list.toArray()).mapToInt(i -> (int) i).toArray();
        System.out.println("Result 1 ::: " + Arrays.toString(result));
    }
}
