package org.codej.rest.algorithm.스프링빈생명주기;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class ComponentB {
    public ComponentB() {
        System.out.println("ComponentB : 생성자");
    }

    @PostConstruct
    public void init() {
        System.out.println("ComponentB : init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("ComponentB : destroy");
    }
}
