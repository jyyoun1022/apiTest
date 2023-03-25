package org.codej.rest.algorithm.기본자료구조;

import java.util.Arrays;

public class FountainPlus {
    public static void main(String[] args) {
        int number1 = 1;
        int denom1 = 2;
        int number2 = 3;
        int denom2 = 4;
        System.out.println(gcd(30,6));
        System.out.println(Arrays.toString(solution(number1,denom1,number2,denom2)));
    }
    private static int[] solution(int numer1, int denom1, int numer2, int denom2){
        int[] answer = new int[2];

        int lcm = lcm(denom1, denom2);
        numer1 *= lcm/denom1;
        numer2 *= lcm/denom2;

        answer[0] = numer1+numer2;
        answer[1] = lcm;

        int gcd = gcd(answer[0], answer[1]);
        if(gcd != 1){
            answer[0] /= gcd;
            answer[1] /= gcd;
        }

        return answer;
    }
    private static int gcd(int a, int b){
        if (b == 0) return a;
        return gcd(b,a%b);
    }
    private static int lcm(int a, int b) {
        return (a*b)/gcd(a,b);
    }
}
