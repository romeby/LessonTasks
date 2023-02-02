package com.roman.taskoop.service.sort.comparator;

import com.roman.taskoop.entity.ElectricalAppliance;

import java.util.Comparator;

public class PriceComparator implements Comparator<ElectricalAppliance> {
    @Override
    public int compare(ElectricalAppliance o1, ElectricalAppliance o2) {
        return (o1.getPrice() - o2.getPrice());
    }
}
