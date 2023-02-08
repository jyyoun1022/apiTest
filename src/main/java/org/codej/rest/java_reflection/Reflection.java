package org.codej.rest.java_reflection;

public class Reflection {
    public static void main(String[] args) throws ClassNotFoundException {

        String exampleA = "Hello";
        //  1) 인스턴스를 통해서 읽기
        String exampleB = new String("Hello");

        Class<? extends String> c1 = exampleB.getClass();
        Class<? extends String> c2 = exampleA.getClass();
        // <?> : 어떤 종류의 클래스든 다 얻어올 수 있다는 약어
        //  인스턴스만 있으면 그 인스턴스가 어떤 클래스의 객체인지 쉽게 알아낼 수 있다.
        System.out.println(c1);
        System.out.println(c2);
        //  2) class.forName() 메서드를 통해서 얻기
        Class<?> c3 = Class.forName("java.lang.String");
        // 아규먼트가 가리키는 문자열이 없을 수 있기 때문에 예외처리가 필요함
        //  클래스 이름을 문자열로 받을 수 있기 때문에 유지보수가 쉽다.
        System.out.println(c3);`
        //  3. 모든 클래스에 내장된 'class'  스태틱ㅊ 변수를 통해서 얻기

        // 34. 먿,ㄴ 싱허ㅣㅇ
        Class<String> c4 = String.class;
        System.out.println(c4);
    }
}
class Test02 {
    public static void main(String[] args) {
        Class<?> c1 = String.class;

        System.out.println(c1.getName());
        System.out.println(c1.getSimpleName());
        System.out.println(c1.getCanonicalName());
    }
}

