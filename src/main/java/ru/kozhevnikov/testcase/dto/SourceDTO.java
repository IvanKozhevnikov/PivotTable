package ru.kozhevnikov.testcase.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SourceDTO {

    private String row;
    private String col;
    private Integer val;
}
