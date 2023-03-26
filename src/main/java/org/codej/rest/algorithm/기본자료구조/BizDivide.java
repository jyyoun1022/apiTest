package org.codej.rest.algorithm.기본자료구조;

import java.math.BigInteger;

public class BizDivide {
    public static void main(String[] args) {
        int balls = 5;
        int share = 3;
        System.out.println(solution(balls,share));
    }
    public static BigInteger solution(int balls, int share){
        BigInteger answer = factorial(balls).divide(factorial(balls - share).multiply(factorial(share)));
        return answer;
    }
    public static BigInteger factorial(int a){

        BigInteger result = BigInteger.valueOf(1);
        for(int i=1; i<=a; i++){
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
