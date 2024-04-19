package com.project.dummy.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class DummyDto {
    @JsonProperty("id")
    private int id;
    @JsonProperty("name")
    private String name;
}
