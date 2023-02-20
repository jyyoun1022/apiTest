package org.codej.rest.algorithm.ENUM;

public enum BrandName {
        NIKE("나이키"), ADIDAS("아디다스"), PUMA("퓨마");
        final private String name;
        public String getName() {
                return name;
        }
         BrandName(String name){
                this.name = name;
        }
}
