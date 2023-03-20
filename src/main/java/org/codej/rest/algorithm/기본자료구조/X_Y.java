package org.codej.rest.algorithm.기본자료구조;

import java.util.Arrays;

public class X_Y {
    public static void main(String[] args) {
        //up,down,left,right
        //[0,0] 에서 up [0,1] -> x,y 좌표라고 생각
        //[0,0] 은 board 중앙
        String[] keyinput = {"left", "left", "left", "left", "right"};
        int[] board = {3, 3};

        int[] answer = {0, 0};
        for (String key : keyinput) {
                if ("left".equals(key) && answer[0] > -(board[0]/2)) {
                    answer[0]--;
                } else if ("right".equals(key) && answer[0] < board[0]/2) {
                    answer[0]++;
                } else if ("up".equals(key) && answer[1] < board[1]/2) {
                    answer[1]++;
                } else if("down".equals(key) && answer[1] > -(board[1]/2)){
                    answer[1]--;
                }
            }
        System.out.println(Arrays.toString(answer));


    }
}
