package org.codej.rest.algorithm.기본자료구조;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class ProtectedClass {

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    protected class Access {
        public String name;
        public int age;

    }
}
