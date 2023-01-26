package com.roman.taskoop.main;

import com.roman.taskoop.exception.CustomException;
import com.roman.taskoop.service.filereader.ReadFromFile;
import com.roman.taskoop.service.filereader.impl.ReadFromFileImpl;

public class ElectricalApplianceMain {
    public static void main(String[] args) throws CustomException {
//        AppliancePropertiesReader reader = new AppliancePropertiesReaderImpl();
//        reader.readPropertiesFloorCare("data\\floorcare.properties");
        ReadFromFile readFromFile = new ReadFromFileImpl();
        readFromFile.floorReader("data\\InputFile.txt");
    }
}
