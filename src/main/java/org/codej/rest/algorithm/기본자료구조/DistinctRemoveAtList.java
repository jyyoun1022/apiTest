package org.codej.rest.algorithm.기본자료구조;

import java.util.*;
import java.util.stream.IntStream;

public class DistinctRemoveAtList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);;
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);
        list.add(5);
        System.out.println(list);

        Set<Integer> set = new HashSet<>();
        set.addAll(list); //set에 중복안되게끔 넣어놨다.
        list.clear();
        list.addAll(set);

        System.out.println(list);
    }
}
