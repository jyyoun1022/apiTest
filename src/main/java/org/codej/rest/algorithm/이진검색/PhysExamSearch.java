package org.codej.rest.algorithm.이진검색;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.function.ToIntFunction;

public class PhysExamSearch {
    // 신체검 데이터를 정의
    @NoArgsConstructor
    @AllArgsConstructor
    @ToString
    static class PhyscData {
        private String name;
        private int height;
        private double vision;

        /** 오름차순으로 정렬하기 위한 Comparator*/
        public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();

        private static class HeightOrderComparator implements Comparator<PhyscData> {
            @Override
            public int compare(PhyscData o1, PhyscData o2) {
                return (o1.height > o2.height )? 1 :
                        (o1.height < o2.height) ? -1 :0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhyscData[] x = {
                new PhyscData("이나영",190,0.3),
                new PhyscData("김나영",180,0.4),
                new PhyscData("박나영",170,1.1),
                new PhyscData("손나영",160,1.3),
                new PhyscData("윤나영",150,0.9),
                new PhyscData("민나영",180,1.3),
        };

        int height = sc.nextInt();
        int idx = Arrays.binarySearch(x, new PhyscData("", height, 0.0), PhyscData.HEIGHT_ORDER);

        if (idx < 0) {
            System.out.println("없음");
        } else {
            System.out.println(idx);
        }
    }

}
