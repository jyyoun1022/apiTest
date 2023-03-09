package org.codej.rest.design_pattern.데코레이터패턴.실전.사용;

public class MyDataDecorator implements IData{

    private IData mydataObj; // 최상위 인터페이스 타입으로 장식할 원본 객체 선언

    public MyDataDecorator(IData mydataObj) {
        this.mydataObj = mydataObj;
    }

    @Override
    public void setData(int data) {
        this.mydataObj.setData(data);
    }

    @Override
    public int getData() {
        return mydataObj.getData();
    }
}
