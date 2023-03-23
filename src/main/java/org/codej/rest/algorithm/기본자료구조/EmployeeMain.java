package org.codej.rest.algorithm.기본자료구조;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) {

        Employee employee1 = Employee.builder()
                .id(1)
                .name("jdk")
                .department("솔루션개발1")
                .position("연구언")
                .sales(new BigInteger("15000"))
                .build();
        Employee employee2 = Employee.builder()
                .id(2)
                .name("jdk15")
                .department("솔루션개발1")
                .position("연구원")
                .sales(new BigInteger("2000"))
                .build();
        Employee employee3 = Employee.builder()
                .id(3)
                .name("jdk17")
                .department("솔루션개발3")
                .position("연구언")
                .sales(new BigInteger("20000"))
                .build();
        Employee employee4 = Employee.builder()
                .id(4)
                .name("jdk17")
                .department("솔루션개발1")
                .position("연구언")
                .sales(new BigInteger("25000"))
                .build();

        List<Employee> list = new ArrayList<>();

        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        list.add(employee4);

        for (Employee employee : list) {
            System.out.println(employee);
        }

        Collections.sort(list);
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::");

        for (Employee employee : list) {
            System.out.println(employee);
        }


        Comparator<Employee> employeeComparator = new Comparator<>(){

            @Override
            public int compare(Employee o1, Employee o2) {
                return o2.getSales().intValue() - o1.getSales().intValue();
            }
        };
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        Collections.sort(list,employeeComparator);
        for (Employee employee : list) {
            System.out.println(employee);
        }
    }
}
