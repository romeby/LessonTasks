package com.roman.taskoop.service.filereader.impl;

import com.roman.taskoop.entity.LaundryAppliance;
import com.roman.taskoop.service.filereader.ReadFromFile;

public class ReadFromFileImpl implements ReadFromFile {
    private static final String FILE_NAME = "//data/InputFile.txt";
    private static final String SEPARATOR = "\\s+";

    @Override
    public LaundryAppliance floorReader(String filename) {
        return null;
    }

    @Override
    public LaundryAppliance kitchenReader(String filename) {
        return null;
    }

    @Override
    public LaundryAppliance laundryReader(String filename) {
        return null;
    }

    @Override
    public LaundryAppliance entertainmentReader(String filename) {
        return null;
    }
}
