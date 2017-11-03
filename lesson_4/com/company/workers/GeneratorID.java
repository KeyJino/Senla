package com.company.workers;

import java.util.UUID;

public class GeneratorID {
    public String generateID(){
        String uniqueID = UUID.randomUUID().toString();
        return uniqueID;
    }
}
