package org.codej.rest.algorithm.재귀호출;

import java.util.Scanner;

public class Hanoi {
    static void move(int no,int x, int y) {
        // no 개의 원반을 x번 기둥에서 y번 기둥으로 옮김
        if (no>1) {
            move(no-1,x,10-x-y);
        }
        System.out.println("원반["+no+"]을"+x+"기둥에서 "+y+"기둥으로 옮김");
        if(no >1){
            move(no-1,10-x-y,y);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("원반개수 : "+n);
        move(n,1,3);
    }
}
