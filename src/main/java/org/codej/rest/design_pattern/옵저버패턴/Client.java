package org.codej.rest.design_pattern.옵저버패턴;

public class Client {
    public static void main(String[] args) {
        // 발행자 등록
        ConcreteSubject publisher = new ConcreteSubject();

        //발행자를 구독할 관찰자들 리스트로 등록
        ObserverA observerA = new ObserverA();
        ObserverB observerB = new ObserverB();
        publisher.registerObserver(observerA);
        publisher.registerObserver(observerB);

        //관찰자에게 이벤트 전파
        publisher.notifyObserver();

        //ObserverB가 구독 취소
        publisher.removeObserver(observerB);

        //ObserverA 만 이벤트 전파
        publisher.notifyObserver();
    }
}
