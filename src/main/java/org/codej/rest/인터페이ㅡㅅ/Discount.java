package org.codej.rest.인터페이ㅡㅅ;

public interface Discount {
    void discount();
}

class Vip implements Discount{
    private int money;
    @Override
    public void discount() {
        double payment = money * 0.9;
    }
}
class Basic implements Discount{
    private int money;

    @Override
    public void discount() {
        int payment = money - 1000;
    }
}
