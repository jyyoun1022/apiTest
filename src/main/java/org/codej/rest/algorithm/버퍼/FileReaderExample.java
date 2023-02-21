package org.codej.rest.algorithm.버퍼;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class FileReaderExample {
    static String line;
    public static void main(String[] args) {
        File file = new File("/Users/YOUNJY/test.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(file))){
//            String line;
//            while((line = br.readLine()) != null) {
//                System.out.println(line);
//            }
            //BufferdReader.lines()는 파일의 모든 라인의 문자열들을 Stream 으로 리턴
            List<String> stringList = br.lines().filter(i ->i.toUpperCase().contains("append")).collect(Collectors.toList());
            for(String str : stringList) {
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
