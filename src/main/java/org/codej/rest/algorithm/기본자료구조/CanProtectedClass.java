package org.codej.rest.algorithm.기본자료구조;

public class CanProtectedClass {
    public static void main(String[] args) {
        ProtectedClass.Access access = new ProtectedClass().new Access();

    }
}
