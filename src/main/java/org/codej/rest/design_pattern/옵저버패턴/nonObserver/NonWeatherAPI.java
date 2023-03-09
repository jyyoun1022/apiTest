package org.codej.rest.design_pattern.옵저버패턴.nonObserver;

import java.util.Random;

public class NonWeatherAPI {
    public float temp;       //온도
    public float humidity;   //습도
    public float pressure;   //기압

    void measurementsChanges(){
        // 현재의 온습도 데이터를 랜덤값으로 얻는 것으로 비유
        temp = new Random().nextFloat() * 100;;
        humidity = new Random().nextFloat() * 100;;
        pressure = new Random().nextFloat() * 100;;
    }
}
