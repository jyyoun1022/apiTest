package org.codej.rest.algorithm.기본자료구조;

public class Finite_Decimal {

    /**소숫점 아래 숫자가 계속되지 않고 유한개인 소수를 유한소수
     * 분수를 소수로 고칠때 유한소수로 나타낼 수 있는 분수 인지 판별
     * 유한소수가 되기 위한 조건 : 기약분수로 나타냈을 때 분모의 소인수가 2 와 5만 존재
     */

    public static void main(String[] args) {
        int a = 3;
        int b = 25;
        int result = solution(a, b);
        System.out.println(result);
    }

    public static int solution(int a, int b) {
        b = b/gcd(a,b);
        while(b != 1) { // b 가 1 이라면 ,
            if (b % 2 ==0){
                b /=2;
            } else if((b % 5) ==0) {
                b /= 5;
            } else {
                return 2;
            }
        }
        return 1;

    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
