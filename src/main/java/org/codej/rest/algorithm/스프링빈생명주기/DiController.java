package org.codej.rest.algorithm.스프링빈생명주기;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor

public class DiController {

    private final BeanA beanA;
    private final BeanB beanB;
    private final ComponentA componentA;
    private final ComponentB componentB;

    @PostConstruct
    public void init() {
        System.out.println("DiController : init");
    }

    @RequestMapping("/")
    public String index() {
        return "hello world";
    }

    @PreDestroy
    public void destroy() {
        System.out.println("DiController : destroy");
    }
}
