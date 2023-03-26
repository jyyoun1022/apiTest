package org.codej.rest.algorithm.기본자료구조;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Command_Z {
    public static void main(String[] args) {
        String s = "-1 -2 -3 Z";
        System.out.println(solution(s));
    }
    private static int solution(String s){
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
           if(arr[i].equals("Z")){
               arr[i] = String.valueOf(-1*Integer.parseInt(arr[i-1]));
           }
        }
        return Arrays.stream(arr).mapToInt(Integer::parseInt).sum();
    }
}
