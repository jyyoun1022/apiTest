package org.codej.rest.algorithm.클래스;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.codej.rest.algorithm.이진검색.A;

@AllArgsConstructor
@Data
public class Dog extends Animal{
    public Dog(int teethCount, int legCount, int totalCount) {
        super(teethCount, legCount, totalCount);
    }

    private int cc;

    public Dog() {
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog);
    }
}