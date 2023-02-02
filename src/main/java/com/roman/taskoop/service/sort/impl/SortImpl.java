package com.roman.taskoop.service.sort.impl;

import com.roman.taskoop.entity.ElectricalAppliance;
import com.roman.taskoop.service.sort.Sort;
import com.roman.taskoop.service.sort.comparator.EnergyConsumptionComparator;
import com.roman.taskoop.service.sort.comparator.PriceComparator;
import com.roman.taskoop.service.sort.comparator.WarrantyComparator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortImpl implements Sort {
    static Logger logger = LogManager.getLogger();

    @Override
    public List<ElectricalAppliance> sortByEnergyConsumption(List<ElectricalAppliance> electricalAppliance) {
        List<ElectricalAppliance> applianceList = new ArrayList<>();
        for (int i = 0; i < electricalAppliance.size(); i++) {
            if (electricalAppliance.get(i).getEnergyConsumption() >= 0 && !electricalAppliance.isEmpty() && electricalAppliance != null){
                applianceList.add(electricalAppliance.get(i));
            }
        }
        Collections.sort(applianceList, new EnergyConsumptionComparator());
        return applianceList;
    }

    @Override
    public List<ElectricalAppliance> sortByPrice(List<ElectricalAppliance> electricalAppliance) {
        List<ElectricalAppliance> applianceList = new ArrayList<>();
        for (int i = 0; i < electricalAppliance.size(); i++) {
            if (electricalAppliance.get(i).getPrice() >= 0 && !electricalAppliance.isEmpty() && electricalAppliance != null){
                applianceList.add(electricalAppliance.get(i));
            }
        }
        Collections.sort(applianceList, new PriceComparator());
        return applianceList;
    }

    @Override
    public List<ElectricalAppliance> sortByWeight(List<ElectricalAppliance> electricalAppliance) {
        List<ElectricalAppliance> applianceList = new ArrayList<>();
        for (int i = 0; i < electricalAppliance.size(); i++) {
            if (electricalAppliance.get(i).getWarrantyMonths() >= 0 && !electricalAppliance.isEmpty() && electricalAppliance != null){
                applianceList.add(electricalAppliance.get(i));
            }
        }
        Collections.sort(applianceList, new WarrantyComparator());
        return applianceList;
    }
}
