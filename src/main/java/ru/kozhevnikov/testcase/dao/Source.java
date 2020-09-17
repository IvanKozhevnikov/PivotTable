package ru.kozhevnikov.testcase.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "source_data")
public class Source {

    @Id
    private Integer rowid;

    @Column(name = "a")
    private String taxGroupA;

    @Column(name = "b")
    private String taxSubGroupB;

    @Column(name = "c")
    private String districtRfC;

    @Column(name = "d")
    private String regionRfD;

    @Column(name = "y")
    private String year;

    @Column(name = "v")
    private String value;

}
