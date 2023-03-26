package org.codej.rest.algorithm.기본자료구조;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class OnceTime {
    public static void main(String[] args) {
        String s = "abcabcadc";
        System.out.println(solution(s));
    }
    private static String solution(String s) {

        Map<String, Integer> map = new HashMap<>();
        String[] arr = s.split("");
        StringBuilder sb = new StringBuilder();
        for (String str : arr) {
            map.put(str,map.getOrDefault(str,0)+1);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) sb.append(entry.getKey());
        }
        String answer = Arrays.stream(sb.toString().split("")).sorted().collect(Collectors.joining());
        return answer;
    }
}
