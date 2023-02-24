package org.codej.rest.algorithm.스프링빈생명주기;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfig{

    @Bean(name = "beanA", initMethod = "init", destroyMethod = "destroy")
    public BeanA getBeanA() {
        return new BeanA();
    }

    @Bean(name = "beanB", initMethod = "init", destroyMethod = "destroy")
    public BeanB getBeanB() {
        return new BeanB();
    }
}
