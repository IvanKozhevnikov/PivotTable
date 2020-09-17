package ru.kozhevnikov.testcase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kozhevnikov.testcase.dao.Source;

import java.util.List;

public interface SourceRepository extends JpaRepository<Source, Integer> {

    List<Source> findAllByTaxGroupA(String taxGroup);

    //    @Query( "SELECT " +
//            "    new ru.kozhevnikov.dao.SourceStatistic(ds.row, ds.col, COUNT(ds)) " +
//            "FROM " +
//            " source_data AS ds " +
//            "GROUP BY " +
//            "ds.districtRfC, ds.regionRfD")

}