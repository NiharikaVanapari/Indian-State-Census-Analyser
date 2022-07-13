package com.analyser;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;

public class ReadFromCSV {
    public static int loadCSVFile(String pathOfCSVfile) throws CensusException {
        try {
            Reader reader = Files.newBufferedReader(Paths.get(pathOfCSVfile));
            CsvToBeanBuilder<IndiaCenusCSV> csvToBeanBuilder = new CsvToBeanBuilder<>(reader);
            csvToBeanBuilder.withType(IndiaCenusCSV.class);
            csvToBeanBuilder.withIgnoreEmptyLine(true);
            CsvToBean<IndiaCenusCSV> csvToBean =csvToBeanBuilder.build();
            Iterator<IndiaCenusCSV> iterator =csvToBean.iterator();
            int numOfEntries = 0;
            while(iterator.hasNext()){
                numOfEntries++;
                IndiaCenusCSV data = iterator.next();
            }
            return numOfEntries;
        }
        catch (IOException e){
            throw new CensusException(e.getMessage(),
                    CensusException.ExceptionType.CENSUS_FILE_PROBLEM);
        }
    }
}
