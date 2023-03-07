package org.codej.rest.인터페이ㅡㅅ;

public interface Car {
    void run();
    void 시동();
    void 충전();
}
class LpgCar implements Car {
    @Override
    public void run() {
        System.out.println("시끄럽게 달림");
    }

    @Override
    public void 시동() {
        System.out.println("키를 꽂아서");

    }

    @Override
    public void 충전() {
        System.out.println("LPG");
    }
}
class ElectronicCar implements Car{
    @Override
    public void run() {
        System.out.println("조용히");
    }

    @Override
    public void 시동() {
        System.out.println("버튼");
    }

    @Override
    public void 충전() {
        System.out.println("전기");

    }
}
