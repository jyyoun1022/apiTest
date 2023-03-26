package org.codej.rest.algorithm.기본자료구조;

import java.util.Arrays;

public class FindSlope {
    public static void main(String[] args) {
        int[][] dots = {{1, 4}, {9, 2}, {3, 8}, {11, 6}};
        System.out.println(solution(dots));
    }
    private static int solution(int[][] dots){
        int answer = 0;
        if (findSlope(dots[0], dots[1]) == findSlope(dots[2], dots[3])) {
            return 1;
        }

        // (0, 2), (1, 3)
        if (findSlope(dots[0], dots[2]) == findSlope(dots[1], dots[3])) {
            return 1;
        }

        // (0, 3), (1, 2)
        if (findSlope(dots[0], dots[3]) == findSlope(dots[1], dots[2])) {
            return 1;
        }
        return answer;
    }
    private static double findSlope(int[] dot1, int[] dot2) {
        // 기울기 구하는 공식(y2- y1) / (x2 -x1)
        return (double)(dot2[1] - dot1[1]) /(dot2[0] - dot1[0]);
    }
}
