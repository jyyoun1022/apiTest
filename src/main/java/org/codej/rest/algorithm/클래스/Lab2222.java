package org.codej.rest.algorithm.클래스;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Lab2222 {
    public static void main(String[] args) {
        String my_string = "jaron";

        String[] array = my_string.split("");
        List<String> list = Arrays.stream(array).collect(Collectors.toList());
        Collections.reverse(list);
        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            sb.append(s);
        }
        String answer = sb.toString();
        System.out.println(answer);


//        List<Integer> list = Arrays.stream(num_list).boxed().collect(Collectors.toList());
//        Collections.reverse(list);
//        num_list = Arrays.stream(list.toArray()).mapToInt(i -> (int) i).toArray();
    }
}
