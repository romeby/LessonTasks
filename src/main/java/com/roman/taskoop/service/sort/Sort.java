package com.roman.taskoop.service.sort;

import com.roman.taskoop.entity.ElectricalAppliance;

import java.util.List;

public interface Sort {
    List<ElectricalAppliance> sortByEnergyConsumption(List<ElectricalAppliance> electricalAppliance);
    List<ElectricalAppliance> sortByPrice(List<ElectricalAppliance> electricalAppliance);
    List<ElectricalAppliance> sortByWeight(List<ElectricalAppliance> electricalAppliance);

}
