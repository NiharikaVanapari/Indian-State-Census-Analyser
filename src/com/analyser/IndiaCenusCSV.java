package com.analyser;

import com.opencsv.bean.CsvBindByName;

public class IndiaCenusCSV {
    @CsvBindByName(column = "State", required = true)
    private String state;
    @CsvBindByName(column = "Population", required = true)
    private String population;
    @CsvBindByName(column = "Area in square km", required = true)
    private String areaInSqKm;
    @CsvBindByName(column = "Density per square km", required = true)
    private String densityPerSqKm;

    public IndiaCenusCSV(String state, String population, String areaInSqKm, String densityPerSqKm) {
        this.state = state;
        this.population = population;
        this.areaInSqKm = areaInSqKm;
        this.densityPerSqKm = densityPerSqKm;
    }

    @Override
    public String toString() {
        return "IndiaCensusCSV{" +
                "state='" + state + '\'' +
                ", population='" + population + '\'' +
                ", areaInSqKm='" + areaInSqKm + '\'' +
                ", densityPerSqKm='" + densityPerSqKm + '\'' +
                '}';
    }
}
