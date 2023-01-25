package com.roman.taskoop.entity;

import java.util.StringJoiner;

public class LaundryAppliance extends ElectricalAppliance {
private double loadCapacity;

    public LaundryAppliance() {
    }

    public LaundryAppliance(int applianceId, String type, String brandName, int price, int warrantyYears,
                            int energyConsumption, double loadCapacity) {
        super(applianceId, type, brandName, price, warrantyYears, energyConsumption);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LaundryAppliance that)) return false;
        if (!super.equals(o)) return false;

        return loadCapacity == that.loadCapacity;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(loadCapacity);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", LaundryAppliance.class.getSimpleName() + super.toString()
                                + "[", "]")
                .add("loadCapacity=" + loadCapacity)
                .toString();
    }
}
