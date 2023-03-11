package org.codej.rest.algorithm.클래스;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int input = sc.nextInt();
            System.out.println(input);

        } catch (Exception e){
            e.printStackTrace();
            System.out.println("아 오늘 야근이다.");
        }

    }
}
