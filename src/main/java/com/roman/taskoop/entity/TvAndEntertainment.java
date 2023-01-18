package com.roman.taskoop.entity;

public class TvAndEntertainment extends ElectricalAppliances {
    private int screenSize;
    private String typeOfOS;
    private int soundPower;
    private String storageSize; //1TB, 500GB

    public TvAndEntertainment(String type, String brandName, String model, int price, int warrantyYears,
                              int energyConsumption, int screenSize, String typeOfOS, String storageSize) {
        super(type, brandName, model, price, warrantyYears, energyConsumption);
        this.screenSize = screenSize;
        this.typeOfOS = typeOfOS;
        this.storageSize = storageSize;
    }

    public TvAndEntertainment(String type, String brandName, String model, int price, int warrantyYears,
                              int energyConsumption, int soundPower) {
        super(type, brandName, model, price, warrantyYears, energyConsumption);
        this.soundPower = soundPower;
    }
    public TvAndEntertainment(String type, String brandName, String model, int price, int warrantyYears,
                              int energyConsumption, String storageSize) {
        super(type, brandName, model, price, warrantyYears, energyConsumption);
        this.storageSize = storageSize;
    }
}
