package org.codej.rest.design_pattern.옵저버패턴;

//관찰 대상자 / 발행자
public interface IsSubject {

    void registerObserver(IObserver o);
    void removeObserver(IObserver o);
    void notifyObserver();
}
