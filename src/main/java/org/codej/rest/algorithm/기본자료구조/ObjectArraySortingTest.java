package org.codej.rest.algorithm.기본자료구조;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import static java.util.Collections.reverseOrder;

public class ObjectArraySortingTest {
    public static void main(String[] args) {

        @NoArgsConstructor
        @AllArgsConstructor
        @ToString
        @Getter
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

//        Arrays.sort(users,(u1,u2) -> Integer.compare(u2.age,u1.age)); // 내림차순
//        Arrays.sort(users,(u1,u2) -> Integer.compare(u1.age,u2.age));// 내림차순
//        Arrays.sort(users, Comparator.comparing(User::getAge));//나이순정렬
//        Arrays.sort(users,Comparator.comparing(User::getName)); //이름순 정렬
//        Arrays.sort(users,Comparator.comparing(User::getAge).thenComparing(User::getName));// 먼저 나이순으로 정렬하고 나이가 같다면 따로 이름순으로 정렬
        Arrays.sort(users,Comparator.comparing(User::getAge,reverseOrder()).thenComparing(User::getName,reverseOrder()));// 먼저 나이순으로 역순정렬하고 나이가 같다면 따로 이름순으로 역순정렬
        System.out.println(Arrays.toString(users));
    }
}
