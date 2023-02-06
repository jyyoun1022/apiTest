package org.codej.rest.전기차;


import lombok.extern.slf4j.Slf4j;
import org.codej.rest.Utils;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.Map;

@Component
@Slf4j
public class ElectRequestUtils {

    private static final String serviceKey = "QAsfP%2FxWECPkf5lLuZTxUoJeeATt9iF59CtizUl7Trtgm%2F1I%2BKf%2FB%2B0rqSFKjzpF%2FEWybkM0OcofTFMWUUPU7Q%3D%3D";

    public Map<String,Object> electronicCharger(String addr,String pageNum) throws IOException {
        StringBuilder urlBuilder = new StringBuilder("http://openapi.kepco.co.kr/service/EvInfoServiceV2/getEvSearchList");
        urlBuilder.append("?" + URLEncoder.encode("ServiceKey", Charset.forName("UTF-8")) + "=" + serviceKey);
        urlBuilder.append("&" + URLEncoder.encode("pageNo",Charset.forName("UTF-8")) + "=" + pageNum);
        urlBuilder.append("&" + URLEncoder.encode("numOfRows",Charset.forName("UTF-8")) + "=" + "10");
        urlBuilder.append("&" +URLEncoder.encode("addr",Charset.forName("UTF-8")) + "=" + URLEncoder.encode(addr,Charset.forName("UTF-8")));

        URL url = new URL(urlBuilder.toString());
        log.info("Request URL ::: {}",url);

        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-type","application/json");

        log.info("Response StatusCode ::: {}",conn.getResponseCode());
        log.info("Response Message ::: {}",conn.getResponseMessage());

        BufferedReader br;
        if (conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } else {
            br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        }

        StringBuilder result = new StringBuilder();
        String line;
        System.out.println("========");

        while ((line = br.readLine()) != null) {
            result.append(line);
        }

        log.info("Result ::: {}",result.toString());

        br.close();
        conn.disconnect();

        return Utils.stringToMap(result.toString());
    }
}
