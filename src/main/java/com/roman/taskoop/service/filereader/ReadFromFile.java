package com.roman.taskoop.service.filereader;

import com.roman.taskoop.entity.FloorCareAppliance;
import com.roman.taskoop.entity.KitchenAppliance;
import com.roman.taskoop.entity.LaundryAppliance;
import com.roman.taskoop.entity.TvAndEntertainment;
import com.roman.taskoop.exception.CustomException;

public interface ReadFromFile {
    FloorCareAppliance floorReader(String filename) throws CustomException;
    KitchenAppliance kitchenReader(String filename) throws CustomException;
    LaundryAppliance laundryReader(String filename);
    TvAndEntertainment entertainmentReader(String filename);
}
