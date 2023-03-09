package org.codej.rest.design_pattern.옵저버패턴;

import lombok.ToString;

public class ObserverA implements IObserver{
    @Override
    public void update() {
        System.out.println("ObserverA 에게 이벤트 알림이 왔습니다.");
    }

    @Override
    public String toString() {
        return "ObserverA";
    }
}
