package com.roman.taskoop.service.search.impl;

import com.roman.taskoop.entity.ElectricalAppliance;
import com.roman.taskoop.service.search.SearchService;

import java.util.ArrayList;
import java.util.List;

public class SearchServiceImpl implements SearchService {
    @Override
    public List<ElectricalAppliance> searchByMaxPrice(List<ElectricalAppliance> applianceList, int price) {
        List<ElectricalAppliance> appliances = new ArrayList<>();
        for (int i = 0; i < applianceList.size(); i++) {
            if ((applianceList.get(i).getPrice() >= 0 && applianceList.get(i).getPrice() <= price) && !applianceList.isEmpty() && applianceList != null){
                appliances.add(applianceList.get(i));
            }
        }
        return appliances;
    }
}
