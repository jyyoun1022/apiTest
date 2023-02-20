package org.codej.rest.algorithm.버퍼;

import java.io.*;
import java.util.StringTokenizer;

public class BufferedExam3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();   // 입력을 5 4 로 받음
        StringTokenizer st = new StringTokenizer(str," ");
        int a = Integer.parseInt(st.nextToken());  //5
        int b = Integer.parseInt(st.nextToken());  //4

        String result = "CODE-J";
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(result + "\n");
        bw.newLine();

        bw.flush();
        //bw.newLine();
        bw.write("9");
        bw.write(" ");
        bw.write(String.valueOf(b));
        bw.write(" ");
        bw.write(result);

        bw.flush();
        bw.close();
    }
}
