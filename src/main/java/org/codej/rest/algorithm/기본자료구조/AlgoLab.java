package org.codej.rest.algorithm.기본자료구조;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class AlgoLab {
    public static void main(String[] args) {
        String[] spell= {"p","o","s"};
        String[] dic = {"sod", "eocd", "qixm", "adio", "soo"};
        System.out.println(solution(spell,dic));
    }
    public static int solution(String[] spell, String[] dic){
       int answer = 2;

        for (String dics : dic) {
            boolean isFlag = true;
            for (String spells : spell) {
                if( dics.indexOf(spells) == -1)
                    isFlag = false;
                break;
            }
            if (isFlag == true)
                answer = 1;
            break;
        }
        return answer;
    }
}
