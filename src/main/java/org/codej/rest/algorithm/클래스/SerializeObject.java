package org.codej.rest.algorithm.클래스;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SerializeObject implements Serializable {
    private String name;
    private int age;
    private transient String address;

}
