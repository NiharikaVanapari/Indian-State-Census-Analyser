package com.analyser;

import com.opencsv.bean.CsvBindByName;

public class StateCSV {
    @CsvBindByName(column = "SrNo" ,required = true)
    private String SrNo;
    @CsvBindByName(column = "State_Name" ,required = true)
    private String State_Name;
    @CsvBindByName(column = "TIN" ,required = true)
    private String TIN;
    @CsvBindByName(column = "StateCode" ,required = true)
    private String StateCode;

    public StateCSV(String srNo, String state_Name, String TIN, String stateCode) {
        SrNo = srNo;
        State_Name = state_Name;
        this.TIN = TIN;
        StateCode = stateCode;
    }

    @Override
    public String toString() {
        return "StateCSV{" +
                "SrNo='" + SrNo + '\'' +
                ", State_Name='" + State_Name + '\'' +
                ", TIN='" + TIN + '\'' +
                ", StateCode='" + StateCode + '\'' +
                '}';
    }

}
