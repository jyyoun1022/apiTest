package org.codej.rest.algorithm.클래스;

public class PrimitiveTest {
    public static void main(String[] args) {
        int age = 28;
        int num = 17;

        changePrimitive(age,num);

        System.out.println("age1 = " + age);
        System.out.println("num1 = " + num);
        /**
         * age1 : 28
         * num1 : 17
         *
         * age2 : 29
         * num2 : 19
         */
    }
    static void changePrimitive(int age,int num){
        age += 1;
        num += 2;
        System.out.println("age2 = " + age);
        System.out.println("num2 = " + num);
    }
}
