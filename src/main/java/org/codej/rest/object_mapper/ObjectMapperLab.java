package org.codej.rest.object_mapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObjectMapperLab {
    public static void main(String[] args) throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();
        Map<String, String> map = new HashMap<>();

        map.put("name","steve");
        map.put("age","32");
        map.put("job","baker");

        System.out.println(map);
        /** Object -> json(String) */
        System.out.println(mapper.writeValueAsString(map));// String으로 변환

        System.out.println("==========================================================================");

        /** JSON -> Object(Map<String,String>) */
        String json = "{\"age\" : \"32\" , \"name\" : \"steve\", \"job\" : \"baker\"}";
        Map<String, String> result = mapper.readValue(json, new TypeReference<Map<String, String>>() {});
        System.out.println(result);

        System.out.println("==========================================================================");


        /** List<Map<String,String>> 일 때 JSON으로 변환 */
        // 1. map -> json
        List<HashMap<String, String>> list = new ArrayList<>();
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("name","steve");
        hashMap.put("age","32");
        hashMap.put("job","baker");
        list.add(hashMap);

        System.out.println(mapper.writeValueAsString(list));


        // 2. json -> map
        String json2 = "[{\"age\" : \"32\" , \"name\" : \"steve\", \"job\" : \"baker\"}," +
                "{\"age\" : \"45\" , \"name\" : \"codej\", \"job\" : \"developer\"}]";
        List<HashMap<String, String>> resultList = mapper.readValue(json2, new TypeReference<List<HashMap<String, String>>>() {});
        System.out.println(resultList);
        System.out.println("==========================================================================");

    }
}
