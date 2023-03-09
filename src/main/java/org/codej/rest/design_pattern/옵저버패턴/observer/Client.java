package org.codej.rest.design_pattern.옵저버패턴.observer;

public class Client {
    public static void main(String[] args) {

        WeatherAPI api = new WeatherAPI();
        api.registerObserver(new KoreanUser("홍길동"));
        api.registerObserver(new KoreanUser("임꺽정"));
        api.registerObserver(new KoreanUser("세종대왕"));
        api.registerObserver(new NorthKoreanUser("김정은"));

        api.measurementsChanges();
        System.out.println("====2번 알림====");
        api.measurementsChanges();
    }
}
