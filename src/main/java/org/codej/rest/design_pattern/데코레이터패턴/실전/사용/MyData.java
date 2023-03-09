package org.codej.rest.design_pattern.데코레이터패턴.실전.사용;

public class MyData implements IData {

    private int data;

    @Override
    public void setData(int data) {
        this.data = data;
    }

    @Override
    public int getData() {
        return data;
    }
}
