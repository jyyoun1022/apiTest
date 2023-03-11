package org.codej.rest.algorithm.클래스;

import java.util.Scanner;

public class EqualsCal {
    public static void main(String[] args) {
        for(int i=0; i<7; i++) {

           /** 1. */
           for(int j=0; j<2; j++){ // j=0,1 = 2개
                if (i < 3){
                    break;
                }
                System.out.print("*");
           }

            /** 2. */
            for(int j=0; j<2; j++){ // j=0,1 = 2개
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
