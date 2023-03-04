package org.codej.rest.algorithm.문자열;

public class ImmutableTest {
    private final String username;
    private int age;

    public ImmutableTest(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
      return this.username;
    }

    public static void main(String[] args) {
        String username ="홍길동";
        ImmutableTest immutableTest = new ImmutableTest(username);
        username = new String("둘리");
        System.out.println(immutableTest);
    }
}
