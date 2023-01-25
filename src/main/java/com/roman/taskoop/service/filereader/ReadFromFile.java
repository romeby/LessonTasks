package com.roman.taskoop.service.filereader;

import com.roman.taskoop.entity.LaundryAppliance;

public interface ReadFromFile {
    LaundryAppliance floorReader(String filename);
    LaundryAppliance kitchenReader(String filename);
    LaundryAppliance laundryReader(String filename);
    LaundryAppliance entertainmentReader(String filename);
}
