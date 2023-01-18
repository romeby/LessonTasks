package com.roman.taskoop.entity;

public class KitchenAppliances extends ElectricalAppliances {
    private boolean isIntegrated;

    public KitchenAppliances(String type, String brandName, String model, int price, int warrantyYears,
                             int energyConsumption, boolean isIntegrated) {
        super(type, brandName, model, price, warrantyYears, energyConsumption);
        this.isIntegrated = isIntegrated;
    }

    public boolean isIntegrated() {
        return isIntegrated;
    }
}
