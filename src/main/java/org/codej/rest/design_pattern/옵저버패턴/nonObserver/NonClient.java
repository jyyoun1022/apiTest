package org.codej.rest.design_pattern.옵저버패턴.nonObserver;

import java.util.ArrayList;
import java.util.List;

public class NonClient {
    public static void main(String[] args) {
        NonWeatherAPI api = new NonWeatherAPI();

        List<NonIUser> users = new ArrayList<>();

        users.add(new NonKoreanUser("홍길동",api));
        users.add(new NonKoreanUser("세종대왕",api));
        users.add(new NonKoreanUser("임꺽정",api));

        // 온습도기에서 현재 상태의 온습도 정보가 갱신
        api.measurementsChanges();

        for (NonIUser user : users) {
            user.display();
        }

        api.measurementsChanges();
    }
}
