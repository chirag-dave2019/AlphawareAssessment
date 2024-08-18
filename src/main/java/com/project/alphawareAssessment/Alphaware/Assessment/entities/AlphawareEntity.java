package com.project.alphawareAssessment.Alphaware.Assessment.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "alphaware_table")
public class AlphawareEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;

    private String name;
    private Long areaSqKm;

    private  Long population;

    private Integer countries;

    @ElementCollection
    @CollectionTable(name = "lines_table")
    @Column(name = "line_name")
    private List<String> lines;

    @ElementCollection
    @CollectionTable(name = "oceans")
    @Column(name = "oceans_table")
    private List<String> oceans;

    @ElementCollection
    @CollectionTable(name = "developed_countries_table")
    @Column(name= "developed_countries")
    private List<String> developedCountries;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAreaSqKm() {
        return areaSqKm;
    }

    public void setAreaSqKm(Long areaSqKm) {
        this.areaSqKm = areaSqKm;
    }

    public Long getPopulation() {
        return population;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }

    public Integer getCountries() {
        return countries;
    }

    public void setCountries(Integer countries) {
        this.countries = countries;
    }

    public List<String> getLines() {
        return lines;
    }

    public void setLines(List<String> lines) {
        this.lines = lines;
    }

    public List<String> getOceans() {
        return oceans;
    }

    public void setOceans(List<String> oceans) {
        this.oceans = oceans;
    }

    public List<String> getDevelopedCountries() {
        return developedCountries;
    }

    public void setDevelopedCountries(List<String> developedCountries) {
        this.developedCountries = developedCountries;
    }


}
