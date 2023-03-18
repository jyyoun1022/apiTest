package org.codej.rest.algorithm.큐;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public interface Animal {

    int legs();
    int swimming();
}

class Lion implements Animal{

    @Override
    public int legs() {
        return 4;
    }

    @Override
    public int swimming() {
        return 0;
    }
    public void testing(){

    }
}
class Test {
    public static void main(String[] args) {
        Lion lion = new Lion();
        int lionLeg = lion.legs();
        System.out.println("lionLeg = " + lionLeg);
        Animal animal = new Lion();
        int legs = animal.legs();
        System.out.println(legs);
        PageRequest of = PageRequest.of(0, 10);
        Sort sort = of.getSort();
        Pageable of1 = PageRequest.of(0, 10);



    }
}
