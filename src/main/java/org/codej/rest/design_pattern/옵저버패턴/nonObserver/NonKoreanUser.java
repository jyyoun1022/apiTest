package org.codej.rest.design_pattern.옵저버패턴.nonObserver;

public class NonKoreanUser implements NonIUser{

    NonWeatherAPI api; // api 서비스 객체를 합성
    String name;

    public NonKoreanUser(String name, NonWeatherAPI api) {
        this.api = api;
        this.name = name;
    }

    @Override
    public void display() {
        System.out.printf("%s님이 현재 날씨 상태를 조회함 : %.2f°C %.2fg/m3 %.2fhPa\n", name, api.temp, api.humidity, api.pressure);
    }

}
