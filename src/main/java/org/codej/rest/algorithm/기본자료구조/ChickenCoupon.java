package org.codej.rest.algorithm.기본자료구조;

public class ChickenCoupon {
    public static void main(String[] args) {
        int chicken = 1081;

        int answer = 0;

        while( chicken >= 10){
            int serviceChicken = chicken /10;
            System.out.println("serviceChicken = " + serviceChicken);
            int restChicken = chicken % 10;
            chicken = serviceChicken + restChicken;
            System.out.println("chicken = " + chicken);

            answer += serviceChicken;
        }
        /**
         * 치킨을 1081 마리 시켰을 때,
         * 10 으로 나눠보면 ----108---- 마리의 서비스 치킨을 받았다.
         * 그리고 쿠폰은 1개가 남았다.
         * 이때 108 + 1 이므로 109마리에 대한 계산을 해줘야한다.
         *
         * 10으로 나누면 ---10----마리의 서비스 치킨을 받았다.
         * 그리구 쿠폰 9마리가 남았다.
         * 이때 10 + 9 이므로 19 마리에 대한 계싼을 추가로
         *
         *
         * 10으로 나눠보면 ---1---마리의 서비스 치킨을 받았다.
         * 그리구 쿠폰 9이 남았다.
         * 그리고 1 + 9 = 10 이므로 10마리에 마리에 대한 계산필요
         *
         * 10 으로 나눠 보면 ---1--- 마리의 서비스 쿠폰을 받을 수 있다.
         *
         *
         */

        System.out.println(answer);
    }
}
