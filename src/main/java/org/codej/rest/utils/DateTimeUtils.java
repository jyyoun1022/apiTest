package org.codej.rest.utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeUtils {
    public static String convertDateFormat(String date, String fromPattern, String toPattern) {
        LocalDate convertedDate = LocalDate.parse(date, DateTimeFormatter.ofPattern(fromPattern));
        return convertedDate.format(DateTimeFormatter.ofPattern(toPattern));
    }

    public static String convertDateTimeFormat(String date, String fromPattern, String toPattern) {
        LocalDateTime convertDateTime = LocalDateTime.parse(date, DateTimeFormatter.ofPattern(fromPattern));
        return convertDateTime.format(DateTimeFormatter.ofPattern(toPattern));
    }
    // 사용법 : DataTimeUtils.convertDateTimeFormat(Object,"yyyy-MM-dd HH:mm:ss" ,"yyyy-MM-dd HH:mm");





}
