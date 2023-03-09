package org.codej.rest.design_pattern.데코레이터패턴.실전;

public class Client {
    public static void main(String[] args) {
        SynchronizedData data = new SynchronizedData();
        data.setData(1);
        System.out.println(data.getData());
    }
}
