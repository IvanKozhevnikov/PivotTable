package ru.kozhevnikov.testcase.service;

import ru.kozhevnikov.testcase.dto.SourceDTO;

import java.util.List;

public interface SourceService {

    List<SourceDTO> makePivotTable(String row, String col);
}

