package org.codej.rest.algorithm.스택;

import java.util.Scanner;

public class IntStackTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntStack intStack = new IntStack(64);

        while(true) {
            System.out.println("data count : "+intStack.size()+"/\n"+ intStack.capacity());
            System.out.printf("(1) push \n" +
                    "(2) pop \n" +
                    "(3) peak \n" +
                    "(4) dump \n" +
                    "(0) out ");

            int menu = sc.nextInt();
            if (menu == 0) break;

            int x;
            switch (menu) {
                case 1 :
                    System.out.print("데이터 : ");
                    x = sc.nextInt();
                    try {
                        intStack.push(x);
                    } catch (IntStack.OverflowStackException e) {
                        System.out.println("스택이 가득 찼습니다.");
                    }
                    break;

                case 2 :
                    try {
                        x = intStack.pop();
                        System.out.println("pop Data : "+x);
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비어있습니다.");
                    }
                    break;

                case 3 :
                    try {
                        x = intStack.peak();
                        System.out.println("peak Data : "+x);
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;
                case 4 :
                    intStack.dump();
                    break;
            }
        }

    }
}
