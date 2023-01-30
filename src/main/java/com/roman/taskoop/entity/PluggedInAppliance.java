package com.roman.taskoop.entity;

import com.roman.taskoop.idgenerator.IdGenerator;

import java.util.List;

public class PluggedInAppliance {
    private int applianceId;
    private List<ElectricalAppliance> electricalApplianceList;

    public PluggedInAppliance(int applianceId, List<ElectricalAppliance> electricalApplianceList) {
        this.applianceId = IdGenerator.generateNextId();
        this.electricalApplianceList = electricalApplianceList;
    }

    public PluggedInAppliance() {
    }

    public int getApplianceId() {
        return applianceId;
    }

    public void setApplianceId(int applianceId) {
        this.applianceId = applianceId;
    }

    public List<ElectricalAppliance> getElectricalApplianceList() {
        return electricalApplianceList;
    }

    public void setElectricalApplianceList(List<ElectricalAppliance> electricalApplianceList) {
        this.electricalApplianceList = electricalApplianceList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PluggedInAppliance that)) return false;

        if (applianceId != that.applianceId) return false;
        return electricalApplianceList.equals(that.electricalApplianceList);
    }

    @Override
    public int hashCode() {
        int result = applianceId;
        result = 31 * result + electricalApplianceList.hashCode();
        return result;
    }
}
