package org.codej.rest.algorithm.기본자료구조;

public class ClothDiscount {
    public static void main(String[] args) {
        // 10만원 이상 5%
        // 30만원 이상 10%
        // 50만원 이상 20%
        //지불한 옷의 가격 price
        // 지불해야할 금액 return
        int price = 580000;
        double answer = 0;
        if (price >= 500000) {
            answer = price * (0.8);
        } else if (price >= 300000) {
             answer = price * (0.9);
        } else if (price  >= 100000){
            answer = price * (0.95);
        } else {
            answer = price;
        }
        System.out.println((int)answer);

    }
}
