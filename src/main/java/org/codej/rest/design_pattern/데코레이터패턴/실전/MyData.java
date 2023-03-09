package org.codej.rest.design_pattern.데코레이터패턴.실전;

public class MyData {
    private int data;

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }
}
//Data 클래스를 멀티쓰레드 환경에서도 사용할 수 있도록 동기화(syncronized) 처리를 해주고 싶다고 가정해보자.
