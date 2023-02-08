package org.codej.rest.algorithm;

public class SubString {
    public static void main(String[] args) {
        String pinNo = "ASD345123456";
        String pointNo = pinNo.substring(pinNo.length() - 6);

        System.out.println(pointNo);

    }
}
