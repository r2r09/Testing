package com.FirstSpring.demoFirstS.example.c1;

import org.springframework.stereotype.Component;

@Component
public class MySQLdataService implements DataService {
    @Override
    public int[] retriveData() {
        return new int[] {1, 2, 3, 4, 5};
    }
}
