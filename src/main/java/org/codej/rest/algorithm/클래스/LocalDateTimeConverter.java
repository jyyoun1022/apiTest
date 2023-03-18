package org.codej.rest.algorithm.클래스;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeConverter {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("LocalDateTime ::: "+now);
        String format = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println("Change ::: " +format);

    }
}
