package org.codej.rest.JPA;

public interface InterfaceTest {
    private void ds(){
    }
    public abstract void a();
    default void mai(){
        String a = "2";
    }
    static void as(){
        String a = "";
    }
}
class ini implements InterfaceTest{
    @Override
    public void a() {

    }

    @Override
    public void mai() {
        InterfaceTest.super.mai();
    }

    public static void main(String[] args) {
        ini ini = new ini();
    }
}
