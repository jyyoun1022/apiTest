package org.codej.rest.algorithm.기본자료구조;

import java.util.*;
import java.util.stream.Collectors;

public class DistinctRemoveByList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("d");
        list.forEach(System.out::println);
        System.out.println("=============");

        LinkedHashSet<String> set = new LinkedHashSet<>(list);
        set.forEach(System.out::println);
        System.out.println("=============");

        list = set.stream().collect(Collectors.toList());
        list.forEach(System.out::println);
    }
}
