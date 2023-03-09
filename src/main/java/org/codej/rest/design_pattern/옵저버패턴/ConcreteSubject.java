package org.codej.rest.design_pattern.옵저버패턴;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements IsSubject{

    //관찰자들을 등록하여 담는 리스트
    List<IObserver> observers = new ArrayList<>();

    //관찰자를 리스트에 등록
    @Override
    public void registerObserver(IObserver o) {
        observers.add(o);
        System.out.println(o + " 구독 완료");
    }

    //관찰자를 리스트에서 제거
    @Override
    public void removeObserver(IObserver o) {
        observers.remove(o);
        System.out.println(o + " 구독 취소");
    }
    //관찰자에게 이벤트 송신
    @Override
    public void notifyObserver() {
        for (IObserver o : observers) { // 관찰자 리스트 순회
            o.update();// 위임
        }
    }
}
