package org.codej.rest.algorithm.기본자료구조;

import java.util.Arrays;
import java.util.stream.Collectors;

public class OXQuiz {
    public static void main(String[] args) {
        String[] quiz = {
                         "19 - 6 = 13",
                         "5 + 66 = 71",
                         "5 - 15 = 63",
                         "3 - 1 = 2"
        };
        System.out.println(Arrays.toString(solution(quiz)));
    }
    private static String[] solution(String[] quiz){
        /**
         * 연산기호와 숫자사이는 공백
         *
         */
        String[] answer = new String[quiz.length];

        for(int i = 0; i < quiz.length; i++) {
            String[] str = quiz[i].split(" ");
            if ("-".equals(str[1])) {
                answer[i] = (Integer.parseInt(str[0]) - Integer.parseInt(str[2]) ) == Integer.parseInt(str[4]) ? "O": "X";
            } else {
                answer[i] = (Integer.parseInt(str[0]) + Integer.parseInt(str[2]) ) == Integer.parseInt(str[4]) ? "O": "X";
            }
        }
        return answer;
    }
}
