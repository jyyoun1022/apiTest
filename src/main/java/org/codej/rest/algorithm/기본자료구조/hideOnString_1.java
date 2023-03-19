package org.codej.rest.algorithm.기본자료구조;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 문자열에서 숫자만 꺼낼 때 사용 하는방법
 * 1. String.replacAll() 을 이용한 정규식 방법
 * 2. steram()을 사용하여 Character.isDigit() 사용하여 문자형인지 처리
 */
public class hideOnString_1 {
    public static void main(String[] args) {
        String my_string = "aAb1B2cC34oOp";
        String[] arr = my_string.replaceAll("[^0-9]", "").split("");
        int answer = 0;
        for (String s : arr) {
            answer +=Integer.parseInt(s);
        }
//        IntStream intStream = my_string.chars();
//        Stream<Character> charStream = my_string.chars().mapToObj(i -> (char) i);
//        charStream = charStream.filter(Character::isDigit);
//        Stream<String> stringStream = charStream.map(String::valueOf);
//        intStream = stringStream.mapToInt(Integer::valueOf);
//        answer = intStream.sum();
//        String str = intStream.mapToObj(String::valueOf).collect(Collectors.joining(",", "<", ">"));
//        System.out.println(str);


        int sum = my_string.chars().mapToObj(i -> (char) i).filter(ch -> Character.isDigit(ch))
                .map(obj -> String.valueOf(obj)).mapToInt(s -> Integer.valueOf(s)).sum();

        String result = my_string.chars().mapToObj(i -> (char) i).filter(ch -> Character.isDigit(ch))
                .map(String::valueOf).mapToInt(s -> Integer.valueOf(s)).mapToObj(String::valueOf).collect(Collectors.joining(",", "<", ">"));

        System.out.println(result);
        System.out.println(sum);
        System.out.println(answer);
    }
}
