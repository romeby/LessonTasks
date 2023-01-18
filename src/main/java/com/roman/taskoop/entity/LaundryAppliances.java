package com.roman.taskoop.entity;

public class LaundryAppliances extends ElectricalAppliances {
private int loadCapacity;

    public LaundryAppliances(String type, String brandName, String model, int price, int warrantyYears,
                             int energyConsumption, int loadCapacity) {
        super(type, brandName, model, price, warrantyYears, energyConsumption);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }
}
