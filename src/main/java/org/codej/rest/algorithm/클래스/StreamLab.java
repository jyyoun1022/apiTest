package org.codej.rest.algorithm.클래스;

import org.hibernate.result.Output;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamLab {
    public static void main(String[] args) throws IOException {
//       basicStream();
//        streamReader();
        bufferTest();


    }
    private static void basicStream() throws IOException {
        /**
         * InputStream 로 입력받는 경우 맨 앞 문자 1개만 출력됨 && int 형태로 입력받음
         */
        InputStream in = System.in;
        OutputStream out = System.out;

        int inputData = in.read(); // input은 read와 연결되어 있기때문에 in.read를 사용

        out.write(inputData); //output 은 write와 연결되어 있기 때문에
        out.flush();    // flush를 써주지 않으면 출력되지 않는다.
        out.close();    // output을 끝내는 메서드
        // 43 를 입력하면 4 밖에 출력이 안된다.
    }
    private static void streamReader() throws IOException {
        /**
         * InputStreamReader 로 입력받는 경우에는 배열을 어떻게 주느냐에 따라 2개 이상의 값을 받을 수 있음.
         * InputStream / OutputStream 은 단 하나의 값 밖에 받지 못한다!.
         */
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);

        OutputStream out = System.out;
        OutputStreamWriter writer = new OutputStreamWriter(out);

        char[] cData = new char[2];
        reader.read(cData);

        int inData = cData[0] - '0';//배열이기 때문에 char로 받은 값을 int로 변환하여 계산하고 싶은 경우 이처럼 사용

        writer.write("입력받은 값 : ");
        writer.write(cData);
        writer.write("\n");
        writer.write("입력받은 첫번째 값 + 10 : ");
        writer.write(inData + 10 +"\n");

        System.out.println("결과 #####");
        writer.flush();
        writer.close();
    }
    private static void basicBuffer(){
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);

        OutputStream out = System.out;
        OutputStreamWriter writer = new OutputStreamWriter(out);

        /**
         * 위의 4줄이 아래의 하나의 줄로 줄어든다.
         * Buffer 객체 생성 시에는 InputStream 과 OutputSream의 합쳐진 형태를 취한다.
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    }
    private static void bufferTest() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine(); // BuffredWriter의 기본형은 String

        int i = Integer.parseInt(s) + 10; // String을 int 로 형변환 후 +10

        br.close();

        bw.write("입력받은 값 ::: "+s+ "\n");//출력
//        bw.newLine(); // 개행
        bw.write("입력받은 값 +10 ::: " +i+"\n");

        bw.flush(); //남은 값 출력  && buffer 초기화
        bw.close();

    }
}
