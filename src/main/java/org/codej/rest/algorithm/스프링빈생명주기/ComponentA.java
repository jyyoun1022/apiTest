package org.codej.rest.algorithm.스프링빈생명주기;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class ComponentA {
    public ComponentA() {
        System.out.println("ComponentA : 생성자");
    }

    @PostConstruct
    public void init() {
        System.out.println("ComponentA : init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("ComponentA : destroy");
    }
}
