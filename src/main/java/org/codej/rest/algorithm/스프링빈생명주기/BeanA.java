package org.codej.rest.algorithm.스프링빈생명주기;

public class BeanA {
    public BeanA() {
        System.out.println("Bean A : 생성자");
    }
    public void init() {
        System.out.println("BeanA : init");
    }

    public void destroy() {
        System.out.println("BeanA : destroy");
    }
}
