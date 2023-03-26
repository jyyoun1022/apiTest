package org.codej.rest.algorithm.기본자료구조;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Factorization {
    public static void main(String[] args) {
        int n = 420;
        System.out.println(Arrays.toString(solution(n)));
    }
    private static int[] solution(int n){
        List<Integer> list = new ArrayList<>();
        for(int i=2; i <= n; i++){
            if(n % i == 0){
                while(n % i == 0){
                    n /= i;
                }
                list.add(i);
            }
        }
        int[] answer = list.stream().sorted().mapToInt(i -> (int) i).toArray();
        return answer;
    }
}
