package org.codej.rest.기상청;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResponseApi {
    private String dateKind;
    private String dateName;
    private String isHoliday;
    private String locdate;
    private String seq;

}

