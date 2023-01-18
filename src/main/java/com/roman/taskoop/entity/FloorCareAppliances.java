package com.roman.taskoop.entity;

public class FloorCareAppliances extends ElectricalAppliances {
private boolean isCordless;


    public FloorCareAppliances(String type, String brandName, String model, int price, int warrantyYears, int energyConsumption,
                               boolean isCordless) {
        super(type, brandName, model, price, warrantyYears, energyConsumption);
        this.isCordless = isCordless;
    }

    public boolean isCordless() {
        return isCordless;
    }
}
