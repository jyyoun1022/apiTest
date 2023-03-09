package org.codej.rest.design_pattern.데코레이터패턴.실전.사용;

public class SynchronizedDecorator extends MyDataDecorator{
    SynchronizedDecorator(IData mydataObj) {
        super(mydataObj);
    }

    @Override
    public void setData(int data) {
        synchronized (this) {
            System.out.println("동기화된 data 처리를 시작합니다.");
            super.setData(data); // 부모 메서드를 호출함으로써 자신을 감싸고 있는 장식자의 메서드를 호출
            System.out.println("동기화된 data를 처리를 완료하였 습니다.");
        }
    }

    @Override
    public int getData() {
        synchronized (this) {
            System.out.println("동기화된 data 처리를 시작합니다.");
            int result = super.getData();
            System.out.println("동기화된 data를 처리를 완료하였 습니다.");
            return result;
        }
    }
}
