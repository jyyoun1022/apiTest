package org.codej.rest.Reflection;

public class Parent {
    private String str1 = "1";
    public String str2 = "2";

    public Parent() {
    }

    private void method1(){
        System.out.println("method1");
    }

    public void method2(int n){
        System.out.println("method1"+n);
    }
    public void method3(){
        System.out.println("method3");
    }
}
