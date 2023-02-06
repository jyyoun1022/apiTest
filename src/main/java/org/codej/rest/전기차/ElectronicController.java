package org.codej.rest.전기차;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
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
public class ElectronicController {

    private final ElectRequestUtils electRequestUtils;

    @GetMapping("/api/v1/electronic-info")
    public ResponseEntity<?> electronicInfoAPI (@RequestParam("addr") String addr,
                                                @RequestParam(value = "pageNum",required = false) String pageNum) {

        log.info("Address ::: {}",addr);
        log.info("PageNum ::: {}",pageNum);

        List<Map> responseArr = new ArrayList<>();
        try {
            Map<String, Object> chargeMap = electRequestUtils.electronicCharger(addr, pageNum);
            return new ResponseEntity<>(chargeMap,HttpStatus.OK);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
}
