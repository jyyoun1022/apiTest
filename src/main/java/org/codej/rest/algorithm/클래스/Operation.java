package org.codej.rest.algorithm.클래스;

import java.math.BigDecimal;

public enum Operation {
    PLUS("+"){
        @Override
        public BigDecimal apply(BigDecimal x, BigDecimal y) {
            return x.add(y);
        }
    },
    MINUS("-"){
        @Override
        public BigDecimal apply(BigDecimal x, BigDecimal y) {
            return x.subtract(y);
        }
    },
    MULTI("*"){
        @Override
        public BigDecimal apply(BigDecimal x, BigDecimal y) {
            return x.multiply(y);
        }
    },
    DIVIDE("/"){
        @Override
        public BigDecimal apply(BigDecimal x, BigDecimal y) {
            return x.divide(y);
        }
    };

    private final String symbol;

    Operation(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return this.symbol;
    }
    public abstract BigDecimal apply(BigDecimal x, BigDecimal y);

    public static void main(String[] args) {
        BigDecimal x = BigDecimal.valueOf(12.5);
        BigDecimal y = new BigDecimal("5.7");

        Operation plus = Operation.PLUS;
        String name = plus.toString();
        System.out.println(name);

        BigDecimal plusResult = plus.apply(x, y);
        System.out.println(plusResult);
    }
}
