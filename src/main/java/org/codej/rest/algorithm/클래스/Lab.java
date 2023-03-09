package org.codej.rest.algorithm.클래스;

import java.math.BigDecimal;

public class Lab {
    public static void main(String[] args) {
        double value1 = 12.23;
        double value2 = 34.45;

        BigDecimal bigDecimal = new BigDecimal("12.23");
        BigDecimal bigDecimal2 = BigDecimal.valueOf(34.35);


        System.out.println(value1 + value2);
        System.out.println(bigDecimal.add(bigDecimal2));
    }
}
