package com.roman.taskoop.entity;

import java.util.StringJoiner;

public class KitchenAppliance extends ElectricalAppliance {
    private boolean isIntegrated;

    public KitchenAppliance() {
    }

    public KitchenAppliance(int applianceId, String type, String brandName, int price, int warrantyYears,
                            int energyConsumption, boolean isIntegrated) {
        super(applianceId, type, brandName, price, warrantyYears, energyConsumption);
        this.isIntegrated = isIntegrated;
    }

    public boolean isIntegrated() {
        return isIntegrated;
    }

    public void setIntegrated(boolean integrated) {
        isIntegrated = integrated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        KitchenAppliance that = (KitchenAppliance) o;

        return isIntegrated == that.isIntegrated;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (isIntegrated ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", KitchenAppliance.class.getSimpleName() + super.toString()
                                + "[", "]")
                .add("isIntegrated=" + isIntegrated)
                .toString();
    }
}
