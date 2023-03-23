package org.codej.rest.algorithm.기본자료구조;

import lombok.*;

import java.math.BigInteger;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Employee {

    private long id;
    private String name;
    private String department;
    private String position;
    private BigInteger sales;
    private Integer price;


    /**
     * A < B 인경우 => 음수를 리턴 (정렬에 있어서 앞에 오고 싶을 때 음수를 내보내면 된다.
     * A = B 인경우 => 0 을 리턴
     * A > B 인경우 => 양수를 리턴
     */
//    @Override
//    public int compareTo(Employee o) {
////        return this.id - o.id;
////        return this.department.compareTo(o.department);
////        return this.name.compareToIgnoreCase(o.name);
//        return this.position.compareToIgnoreCase(o.position);
//    }
}
