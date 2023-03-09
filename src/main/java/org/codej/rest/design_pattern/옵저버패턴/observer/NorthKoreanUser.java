package org.codej.rest.design_pattern.옵저버패턴.observer;

public class NorthKoreanUser implements Observer{
    String name;

    public NorthKoreanUser(String name) {
        this.name = name;
    }

    @Override
    public void display(WeatherAPI api) {
        System.out.printf("%s님이 현재 날씨 상태를 조회함 : %.2f°C %.2fg/m3 %.2fhPa\n", name, api.temp, api.humidity, api.pressure);
    }
}
