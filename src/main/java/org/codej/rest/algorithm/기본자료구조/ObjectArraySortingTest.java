package org.codej.rest.algorithm.기본자료구조;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Arrays;

public class ObjectArraySortingTest {
    public static void main(String[] args) {

        @NoArgsConstructor
        @AllArgsConstructor
        @ToString
        class User {
            String name;
            int age;

        }
        User[] users = {
                new User("홍길동", 32),
                new User("김춘추", 64),
                new User("임꺽정", 48),
                new User("박혁거세", 14),

        };

        Arrays.sort(users,(u1,u2) -> Integer.compare(u2.age,u1.age)); // 내림차순
//        Arrays.sort(users,(u1,u2) -> Integer.compare(u1.age,u2.age));// 내림차순

        System.out.println(Arrays.toString(users));
    }
}
