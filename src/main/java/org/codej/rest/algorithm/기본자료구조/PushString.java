package org.codej.rest.algorithm.기본자료구조;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PushString {
    public static void main(String[] args) {


        String A = "hello";
        String B = "ohell";

        System.out.println(solution(A,B));
    }
    private static int solution(String A, String B) {
        int answer = 0;
        String copy = A;
        StringBuilder sb = new StringBuilder();
        for(int i= 0; i < copy.length(); i++) {
            if (copy.equals(B)) return answer;
            System.out.println(copy);
             copy = sb.append(copy.substring(copy.length()-1))
                    .append(copy.substring(0, copy.length() - 1)).toString();
             sb.setLength(0);
             answer++;
        }
        return -1;
    }
}
