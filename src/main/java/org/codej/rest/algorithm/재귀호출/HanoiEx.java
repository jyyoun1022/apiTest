package org.codej.rest.algorithm.재귀호출;

import java.util.Scanner;

public class HanoiEx {
    static String[] name = {"A기둥","B기둥","C기둥"};

    static void move(int no, int x, int y){
        if (no >1){
            move(no-1,x,6-x-y);
        }
        System.out.println("원반[" + no + "]을 " + name[x - 1] + "에서 " + name[y - 1] + "으로 이동");
        if(no >1) {
            move(no-1,6-x-y,y);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        move(sc.nextInt(),1,4);
    }
}
