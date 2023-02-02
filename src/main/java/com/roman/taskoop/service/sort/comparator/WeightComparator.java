package com.roman.taskoop.service.sort.comparator;

import com.roman.taskoop.entity.ElectricalAppliance;

import java.util.Comparator;

public class WeightComparator implements Comparator<ElectricalAppliance> {
    @Override
    public int compare(ElectricalAppliance o1, ElectricalAppliance o2) {
        return (o1.getWeight() - o2.getWeight());
    }
}
