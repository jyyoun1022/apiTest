package org.codej.rest.기상청;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.Charset;

@Slf4j
public class Lab {
    public static void main(String[] args) throws IOException {
        String serviceKey ="QAsfP%2FxWECPkf5lLuZTxUoJeeATt9iF59CtizUl7Trtgm%2F1I%2BKf%2FB%2B0rqSFKjzpF%2FEWybkM0OcofTFMWUUPU7Q%3D%3D";

        StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/1360000/WthrChartInfoService/getSurfaceChart");
        urlBuilder.append("?" + URLEncoder.encode("serviceKey", Charset.forName("UTF-8")) + "=" + serviceKey);
        urlBuilder.append("&" + URLEncoder.encode("pageNo",Charset.forName("UTF-8")) + "=" + "1");
        urlBuilder.append("&" + URLEncoder.encode("numOfRows",Charset.forName("UTF-8")) + "=" + "10");
        urlBuilder.append("&" + URLEncoder.encode("dataType",Charset.forName("UTF-8")) + "=" + URLEncoder.encode("json", Charset.forName("UTF-8"))); /*요청자료형식(XML/JSON)*/
        urlBuilder.append("&" + URLEncoder.encode("code",Charset.forName("UTF-8")) + "=" + URLEncoder.encode("24", Charset.forName("UTF-8"))); /*지상코드*/
        urlBuilder.append("&" + URLEncoder.encode("time",Charset.forName("UTF-8")) + "=" + URLEncoder.encode("20230205", Charset.forName("UTF-8"))); /*년월일(YYYYMMDD)*/

        URL url = new URL(urlBuilder.toString());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-type","application/json");

        log.info("STATUA-CODE ::: {}",conn.getResponseCode());

        BufferedReader rd;
        if (conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } else {
            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
        }

        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }
        rd.close();
        conn.disconnect();
        log.info("Service Result ::: {} " +sb.toString());

    }
}
