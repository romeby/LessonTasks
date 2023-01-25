package com.roman.taskoop.entity;

import java.util.StringJoiner;

public class FloorCareAppliance extends ElectricalAppliance {
private boolean isCordless;

    public FloorCareAppliance() {
    }

    public FloorCareAppliance(int applianceId, String type, String brandName, int price, int warrantyYears, int energyConsumption,
                              boolean isCordless) {
        super(applianceId, type, brandName, price, warrantyYears, energyConsumption);
        this.isCordless = isCordless;
    }
    public boolean isCordless() {
        return isCordless;
    }
    public void setCordless(boolean cordless) {
        isCordless = cordless;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        FloorCareAppliance that = (FloorCareAppliance) o;

        return isCordless == that.isCordless;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (isCordless ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", FloorCareAppliance.class.getSimpleName() + super.toString()
                                + "[", "]")
                .add("isCordless=" + isCordless)
                .toString();
    }
}
