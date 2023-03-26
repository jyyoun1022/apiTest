package org.codej.rest.algorithm.기본자료구조;

import java.util.Arrays;

public class StringToCal {
    public static void main(String[] args) {
        String min = "1 + 24 + 3 + 40 - 21";
        min = min.replaceAll("- ", "-").replaceAll("[+] ","").trim();
        int sum = Arrays.stream(min.split(" ")).mapToInt(Integer::parseInt).sum();
        System.out.println(sum);
        System.out.println(solution("1 + 24 + 3 + 40 - 21"));
    }
    private static int solution(String my_string){

        String[] str = my_string.split(" ");
        int answer= Integer.parseInt(str[0]);

        for (int i= 0; i< str.length; i++){

        }
        return answer;
    }
}
