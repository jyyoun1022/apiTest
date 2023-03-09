package org.codej.rest.algorithm.클래스;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeObjectTest {
    public static void main(String[] args) {
        // 직렬화할 객체
        SerializeObject object = new SerializeObject("codej", 28, "동성로128-4");
        // 외부 파일명
        String fileName = "SerializeObject2.obj";

        // 파일 스트림 객체 생성 (try with resource)
        try (
                FileOutputStream fos = new FileOutputStream(fileName);
                ObjectOutputStream out = new ObjectOutputStream(fos)
        ) {
            // 직렬화 가능 객체를 바이트 스트림으로 변환하고 파일에 저장
            out.writeObject(object);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
