package org.codej.rest.design_pattern.데코레이터패턴;

// 장식자 추상 클래스
public abstract class Decorator implements IComponent{

    IComponent wrappee; // 원본 객체 Composition

    public Decorator(IComponent wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void operation() {
        wrappee.operation();// 위임
    }
}
