package org.codej.rest.design_pattern.데코레이터패턴;

//작식자 클래스
public class ComponentDecorator1 extends Decorator{

    public ComponentDecorator1(IComponent component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();//원본 객체를 상위 클래스의 위임을 통해 실행하고
        extraOperation();// 장식 클래스만의 메서드를 실행한다.
    }
    void extraOperation(){

    }
}
