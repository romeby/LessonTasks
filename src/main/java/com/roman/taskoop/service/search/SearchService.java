package com.roman.taskoop.service.search;

import com.roman.taskoop.entity.ElectricalAppliance;

import java.util.List;

public interface SearchService {
    List<ElectricalAppliance> searchByMaxPrice(List<ElectricalAppliance> applianceList, int price);
}
