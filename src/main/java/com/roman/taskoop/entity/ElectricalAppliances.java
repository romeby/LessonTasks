package com.roman.taskoop.entity;

public class ElectricalAppliances {
    private String type;
    private String brandName;
    private String model;
    private int price;
    private int weight;
    private int warrantyYears;
    private int energyConsumption;



    public ElectricalAppliances(String type, String brandName, String model, int price, int warrantyYears, int energyConsumption) {
        this.type = type;
        this.brandName = brandName;
        this.model = model;
        this.price = price;
        this.warrantyYears = warrantyYears;
        this.energyConsumption = energyConsumption;
    }

    public ElectricalAppliances() {
        super();
    }

    public String getType() {
        return type;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWarrantyYears() {
        return warrantyYears;
    }

    public void setWarrantyYears(int warrantyYears) {
        this.warrantyYears = warrantyYears;
    }

    public int getEnergyConsumption() {
        return energyConsumption;
    }

    public void setEnergyConsumption(int energyConsumption) {
        this.energyConsumption = energyConsumption;
    }
}
