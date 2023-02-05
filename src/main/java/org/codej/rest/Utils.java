package org.codej.rest;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.codej.rest.기상청.ResponseApi;

import java.io.IOException;
import java.util.Map;

@Slf4j
public class Utils {
    public static Map<String,Object> stringToMap(String json) {
        ObjectMapper mapper = new ObjectMapper();
        Map<String,Object> map = null;

        try {
            map = mapper.readValue(json,Map.class);
            log.info("MAP ::: {}",map);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }

    public static ResponseApi convertResponse(Map<String,Object> map){
        ObjectMapper ob = new ObjectMapper();
        ResponseApi responseApi = ob.convertValue(map, ResponseApi.class);
        return responseApi;

    }
}
