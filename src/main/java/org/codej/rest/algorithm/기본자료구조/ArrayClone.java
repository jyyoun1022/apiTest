package org.codej.rest.algorithm.기본자료구조;

import org.yaml.snakeyaml.emitter.ScalarAnalysis;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayClone {
    public static void main(String[] args) {
        int[] test = {1,2,3,4,5};
        int[] test2 = test.clone();

        test2[3] = 0;

        System.out.println(Arrays.toString(test));
        System.out.println(Arrays.toString(test2));
        System.out.println(Arrays.toString(test));

    }
}
class maxValue{
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};

        int max = a[0];
        for(int i=1; i<a.length; i++) {
            if(max < a[i]) max = a[i];
        }

        System.out.println(max);
    }
}
class MaxOfArray {
    static int maxOf(int[] a) {
        int max =a[0];
        for(int i=1; i<a.length; i++) {
            if (max <a[i]) max = a[i];
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("키의 최대값을 구합니다.");
        System.out.print("사람 수 : ");
        int num = sc.nextInt(); // 배열의 요소수를 입력받음...

        int[] height = new int[num];

        for (int i=0; i< height.length; i++) {
            System.out.print("height["+i+"]");
            height[i] = sc.nextInt();
        }
        System.out.println("maxValue = " +maxOf(height));
    }
}


