package com.roman.task2.entity;

public enum FilmStudio {
    STAGE_DIRECTOR(12000,0),
    SCENARIO(950,0),
    MUSICIAN(1300,0),
    ACTORS(2000,0),
    ADVERTISMENT(500,0),
    MONTAGE(10000,0),
    EQUIPMENT(9000,0),
    LEASE_AND_TAX(800,1);

    private int priceForRent;
    private int amountOfRent;
    FilmStudio(int priceForRent, int amountOfRent) {
        this.priceForRent = priceForRent;
        setAmountOfRent(amountOfRent);
    }

    public int getPriceForRent() {
        return priceForRent;
    }

    public int getAmountOfRent() {
        return amountOfRent;
    }

    public void setAmountOfRent(int amountOfRent) {
        this.amountOfRent = amountOfRent;
    }
}
