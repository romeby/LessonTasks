package com.roman.taskoop.entity;

import com.roman.taskoop.idgenerator.IdGenerator;

import java.util.StringJoiner;

public abstract class ElectricalAppliance {
    private int applianceId = IdGenerator.generateNextId();
    private String type;
    private String brandName;
    private int price;
    private int weight;
    private int warrantyMonths;
    private int energyConsumption;



    public ElectricalAppliance(int applianceId, String type, String brandName, int price, int warrantyYears, int energyConsumption) {
        this.applianceId = applianceId;
        this.type = type;
        this.brandName = brandName;
        this.price = price;
        this.warrantyMonths = warrantyYears;
        this.energyConsumption = energyConsumption;
    }
    public ElectricalAppliance() {

    }
    public int getApplianceId() {
        return applianceId;
    }

    public void setApplianceId(int applianceId) {
        this.applianceId = applianceId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type != null && type.equals(Brand.values())) {
            this.type = type;
        } else {
            System.out.println("Brand not found!");
        }
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
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

    public int getWarrantyMonths() {
        return warrantyMonths;
    }

    public void setWarrantyMonths(int warrantyMonths) {
        this.warrantyMonths = warrantyMonths;
    }

    public int getEnergyConsumption() {
        return energyConsumption;
    }

    public void setEnergyConsumption(int energyConsumption) {
        this.energyConsumption = energyConsumption;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ElectricalAppliance that)) return false;

        if (applianceId != that.applianceId) return false;
        if (price != that.price) return false;
        if (weight != that.weight) return false;
        if (warrantyMonths != that.warrantyMonths) return false;
        if (energyConsumption != that.energyConsumption) return false;
        if (!type.equals(that.type)) return false;
        return brandName.equals(that.brandName);
    }

    @Override
    public int hashCode() {
        int result = applianceId;
        result = 31 * result + type.hashCode();
        result = 31 * result + brandName.hashCode();
        result = 31 * result + price;
        result = 31 * result + weight;
        result = 31 * result + warrantyMonths;
        result = 31 * result + energyConsumption;
        return result;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ElectricalAppliance.class.getSimpleName() + "[", "]")
                .add("applianceId=" + applianceId)
                .add("type='" + type + "'")
                .add("brandName='" + brandName + "'")
                .add("price=" + price)
                .add("weight=" + weight)
                .add("warrantyYears=" + warrantyMonths)
                .add("energyConsumption=" + energyConsumption)
                .toString();
    }
}
