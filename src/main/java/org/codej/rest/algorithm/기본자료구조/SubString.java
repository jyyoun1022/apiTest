package org.codej.rest.algorithm.기본자료구조;

public class SubString {
    public static void main(String[] args) {
        String pinNo = "ASD345123456";
        String pointNo = pinNo.substring(pinNo.length() - 6);

        System.out.println(pointNo);

    }
}
