package ru.kozhevnikov.testcase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kozhevnikov.testcase.dao.Source;

import java.util.List;

public interface SourceRepository extends JpaRepository<Source, Integer> {

    List<Source> findAllByTaxGroupA(String taxGroup);
}