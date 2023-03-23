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
                .name("jdk17")
                .department("솔루션개발1")
                .position("연구언")
                .sales(new BigInteger("15000"))
                .price(5000)
                .build();
        Employee employee2 = Employee.builder()
                .id(2)
                .name("jdk17")
                .department("솔루션개발1")
                .position("연구원")
                .sales(new BigInteger("2000"))
                .price(3000)
                .build();
        Employee employee3 = Employee.builder()
                .id(3)
                .name("jdk17")
                .department("솔루션개발3")
                .position("연구언")
                .sales(new BigInteger("25000"))
                .price(2000)
                .build();
        Employee employee4 = Employee.builder()
                .id(4)
                .name("jdk17")
                .department("솔루션개발1")
                .position("연구언")
                .sales(new BigInteger("25000"))
                .price(8000)
                .build();

        List<Employee> list = new ArrayList<>();

        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        list.add(employee4);

        for (Employee emp : list) {
            System.out.println(emp);
        }
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::");

        list.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                System.out.println("_______");
                System.out.println(o1.getPrice());
                System.out.println(o2.getPrice());
                if(o1.getName() == o2.getName()){
                    if (o1.getPrice() < o2.getPrice()){
                        System.out.printf("o1 < o2");
                        System.out.println(o1.getPrice() < o2.getPrice());
                        return -1;
                    }
                    else if(o1.getPrice() > o2.getPrice()) {
                        System.out.printf("o1 > o2");
                        System.out.println( o1.getPrice() < o2.getPrice());

                        return 1;
                    }
                    else return 0;
                } else {
                    return o1.getPrice() - o2.getPrice();
                }
            }
        });
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::");

        for (Employee employee : list) {
            System.out.println(employee.getPrice());
        }

    }
}
