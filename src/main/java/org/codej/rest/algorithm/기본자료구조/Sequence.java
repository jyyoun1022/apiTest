package org.codej.rest.algorithm.기본자료구조;

public class Sequence {
    public static void main(String[] args) {
        int[] common = {2,4,8};
        System.out.println(solution(common));
    }
    private static int solution(int[] common){
        int answer = 0;
        if ((common[1] - common[0]) == (common[2] - common[1])) {
            answer = common[common.length-1] + (common[2] -common[1]);
        } else{
            answer = common[common.length-1] * (common[2]/common[1]);
        }
        return answer;
    }
}
