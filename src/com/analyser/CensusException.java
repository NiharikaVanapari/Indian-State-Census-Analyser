package com.analyser;

import com.opencsv.bean.CsvBindByName;

public class CensusException extends Exception{

    enum ExceptionType {
        CENSUS_FILE_PROBLEM
    }

    ExceptionType type;

    public  CensusException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }

    public CensusException(String message, ExceptionType type, Throwable cause) {
        super(message, cause);
        this.type = type;
    }
}
