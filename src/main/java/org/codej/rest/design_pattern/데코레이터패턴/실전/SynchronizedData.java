package org.codej.rest.design_pattern.데코레이터패턴.실전;

public class SynchronizedData extends MyData{
    private int data;

    @Override
    public int getData() {
        synchronized (this){
            return  data;
        }
    }

    @Override
    public void setData(int data) {
        synchronized (this){
            this.data = data;
        }
    }
}
