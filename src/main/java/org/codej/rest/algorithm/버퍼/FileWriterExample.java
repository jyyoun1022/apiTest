package org.codej.rest.algorithm.버퍼;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        File file = new File("/Users/YOUNJY/test.txt");

        try (BufferedWriter br = new BufferedWriter(new FileWriter(file))) {
            br.append("This is Append \n");
            br.append("That's append \n");
            br.append("That's append \n");
            br.append("Please \n");
            br.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
