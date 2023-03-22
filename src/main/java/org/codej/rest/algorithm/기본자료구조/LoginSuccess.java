package org.codej.rest.algorithm.기본자료구조;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LoginSuccess {
    public static void main(String[] args) {
        // 아이디 , 패스워드 담긴 배열 id_pw
        // 정보담긴 2차 배열 db
        // 로그인성공(login),실패 리턴(아이디 - fail, 패스워드 wrong ps)

        String[] id_pw = {"meosseugi", "1234"};
        String[][] db = {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};

        String answer = "";

        Map<String, String> map = new HashMap<>();
        for (int i=0; i<db.length; i++) {
            map.put(db[i][0] , db[i][1]);
        }

        if (map.containsKey(id_pw[0])) {
            if (map.get(id_pw[0]).equals(id_pw[1])) {
                answer = "login";
            } else {
                answer = "wrong pw";
            }
        } else {
            answer = "fail";
        }
        System.out.println(answer);

    }
}
