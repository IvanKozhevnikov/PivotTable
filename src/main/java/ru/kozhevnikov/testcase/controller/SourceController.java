package ru.kozhevnikov.testcase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.kozhevnikov.testcase.dto.SourceDTO;
import ru.kozhevnikov.testcase.service.SourceService;

import java.util.List;

@RestController
@RequestMapping("/")
public class SourceController {

    private SourceService sourceService;

    @Autowired
    public SourceController(SourceService sourceService) {
        this.sourceService = sourceService;
    }

    @GetMapping(path = "{row}&{col}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<SourceDTO>> getAllByTaxGroup(@PathVariable String col, @PathVariable String row){
        return new ResponseEntity(sourceService.makePivotTable(row, col), HttpStatus.OK);
    }
}
