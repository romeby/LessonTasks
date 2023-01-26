package com.roman.taskoop.service.propertiesreader.impl;

import com.roman.taskoop.entity.FloorCareAppliance;
import com.roman.taskoop.service.propertiesreader.AppliancePropertiesReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class AppliancePropertiesReaderImpl implements AppliancePropertiesReader {

    @Override
    public FloorCareAppliance readPropertiesFloorCare(String filename) {
        Properties properties = new Properties();
        FloorCareAppliance appliance = new FloorCareAppliance();
        try {
            FileReader fileReader = new FileReader(filename);
            properties.load(fileReader);
            System.out.println(properties.entrySet());
            appliance.getApplianceId();
            appliance.setType(properties.getProperty("type").toUpperCase());
            appliance.setBrandName(properties.getProperty("brand").toUpperCase());
            appliance.setPrice(Integer.parseInt(properties.getProperty("price")));
            appliance.setWeight(Integer.parseInt(properties.getProperty("weight")));
            appliance.setWarrantyMonths(Integer.parseInt(properties.getProperty("warranty")));
            appliance.setEnergyConsumption(Integer.parseInt(properties.getProperty("energyConsumption")));
            appliance.setCordless(Boolean.parseBoolean(properties.getProperty("cordless")));
            fileReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return appliance;
    }
}
