package org.codej.rest.design_pattern.데코레이터패턴.실전.사용;

import org.codej.rest.design_pattern.데코레이터패턴.실전.SynchronizedData;

public class Client {
    public static void main(String[] args) {
        // 동시성이 필요 없을 때
        MyData data = new MyData();

        //동시성이 필요할 때
        IData dataSync = new SynchronizedDecorator(data);
        dataSync.setData(1);
        System.out.println(dataSync.getData());
    }
}
