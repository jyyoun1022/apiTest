package org.codej.rest.기상청;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.codej.rest.Utils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@Slf4j
@RequiredArgsConstructor
public class MyController {

    private final RequestUtils requestUtils;

    //Java 객체를 JSON으로 serialization 하기 위해서는 ObjectMapper의 writeValue() 메서드를 이용한다.

    @GetMapping("/api/v1/holiday-info")
    public ResponseEntity<ResponseApi> holidayInfoAPI (@RequestParam("year")String year,
                                                       @RequestParam("month")String month){
        log.info("REQUEST YEAR ::: {}",year);
        log.info("REQUEST MONTH ::: {}",month);

        List<Map> responseHolidayArr = new ArrayList<>();

        try {
            Map<String, Object> holidayMap = requestUtils.holidayInfoAPI(year, month);
            Map<String, Object> response = (Map<String, Object>) holidayMap.get("response");
            log.info("RES:::::::::::::{}",response);
            Map<String, Object> body = (Map<String, Object>) response.get("body");
            log.info("BODY  :::  {}",body);

            int totalCount = (int)body.get("totalCount");
            if (totalCount <= 0){
                log.info("공휴일 없음");
            }
            if (totalCount == 1){
                Map<String, Object> items = (Map<String, Object>) body.get("items");
                Map<String, Object> item = (Map<String, Object>) items.get("item");
                responseHolidayArr.add(item);
                ResponseApi result = Utils.convertResponse(item);
                log.info("ITEM  ::: {}",item);
                return new ResponseEntity<>(result,HttpStatus.OK);

            }

            if (totalCount > 1){
                Map<String, Object> items = (Map<String, Object>) body.get("items");
                List<Map<String, Object>> item = (List<Map<String, Object>>) items.get("item");

                for (Map<String, Object> itemMap : item) {
                    log.info("ITEM-MAP ::: {}", itemMap);
                    responseHolidayArr.add(itemMap);
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ResponseEntity(responseHolidayArr, HttpStatus.OK);
    }
    @GetMapping("/api/v11/weather-info")
    public ResponseEntity<?> weatherInfo(String code,String date) throws IOException {
        /** response -> body -> items -> item */

        try {
            Map<String, Object> weatherMap = requestUtils.weatherInfo(code, date);
            Map<String, Object> bodyMap = (Map<String, Object>) weatherMap.get("response");
            Map<String, Object> response = (Map<String, Object>) bodyMap.get("body");
            int totalCount = (int) response.get("totalCount");
            log.info("TOTAL ::: {}",totalCount);
            if (totalCount <= 0) {
                log.info("정보가 존재하지 않습니다.");
                return new ResponseEntity<>("정보가 존재하지 않습니다. \n코드 종류는 3,12,24 입니다.",HttpStatus.NOT_FOUND);
            } else if (totalCount == 1) {
                Map<String, Object> items = (Map<String, Object>) response.get("items");
                List<Map<String, Object>> item = (List<Map<String, Object>>) items.get("item");
                Map<String, Object> result = item.get(0);
                return new ResponseEntity<>(result,HttpStatus.OK);
            } else {
                Map<String, Object> items = (Map<String, Object>) response.get("items");
                List<Map<String, Object>> item = (List<Map<String, Object>>) items.get("item");
                for (Map<String, Object> itemMap : item) {
                    log.info("ITEM_MAP ::: {}",itemMap);
                }
                return new ResponseEntity<>(item,HttpStatus.OK);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }
}
