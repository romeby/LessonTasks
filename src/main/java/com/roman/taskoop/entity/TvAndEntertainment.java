package com.roman.taskoop.entity;

import java.util.StringJoiner;

public class TvAndEntertainment extends ElectricalAppliance {
    private double screenSize;
    private String typeOfOS;

    public TvAndEntertainment() {
    }

    public TvAndEntertainment(int applianceId, String type, String brandName, int price, int warrantyYears,
                              int energyConsumption, double screenSize, String typeOfOS) {
        super(applianceId, type, brandName, price, warrantyYears, energyConsumption);
        this.screenSize = screenSize;
        this.typeOfOS = typeOfOS;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public String getTypeOfOS() {
        return typeOfOS;
    }

    public void setTypeOfOS(String typeOfOS) {
        this.typeOfOS = typeOfOS;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TvAndEntertainment that)) return false;
        if (!super.equals(o)) return false;

        if (Double.compare(that.screenSize, screenSize) != 0) return false;
        return typeOfOS.equals(that.typeOfOS);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(screenSize);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + typeOfOS.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", TvAndEntertainment.class.getSimpleName() + super.toString()
                                + "[", "]")
                .add("screenSize=" + screenSize)
                .add("typeOfOS='" + typeOfOS + "'")
                .toString();
    }
}
