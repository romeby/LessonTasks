package com.roman.taskoop.service.filereader;

import com.roman.taskoop.entity.FloorCareAppliance;
import com.roman.taskoop.entity.KitchenAppliance;
import com.roman.taskoop.entity.LaundryAppliance;
import com.roman.taskoop.entity.TvAndEntertainment;

public interface ReadFromFile {
    FloorCareAppliance floorReader(String filename);
    KitchenAppliance kitchenReader(String filename);
    LaundryAppliance laundryReader(String filename);
    TvAndEntertainment entertainmentReader(String filename);
}
