package com.analyser;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;

public class StateCSVReader {
    static CsvToBean<StateCSV> csvToBean = null;

    static Iterator<StateCSV> iterator = null;

    public static int loadCSVFile(String pathOfCSVfile) throws CensusException {
        try {
            Reader reader = Files.newBufferedReader(Paths.get(pathOfCSVfile));
            CsvToBeanBuilder<StateCSV> csvToBeanBuilder = new CsvToBeanBuilder<>(reader);
            csvToBeanBuilder.withType(StateCSV.class);
            csvToBeanBuilder.withIgnoreEmptyLine(true);
            CsvToBean<StateCSV> csvToBean = csvToBeanBuilder.build();
            Iterator<StateCSV> iterator = csvToBean.iterator();
            int numOfEntries = 0;
            while (iterator.hasNext()) {
                numOfEntries++;
                StateCSV data = iterator.next();
            }
            return numOfEntries;
        } catch (IOException e) {
            throw new CensusException(e.getMessage(),
                    CensusException.ExceptionType.CENSUS_FILE_PROBLEM);
        }
    }

}
