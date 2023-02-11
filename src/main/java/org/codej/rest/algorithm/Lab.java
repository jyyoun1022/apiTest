package org.codej.rest.algorithm;

import java.util.Scanner;

public class Lab {
    public static void main(String[] args) {
        int num = 4;
        do {
            System.out.println(num);
            num++;
        } while (num <= 5);
        System.out.println("program and.... ");

    }
}
class Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no;

        System.out.println("2가지 정수를 입력하세요.");

        do {
            System.out.print("입력 : ");
            no = sc.nextInt();
        } while (no < 10 || no > 99);
        // while (!(no >=10 && no <=99)) 으로 대체가능
    // while 문의 조건식이 성립한다면 do문을 반복해라!
        System.out.println("변수 no의 값은 : " +no);
    }
}
