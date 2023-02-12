package org.codej.rest.algorithm;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Chapter2_5 {
    // 난수 사용해서 배열의 요소값 설정하기
    static int maxOf(int[] a) {
        int max = a[0];
        for(int i=1; i<a.length; i++) {
            if (max < a[i]) max = a[i];
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("키의 최대값을 구해라");
        int num = 1+ random.nextInt(10);
        System.out.println("사람 수 : "+num);

        int[] height = new int[num];
        System.out.println("키 값은 아래와 같습니다.");
        for (int i=0; i<num; i++) {
            height[i] = random.nextInt(90) +100;
        }

        int result = maxOf(height);
        System.out.println(result);

    }
}
class ReverseArray{

    static  void swap(int[] a, int idx1, int idx2){
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void reverse (int[] a) {
        for(int i=0; i<a.length/2; i++) {
            swap(a,i, a.length-i-1);
        }
    }

    static int sumOf(int[] a) {
        int sum = 0;
        for (int i=0; i<a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        System.out.print("요소수 : ");
        int num = sc.nextInt();

        int[] arr = new int[num];
        for(int i=0; i<arr.length; i++) {
            arr[i] = ran.nextInt(50);
            System.out.println("arr["+i+"]"+ ":"+arr[i]);
        }
        reverse(arr);

        System.out.println(Arrays.toString(arr));

        int result = sumOf(arr);
        System.out.println(result);

    }

}