package org.codej.rest.algorithm.클래스;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
public class Animal {
    int teethCount;
    int legCount;
    int totalCount;


    public static void main(String[] args) {
        Dog dog = new Dog(1,1,2);
        System.out.println(dog.legCount);
        System.out.println(dog.totalCount);

    }




}

