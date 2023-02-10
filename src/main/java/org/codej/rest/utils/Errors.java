package org.codej.rest.utils;

import java.util.HashMap;

public class Errors {
    public static final int UNDEFINED_ERROR = 20000;
    public static final int NOT_AUTHENTICATED = 29999;
    public static final int NOT_AUTHORIZED = 30000;

    private static HashMap<Integer,String> myTable = new HashMap<>();

    static {
        myTable.put(UNDEFINED_ERROR, "정의되지 않은 데이터 에러가 발생하였습니다.");
        myTable.put(NOT_AUTHENTICATED,"인증 정보가 없습니다.");
        myTable.put(NOT_AUTHORIZED,"권한이 없습니다.");
    }

    public static String getMessage(int code) {
        if (myTable.containsKey(code)) {
            String message = myTable.get(code);
            return message.replace("_","").toLowerCase();
        } else {
            return myTable.get(UNDEFINED_ERROR) + "-" + code;
        }
    }

    public static String getMessage(int code, String str) {
        if (myTable.containsKey(code)) {
            String message = myTable.get(code);
            return message.replace("{0}",str).toLowerCase();
        } else {
            return myTable.get(UNDEFINED_ERROR) + "-" + code;
        }
    }
}
