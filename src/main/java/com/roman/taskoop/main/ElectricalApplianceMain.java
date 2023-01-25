package com.roman.taskoop.main;

import com.roman.taskoop.service.propertiesreader.AppliancePropertiesReader;
import com.roman.taskoop.service.propertiesreader.impl.AppliancePropertiesReaderImpl;

public class ElectricalApplianceMain {
    public static void main(String[] args) {
        AppliancePropertiesReader reader = new AppliancePropertiesReaderImpl();
        reader.readPropertiesFloorCare("data\\floorcare.properties");
    }
}
