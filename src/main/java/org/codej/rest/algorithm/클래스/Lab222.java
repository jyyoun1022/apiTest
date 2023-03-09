package org.codej.rest.algorithm.클래스;

import java.util.HashMap;
import java.util.Map;

public class Lab222 {
    public static void main(String[] args) {
        Object[] keys = {"둘리", "고길동", "또치", "도우너", "마이콜"};
        Object[] values = {"010-1234-5678", "010-5251-3547",
                "010-1234-5679", "010-5251-3548", "010-5251-3550"};
        Map<Object,Object> phoneList = new HashMap();
        for (int i = 0; i < values.length; i++) {
            phoneList.put(keys[i], values[i]);
        }
        System.out.println(phoneList); //키는 세트로 되어 있다... 햄버거세트... 순서가 있는가?
        //keySet 가져와서 출력, values 가져와서 출력.
        //또치 전화번호 출력
        System.out.println("====keySet 출력====");

        for (Object key : phoneList.keySet()) {
            System.out.println(key);
        }
        System.out.println("====values 출력====");

        for (Object value : phoneList.values()) {
            System.out.println(value);
        }
        System.out.println("====또치 전화번 호 출력====");
        for (Map.Entry<Object, Object> entry : phoneList.entrySet()) {
            if (entry.getKey() == "또치") {
                System.out.println(entry.getValue());
            }
        }


    }
}
