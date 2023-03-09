package org.codej.rest.design_pattern.데코레이터패턴.실전.사용;

public class AnotherSkillDecorator extends MyDataDecorator {
    private IData mydataObj;

    AnotherSkillDecorator(IData mydataObj) {
        super(mydataObj);
    }

}