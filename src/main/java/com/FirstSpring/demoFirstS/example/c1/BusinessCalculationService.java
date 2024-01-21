package com.FirstSpring.demoFirstS.example.c1;

import org.springframework.stereotype.Component;

import javax.xml.crypto.Data;
import java.util.Arrays;

@Component
public class BusinessCalculationService {
    private DataService dataService;

    public BusinessCalculationService(DataService dataService){
        this.dataService = dataService;
    }
    public int FindMax(){
        return Arrays.stream(dataService.retriveData()).max().orElse(0);
    }
}
