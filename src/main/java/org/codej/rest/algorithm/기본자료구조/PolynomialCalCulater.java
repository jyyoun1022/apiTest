package org.codej.rest.algorithm.기본자료구조;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PolynomialCalCulater {
    public static void main(String[] args) {
        String polynomial = "x + 7";
        System.out.println(solution(polynomial));
    }
    private static String solution(String polynomial){

        int xValue = 0;
        int originValue = 0;
        StringBuilder sb = new StringBuilder();

        String[] xArr = Arrays.stream(polynomial.split(" "))
                .filter(i -> i.contains("x"))
                .toArray(String[]::new);
        for (String str : xArr) {
            xValue += "x".equals(str) ? 1 : Integer.parseInt(str.substring(0,str.length()-1));
        }

        String[] arr = Arrays.stream(polynomial.split(" "))
                .filter(i -> !i.contains("x"))
                .toArray(String[]::new);

        for (int i =0; i<arr.length; i++){
            arr[i] = arr[i].replace(" ","").replaceAll("[^0-9]","");
        }

        originValue = Arrays.stream(arr).filter(i -> !i.equals("")).mapToInt(Integer::parseInt).sum();

        if(xValue > 1) {
            sb.append(xValue+"x");
            if(originValue != 0) {
                sb.append(" + " + originValue);
            }
        }else if(xValue == 1){
            sb.append("x");
            if(originValue != 0) {
                sb.append(" + " + originValue);
            }
        } else {
                sb.append(originValue);
        }
        return sb.toString();
    }
}
