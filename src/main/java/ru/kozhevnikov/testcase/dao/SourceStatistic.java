package ru.kozhevnikov.testcase.dao;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@Data
@Entity
public class SourceStatistic {
    @Id
    private Integer id;
    private String row_r;
    private String col_r;
    private Integer val_r;

    public SourceStatistic() {
    }

}