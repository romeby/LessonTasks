package com.roman.taskoop.service.filereader.impl;

import com.roman.taskoop.entity.FloorCareAppliance;
import com.roman.taskoop.entity.KitchenAppliance;
import com.roman.taskoop.entity.LaundryAppliance;
import com.roman.taskoop.entity.TvAndEntertainment;
import com.roman.taskoop.service.filereader.ReadFromFile;

public class ReadFromFileImpl implements ReadFromFile {
    private static final String FILE_NAME = "data\\InputFile.txt";
    private static final String SEPARATOR = "\\s+";

    @Override
    public FloorCareAppliance floorReader(String filename) {
        return null;
    }

    @Override
    public KitchenAppliance kitchenReader(String filename) {
        return null;
    }

    @Override
    public LaundryAppliance laundryReader(String filename) {
        return null;
    }

    @Override
    public TvAndEntertainment entertainmentReader(String filename) {
        return null;
    }
}
