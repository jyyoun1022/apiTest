package org.codej.rest.design_pattern.데코레이터패턴;

public class Client {
    public static void main(String[] args) {
        //1. 원본 객체 생성
        ConcreteComponent obj = new ConcreteComponent();

        //2. 장식 1하기
        ComponentDecorator1 deco1 = new ComponentDecorator1(obj);
        deco1.operation();

        //3. 장식 2 하기
        ComponentDecorator2 deco2 = new ComponentDecorator2(obj);
        deco2.operation();

        //4. 장식 1+ 2 하기
        IComponent deco3 = new ComponentDecorator1(new ComponentDecorator2(obj));

    }
}
