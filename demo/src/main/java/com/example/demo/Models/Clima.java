package com.example.demo.Models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter  @ToString  @EqualsAndHashCode
public class Clima {

    private String estado;
    private Integer temperaturaMax;
    private Integer temperaturaMin;
}
