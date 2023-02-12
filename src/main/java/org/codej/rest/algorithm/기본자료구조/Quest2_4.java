package org.codej.rest.algorithm.기본자료구조;

import java.util.Scanner;

public class Quest2_4 {
    /**
     * 배열 b의 모든 요소를 배열 a로 복사하는 메서드
     */
    static void copy(int[] a ,int[] b) {
        int num = a.length <= b.length ? a.length : b.length;
        for(int i=0; i<num; i++) {
            a[i] = b[i];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a 의 요소수는 : ");
        int numA = sc.nextInt();
        int[] a = new int[numA];
        for (int i = 0; i < numA; i++) {
            System.out.print("a[" + i + "] : ");
            a[i] = sc.nextInt();
        }

        System.out.print("b 의 요소수는 : ");
        int numB = sc.nextInt();
        int[] b = new int[numB];
        for (int i = 0; i < numB; i++) {
            System.out.print("b[" + i + "] : ");
            b[i] = sc.nextInt();
        }
        copy(a,b);

        System.out.println("배열 b의 모든 요소를 배열 a에 copy 하였습니다.");
        for (int i = 0; i < numA; i++)
            System.out.println("a[" + i + "] = " + a[i]);
    }
    }
    class Q2_5 {
        static void reverseCopy(int[] a, int[] b){
            int num = a.length <= b.length ? a.length : b.length;
            for(int i=0; i<num; i++) {
                a[i] = b[b.length-i-1];
            }
        }
        public static void main(String[] args) {

        }
    }

