package org.codej.rest.algorithm.스프링빈생명주기;

public class BeanB {
    public BeanB() {
        System.out.println("BeanB : 생성자");
    }

    public void init() {
        System.out.println("BeanB : init");
    }

    public void destroy() {
        System.out.println("BeanB : destroy");
    }
}
