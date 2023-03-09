package org.codej.rest.algorithm.클래스;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeObjectTest {


    public static void main(String[] args) {
        String fileName = "SerializeObject2.obj";
        try(
                FileInputStream fis = new FileInputStream(fileName);
                ObjectInputStream in = new ObjectInputStream(fis);
        ) {
            // 바이트 스트림을 다시 자바 객체로 변환 (이때 캐스팅이 필요)
            SerializeObject deserializedCustomer = (SerializeObject) in.readObject();
            System.out.println(deserializedCustomer);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
