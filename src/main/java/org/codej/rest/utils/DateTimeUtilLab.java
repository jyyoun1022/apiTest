package org.codej.rest.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTimeUtilLab {
    public static void main(String[] args) throws ParseException {
        /** LocalDateTime -> String
         *  yyyy-MM-dd HH:mm:ss -> yyyy-MM-dd*/
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        String result = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println(result);
        /** String -> LocalDateTime */
        String stringDate ="20230206112345";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        LocalDateTime dateTimeResult = LocalDateTime.parse(stringDate, formatter);
        System.out.println(dateTimeResult);
        /** LocalDateTime -> String */
        String timeToString = dateTimeResult.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println(timeToString);
        System.out.println("=====");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birth = sdf.parse(dateTimeResult.toString());
        System.out.println(birth);
        String processDate = new SimpleDateFormat("yyyyMMdd").format(birth);
        System.out.println(processDate);

    }
}
