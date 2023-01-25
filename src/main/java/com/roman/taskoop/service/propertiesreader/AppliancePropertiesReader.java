package com.roman.taskoop.service.propertiesreader;

import com.roman.taskoop.entity.FloorCareAppliance;

public interface AppliancePropertiesReader {
    FloorCareAppliance readPropertiesFloorCare(String filename);
//    void readPropertiesKitchen(String filename);
//    void readPropertiesLaundry(String filename);
//    void readPropertiesEntertainment(String filename);
}
