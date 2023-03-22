package org.codej.rest.algorithm.기본자료구조;

import java.util.Arrays;

public class RecSize {
    public static void main(String[] args) {

        int[][] dots = {{1, 1}, {2, 1}, {2, 2}, {1, 2}};
        int answer = 0;
        int x = 0;
        int y = 0;


        for (int i = 1; i < 4; i++) {
            int a = Math.abs(dots[i-1][0] - dots[i][0]);
            int b = Math.abs(dots[i-1][1] - dots[i][1]);

            x = Math.max(a,x);
            y = Math.max(b,y);
        }

        System.out.println(x*y);

    }
}
