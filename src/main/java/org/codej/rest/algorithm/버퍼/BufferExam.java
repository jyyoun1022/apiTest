package org.codej.rest.algorithm.버퍼;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferExam {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String str = br.readLine();
            int a = Integer.parseInt(str);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
