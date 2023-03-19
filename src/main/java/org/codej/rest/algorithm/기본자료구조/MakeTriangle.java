package org.codej.rest.algorithm.기본자료구조;

import java.util.*;
import java.util.stream.Collectors;

public class MakeTriangle {
    public static void main(String[] args) {
        int[] sides = {199,72,222};
        int answer =0;
//        List<Integer> list = Arrays.stream(sides).boxed().collect(Collectors.toList());
//        Collections.sort(list);
//        for(int i =0; i<list.size(); i++) {
//
//            answer = list.get(0) + list.get(1) > list.get(2) ? 1 : 2;
//        }

        Arrays.sort(sides);
        answer = sides[0] + sides[1] > sides[2] ? 1 : 2;
        System.out.println(Arrays.toString(sides));
        System.out.println(answer);

    }
}
